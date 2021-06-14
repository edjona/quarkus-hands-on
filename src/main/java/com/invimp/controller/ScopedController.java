package com.invimp.controller;

import com.invimp.bean.ApplicationScopedBean;
import com.invimp.bean.DependentScopedBean;
import com.invimp.bean.RequestScopedBean;
import com.invimp.bean.SessionScopedBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/scoped")
@Produces(value = MediaType.TEXT_PLAIN)
@RequestScoped
public class ScopedController {
  final RequestScopedBean requestScopedBean;
  final SessionScopedBean sessionScopedBean;
  final ApplicationScopedBean applicationScopedBean;
  final DependentScopedBean dependentScopedBean;
  int count = 0;

  @Inject
  public ScopedController(RequestScopedBean requestScopedBean, SessionScopedBean sessionScopedBean, ApplicationScopedBean applicationScopedBean, DependentScopedBean dependentScopedBean) {
    this.requestScopedBean = requestScopedBean;
    this.sessionScopedBean = sessionScopedBean;
    this.applicationScopedBean = applicationScopedBean;
    this.dependentScopedBean = dependentScopedBean;
  }

  @GET
  @Path("/request")
  public String getRequestScoped() {
    return requestScopedBean.getRequestInformation();
  }

  @GET
  @Path("/session")
  public String getSessionScoped() {
    return sessionScopedBean.getSessionInformation();
  }

  @GET
  @Path("/application")
  public String getApplicationScoped() {
    return applicationScopedBean.getApplicationInformation();
  }

  @GET
  @Path("/dependent")
  public String getDependentInformation() {
    return dependentScopedBean.getDependentInformation();
  }

  @GET
  @Path("/counting")
  public int getCount() {
    return count++;
  }
}
