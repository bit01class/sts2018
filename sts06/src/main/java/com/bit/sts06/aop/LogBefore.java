package com.bit.sts06.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		log.debug("AOP before...");
		log.debug(method.getName());
		log.debug(Arrays.toString(args));
		log.debug(target.toString());
		log.debug("..................................................");
	}

}










