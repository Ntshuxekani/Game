package com.personal.codegame.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUserDto {

  private String email;

  private  String password;

}
