import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { LevelComponent } from './Components/level/level.component';
import { ChallengeComponent } from './Components/challenge/challenge.component';
import { RewardComponent } from './Components/reward/reward.component';
import { InstructionsComponent } from './instructions/instructions.component';
import { DebugComponent } from './Components/debug/debug.component';
import { RegisterComponent } from './Components/register/register.component';
import { LoginComponent } from './Components/login/login.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'levels', component: LevelComponent },
  { path: 'challenge/:id', component: ChallengeComponent },
  { path: 'rewards', component: RewardComponent },
  { path: 'debug', component: DebugComponent },
  { path: 'instructions', component: InstructionsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
