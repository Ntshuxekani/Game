import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  logout() {
    throw new Error('Method not implemented.');
  }

  private loggedInStatus = false;

  constructor(private http: HttpClient) { }

  login(user: any): Observable<any> {
    return this.http.post('/api/login', user).pipe(
      tap(response => {
        this.loggedInStatus = true;
      })
    );
  }

  register(user: any): Observable<any> {
    return this.http.post('/api/register', user).pipe(
      tap(response => {
        this.loggedInStatus = true;
      })
    );
  }

  isLoggedIn(): boolean {
    return this.loggedInStatus;
  }
}



