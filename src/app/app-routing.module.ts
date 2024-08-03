import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { LevelComponent } from './Components/level/level.component';
import { ChallengeComponent } from './Components/challenge/challenge.component';
import { RewardComponent } from './Components/reward/reward.component';
import { DebugComponent } from './Components/debug/debug.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'levels', component: LevelComponent },
  { path: 'challenge/:id', component: ChallengeComponent },
  { path: 'rewards', component: RewardComponent },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
