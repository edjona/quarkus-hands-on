package com.invimp.bean;

import javax.enterprise.context.Dependent;

@Dependent
public class DependentScopedBean {
  public String getDependentInformation() {
    return "I am dependent to my parent, here my JVM code " + this.hashCode();
  }
}
