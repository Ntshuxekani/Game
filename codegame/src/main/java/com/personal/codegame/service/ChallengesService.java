package com.personal.codegame.service;

import com.personal.codegame.entity.Challenges;

import java.util.List;

public interface ChallengesService {

  List<Challenges> getAllAppl();

  void saveAppl(Challenges appliances, Long id);
  void applUpDate(Long id, Challenges challenges);
  Challenges getApplById(Long id);
  void  deleteAppl(Long id);

}

