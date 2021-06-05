package com.invimp.controller;

import com.invimp.repository.DataRepository;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/data")
@SuppressWarnings("squid:S112")
public class DataController {
  @Inject
  DataRepository dataRepository;

  Logger logger = Logger.getLogger(this.getClass().getName());

  @GET
  @Path("/withRetry")
  @Produces(MediaType.APPLICATION_JSON)
  @Retry(maxRetries = 5, delay = 1000L)
  public Response getDataWithRetry() {
    var fail = new Random().nextBoolean();

    if (fail) {
      logger.warn("Attempt to connecting to database...");
      throw new RuntimeException("Cannot connect to database");
    }

    return Response.ok(dataRepository.getData()).build();
  }

  @GET
  @Path("/withTimeout")
  @Produces(MediaType.APPLICATION_JSON)
  @Timeout(value = 2000L)
  public Response getDataWithTimeout() throws InterruptedException {
    var tooLong = new Random().nextBoolean();

    if (tooLong) {
      Thread.sleep(3000L);
    }

    return Response.ok(dataRepository.getData()).build();
  }
}
