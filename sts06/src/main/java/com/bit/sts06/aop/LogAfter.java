package com.bit.sts06.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfter implements AfterReturningAdvice {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		log.debug("AOP after...");
		log.debug(returnValue+"");
		log.debug(method.getName());
		log.debug(Arrays.toString(args));
		log.debug(".......................................");
	}

}
