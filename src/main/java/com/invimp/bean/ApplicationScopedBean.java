package com.invimp.bean;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopedBean {
  public String getApplicationInformation() {
    return "Here my code on JVM " + this.hashCode() + ", try to refresh me but i am still here.";
  }
}
