package com.invimp;

import lombok.Data;

import javax.enterprise.inject.Model;

@Data
@Model
public class User {
  private String userName;
  private String password;
}
