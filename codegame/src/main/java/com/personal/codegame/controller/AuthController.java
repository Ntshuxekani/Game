package com.personal.codegame.controller;

import com.personal.codegame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody User user) {
    if (userService.findByUsername(user.getUsername()) != null) {
      return ResponseEntity.badRequest().body("Username is already taken!");
    }
    return ResponseEntity.ok(userService.save(user));
  }

  @PostMapping("/login")
  public ResponseEntity<?> loginUser(@RequestBody User user) {
    User foundUser = userService.findByUsername(user.getUsername());
    if (foundUser == null || !foundUser.getPassword().equals(user.getPassword())) {
      return ResponseEntity.badRequest().body("Invalid credentials!");
    }
    return ResponseEntity.ok(foundUser);
  }
}
