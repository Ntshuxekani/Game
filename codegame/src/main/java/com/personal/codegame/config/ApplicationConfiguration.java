package com.personal.codegame.config;


import com.personal.codegame.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
public class ApplicationConfiguration {

  private final UserRepository userRepository;

  public ApplicationConfiguration(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Bean
    //TODO: To retrieve the user using the UserRepository that is injected
  UserDetailsService userDetailsService() {
    return username -> userRepository.findByEmail(username)
      .orElseThrow(() -> new UsernameNotFoundException("User not Found"));
  }

  @Bean //TODO:To encode the plain user password
  BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean //TODO:Sets the new strategy to perform the authentication
    //You will not see the password generated in the console as before.This successfully overridden the authentication method.
  AuthenticationProvider authenticationProvider(){
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService());
    authProvider.setPasswordEncoder(passwordEncoder());

    return authProvider;

  }

}
