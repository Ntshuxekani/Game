import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

interface Level {
  id: number;
  name: string;
  description: string;
}

@Component({
  selector: 'app-level',
  templateUrl: './level.component.html',
  styleUrls: ['./level.component.scss']
})
export class LevelComponent implements OnInit {
  levels: Level[] = [
    { id: 1, name: 'Variables and Data Types', description: 'Learn about variables and data types.' },
    { id: 2, name: 'Loops', description: 'Learn about loops.' },
    // Add more levels as needed
  ];

  constructor(private router: Router) { }

  ngOnInit(): void {
    console.log('Levels loaded:', this.levels);
  }

  logNavigation(levelId: number): void {
    console.log('Navigating to level:', levelId);
  }
}






