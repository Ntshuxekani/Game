package com.personal.codegame.service;

import com.personal.codegame.auth.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  public void registerUser(User user) {
    // Implement registration logic here
  }

  public String authenticateUser(LoginRequest loginRequest) {
    // Authenticate user and generate JWT token
    String username = loginRequest.getUsername();
    // Perform authentication logic
    return jwtTokenProvider.generateToken(username);
  }
}
