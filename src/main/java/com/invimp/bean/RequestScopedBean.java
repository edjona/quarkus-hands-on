package com.invimp.bean;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScopedBean {
  public String getRequestInformation() {
    return "Hello i am request scoped, i am unique per request, here my code on JVM " + this.hashCode();
  }
}
