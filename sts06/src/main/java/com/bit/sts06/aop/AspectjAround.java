package com.bit.sts06.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectjAround {
	Logger log = LoggerFactory.getLogger(this.getClass());

	public Object jAround(ProceedingJoinPoint joinPoint) {
		Object obj=null;
		
		log.debug("aspectj around before...");
		try {
			obj=joinPoint.proceed();
		} catch (Throwable e) {
			log.debug("aspectj around throw...");
		}
		log.debug("aspectj around after..."+obj);
		return obj;
	}
}















