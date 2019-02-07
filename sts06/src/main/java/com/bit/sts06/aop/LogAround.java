package com.bit.sts06.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAround implements MethodInterceptor {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		log.debug("AOP around before...");
		Object obj=invocation.proceed();
		log.debug("AOP around after...");
		
		return obj;
	}

}
