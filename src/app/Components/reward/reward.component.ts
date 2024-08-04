import { Component, OnInit } from '@angular/core';

interface Reward {
  name: string;
  description: string;
  dateEarned: Date;
}

@Component({
  selector: 'app-reward',
  templateUrl: './reward.component.html',
  styleUrls: ['./reward.component.css']
})
export class RewardComponent implements OnInit {
  rewards: Reward[] = [
    { name: 'Master of Variables', description: 'Completed the Variables and Data Types challenge.', dateEarned: new Date('2024-08-01') },
    { name: 'Loop Master', description: 'Completed the Loops challenge.', dateEarned: new Date('2024-08-02') },
    // Add more rewards as needed
  ];

  ngOnInit(): void {
    console.log('Rewards loaded:', this.rewards);
  }
}

