import { CanActivateFn } from '@angular/router';

export const loginGuard: CanActivateFn = (route, state) => {
  // Example login check; replace with real authentication logic
  const isLoggedIn = !!localStorage.getItem('token');
  return isLoggedIn;
};
