package com.personal.codegame.controller;

import com.personal.codegame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class LevelsControllers {

  @Autowired
  private ApplService applService;

  @Autowired
  AppRepo appRepo;

  @Autowired
  UserRepository userRepository;

  @GetMapping
  public List<Appliances> getAllAppls(){
    return applService.getAllAppl();
  }

  @PostMapping
  public void createOrgProfile(@RequestBody Appliances appliances, @RequestParam Long id) {

    User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found"));




    // Associate the product with the user
    appliances.setUser(user);


    applService.saveAppl(appliances, id);
  }



}

