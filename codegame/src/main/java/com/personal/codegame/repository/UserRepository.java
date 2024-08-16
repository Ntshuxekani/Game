package com.personal.codegame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
  Optional<User> findById(@Param("id")Long id);

}
