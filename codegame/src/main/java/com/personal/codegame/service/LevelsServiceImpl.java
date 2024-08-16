package com.personal.codegame.service;


import com.personal.codegame.entity.Levels;
import com.personal.codegame.repository.LevelsRepository;
import com.personal.codegame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelsServiceImpl implements LevelsService{

  @Autowired
  LevelsRepository levelsRepository;

  @Autowired
  UserRepository userRepository;

  @Override
  public List<Levels> getAllAppl() {
    return levelsRepository.findAll();
  }

  @Override
  public void saveAppl(Levels levels, Long id) {

    User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid"));
    levelsRepository.save(levels);

  }

  @Override
  public void applUpDate(Long id, Levels levels) {

  }

  @Override
  public Levels getApplById(Long id) {
    return null;
  }

  @Override
  public void deleteAppl(Long id) {

  }

}
