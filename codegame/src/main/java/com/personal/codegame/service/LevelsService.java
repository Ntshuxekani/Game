package com.personal.codegame.service;

import com.personal.codegame.entity.Levels;

import java.util.List;

public interface LevelsService {

  List<Levels> getAllAppl();

  void saveAppl(Levels levels, Long id);
  void applUpDate(Long id, Levels levels);
  Levels getApplById(Long id);
  void  deleteAppl(Long id);

}

