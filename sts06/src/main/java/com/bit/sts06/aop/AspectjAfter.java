package com.bit.sts06.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectjAfter {
	Logger log=LoggerFactory.getLogger(this.getClass());

	public void jAfter(JoinPoint joinPoint) {
		log.debug("aspectj after...");
	}
}
