package com.invimp;

import io.quarkus.runtime.Quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/something")
@Produces(MediaType.TEXT_PLAIN)
public class SomethingResource {
  @Inject
  Something something;

  @GET
  public String getSomething() {
    something.doSomething();
    Quarkus.asyncExit();
    return "See the log";
  }
}
