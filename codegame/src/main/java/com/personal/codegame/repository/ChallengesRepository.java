package com.personal.codegame.repository;

import com.personal.codegame.entity.Challenges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ChallengesRepository extends JpaRepository<Challenges,Long> {
}
