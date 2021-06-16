package com.invimp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/transaction")
public class TransactionResources {
  @Inject
  TransactionService transactionService;

  @GET
  public Response transaction(User user) {
    return Response.ok(transactionService.doTransaction(user)).build();
  }
}
