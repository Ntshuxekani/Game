import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

interface Challenge {
  id: number;
  name: string;
  description: string;
  hint: string;
}

@Component({
  selector: 'app-challenge',
  templateUrl: './challenge.component.html',
  styleUrls: ['./challenge.component.scss']
})
export class ChallengeComponent implements OnInit {
  challenge: Challenge | null = null;
  code: string = '';
  output: string = '';
  hintVisible: boolean = false;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    const id = +this.route.snapshot.paramMap.get('id')!;
    this.challenge = this.getChallengeById(id);
  }

  getChallengeById(id: number): Challenge | null {
    const challenges: Challenge[] = [
      { id: 1, name: 'Variables and Data Types', description: 'Learn about variables and data types.', hint: 'Use let or const to declare variables.' },
      { id: 2, name: 'Loops', description: 'Learn about loops.', hint: 'Use for or while to create loops.' },
      // Add more challenges as needed
    ];
    return challenges.find(challenge => challenge.id === id) || null;
  }

  runCode(): void {
    this.output = `Executing: ${this.code}`;
  }

  showHint(): void {
    this.hintVisible = true;
  }
}
