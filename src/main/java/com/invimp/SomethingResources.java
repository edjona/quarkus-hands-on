package com.invimp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/something")
public class SomethingResources {

  @Inject
  List<Student> studentNames;

  @GET
  public Response getResponse() {
    return Response.ok(studentNames).build();
  }
}
