package com.invimp;

import com.invimp.model.Living;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/living")
public class SomethingResource {
  @Inject
  Living living;

  @GET
  public String getLiving() {
    return "This is " + living.getClass().getSimpleName();
  }
}
