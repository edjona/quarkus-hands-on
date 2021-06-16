package com.invimp;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logmanager.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class Something {
  Logger logger = Logger.getLogger("Something");

  void onStart(@Observes StartupEvent ev) {
    logger.info("The application is starting...");
  }

  @PostConstruct
  void init() {
    logger.info("doing post construct");
  }

  @PreDestroy
  void destroy() {
    logger.info("doing pre destroy");
  }

  void doSomething() {
    logger.info("invoke method");
  }

  void onStop(@Observes ShutdownEvent ev) {
    logger.info("The application is stopping...");
  }
}
