package com.invimp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/call")
@Produces(value = MediaType.TEXT_PLAIN)
public class SomethingResources {
  @Inject
  SingletonBean singletonBean;

  @Inject
  ApplicationScopedBean applicationScopedBean;

  @GET
  @Path("/nothing")
  public Response callNothing() {
    return Response.ok("See the log").build();
  }

  @GET
  @Path("/something")
  public Response getSomething() {
    applicationScopedBean.justTriggering();
    return Response.ok("See the log").build();
  }

}
