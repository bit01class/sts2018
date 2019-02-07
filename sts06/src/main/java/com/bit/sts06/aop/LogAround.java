package com.bit.sts06.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAround implements MethodInterceptor {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		log.debug("AOP around before...");
		log.debug(invocation.getMethod().getName());
		log.debug(Arrays.toString(invocation.getArguments()));
		log.debug(invocation.getThis().toString());
		Object obj=null;
		try {
			obj=invocation.proceed();
		}catch (Exception e) {
			log.debug("AOP around exception...");
		}
		log.debug("AOP around after..."+obj);
		
		return obj;
	}

}













