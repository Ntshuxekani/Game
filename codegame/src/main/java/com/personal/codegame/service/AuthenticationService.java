package com.personal.codegame.service;


import com.personal.codegame.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  private final AuthenticationManager authenticationManager;

  public User signup(RegisterUserDto input) {
    User user = new User();
    user.setFullName(input.getFullName());
    user.setEmail(input.getEmail());
    user.setPassword(passwordEncoder.encode(input.getPassword()));
    return userRepository.save(user);
  }

  public User authenticate(LoginUserDto input) {
    //TODO: Handles the process of verifying user credentials
    Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(input.getEmail(), input.getPassword()));

    return userRepository.findByEmail(input.getEmail()).orElseThrow();
  }
}
