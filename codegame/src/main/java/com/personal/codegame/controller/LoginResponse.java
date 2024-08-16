package com.personal.codegame.controller;

import lombok.Data;

@Data
public class LoginResponse {

  private String token;
  private Long expiresIn;

  public  String getToken(){
    return token;
  }
}
