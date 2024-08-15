import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { LevelComponent } from './Components/level/level.component';
import { ChallengeComponent } from './Components/challenge/challenge.component';
import { RewardComponent } from './Components/reward/reward.component';

import { DebugComponent } from './Components/debug/debug.component';
import { RegisterComponent } from './Components/register/register.component';
import { LoginComponent } from './Components/login/login.component';
import { InstructionsComponent } from './Components/instructions/instructions.component';
import { AuthGuard } from './Components/guards/auth-guard.guard';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'level', component: LevelComponent, canActivate: [AuthGuard] },
  { path: 'challenge/:id', component: ChallengeComponent, canActivate: [AuthGuard]},
  { path: 'instructions', component: InstructionsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
