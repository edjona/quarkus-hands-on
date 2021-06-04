package com.invimp;

import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopedBean {
  Logger logger = Logger.getLogger("App Scoped");

  @PostConstruct
  public void inform() {
    logger.info("Application scoped bean created");
  }

  public void justTriggering() {
    logger.info("Triggered!");
  }
}
