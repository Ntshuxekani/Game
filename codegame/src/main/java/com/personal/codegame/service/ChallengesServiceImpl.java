package com.personal.codegame.service;

import com.personal.codegame.entity.Challenges;
import com.personal.codegame.repository.ChallengesRepository;
import com.personal.codegame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengesServiceImpl implements ChallengesService {

  @Autowired
  ChallengesRepository challengesRepository;

  @Autowired
  UserRepository userRepository;

  @Override
  public List<Challenges> getAllAppl() {
    return challengesRepository.findAll();
  }

  @Override
  public void saveAppl(Challenges challenges, Long id) {

    User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid"));
    challengesRepository.save(challenges);

  }

  @Override
  public void applUpDate(Long id, Challenges challenges) {

  }

  @Override
  public Challenges getApplById(Long id) {
    return null;
  }

  @Override
  public void deleteAppl(Long id) {

  }
}
