package com.invimp;

import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class SingletonBean {
  Logger logger = Logger.getLogger("Singleton");

  @PostConstruct
  public void inform() {
    logger.info("Singleton bean created");
  }
}
