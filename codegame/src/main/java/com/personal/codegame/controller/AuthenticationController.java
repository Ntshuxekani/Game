package com.personal.codegame.controller;

import com.personal.codegame.service.AuthenticationService;
import com.personal.codegame.service.JwtService;
import com.personal.codegame.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200/**", allowCredentials = "true")
@RestController
public class AuthenticationController {

  private final JwtService jwtService;
  private final UserService userService;
  private final AuthenticationService authenticationService;

  public AuthenticationController(JwtService jwtService,AuthenticationService authenticationService,UserService userService){
    this.authenticationService = authenticationService;
    this.userService = userService;
    this.jwtService = jwtService;
  }

  @PostMapping("/signup")
  public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto){
    User registerUser = authenticationService.signup(registerUserDto);
    return  ResponseEntity.ok(registerUser);
  }

  @PostMapping("/login")
  public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto){
    User authenticatedUser = authenticationService.authenticate(loginUserDto);

    String jwtToken = jwtService.generateToken(authenticatedUser);

    LoginResponse loginResponse = new LoginResponse();
    loginResponse.setToken(jwtToken);
    loginResponse.setExpiresIn(jwtService.getExpirationTime());

    return ResponseEntity.ok(loginResponse);

  }



}
