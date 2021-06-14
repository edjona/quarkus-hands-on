package com.invimp.bean;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import java.io.Serializable;

@SessionScoped
public class SessionScopedBean implements Serializable {
  @Default
  public String getSessionInformation() {
    return "Hello i am session scoped, i am unique per request, here my code on JVM " + this.hashCode();
  }
}
