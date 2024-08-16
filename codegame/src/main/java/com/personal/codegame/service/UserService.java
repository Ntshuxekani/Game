package com.personal.codegame.service;

import com.personal.codegame.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  //Constructor
  public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  public User addApp(User user){

    return  userRepository.save(user);
  }


  public List<User> allUsers(){
    List<User> users = new ArrayList<>();
    //TODO:Retrieve all user records from a repository and add them to users.
    userRepository.findAll().forEach(users::add);

    return users;
  }



}
