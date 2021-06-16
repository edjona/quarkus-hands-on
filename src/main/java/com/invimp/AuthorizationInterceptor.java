package com.invimp;

import org.jboss.logmanager.Logger;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Secure
@Interceptor
@Priority(1)
public class AuthorizationInterceptor {
  Logger logger = Logger.getLogger(this.getClass().getSimpleName());

  @AroundInvoke
  public Object authorize(InvocationContext invocationContext) throws Exception {
    User user = (User) invocationContext.proceed();
    if (!user.getPassword().equals("p@ssw0rd")) {
      logger.info("Wrong password");
      return null;
    }
    return user;
  }
}
