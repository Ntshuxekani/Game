package com.personal.codegame.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterUserDto {

  private  String email;

  private String password;

  private String fullName;


}
