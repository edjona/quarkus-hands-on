package com.invimp;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionService {

  @Secure
  public User doTransaction(User user) {
    return user;
  }
}
