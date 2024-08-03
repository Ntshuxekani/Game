import { Component, OnInit } from '@angular/core';

interface Level {
  id: number;
  name: string;
  description: string;
}

@Component({
  selector: 'app-level',
  templateUrl: './level.component.html',
  styleUrls: ['./level.component.css']
})
export class LevelComponent implements OnInit {
  levels: Level[] = [
    { id: 1, name: 'Introduction to Programming', description: 'Learn the basics of programming.' },
    { id: 2, name: 'Frontend Basics', description: 'Get started with Angular.' },
    { id: 3, name: 'Backend Development', description: 'Learn backend development with Java.' },
    { id: 4, name: 'Database Integration', description: 'Interact with a Postgres database.' },
    { id: 5, name: 'Full-Stack Application', description: 'Build a complete full-stack application.' }
  ];

  constructor() { }

  ngOnInit(): void {
  }
}

