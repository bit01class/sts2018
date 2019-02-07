package com.bit.sts06.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectjBefore {
	Logger log=LoggerFactory.getLogger(this.getClass());

	public void jBefore(JoinPoint joinPoint) {
		log.debug("j before..."+joinPoint.getSignature().getName());
		log.debug("j before..."+joinPoint.getArgs());
		log.debug("j before..."+joinPoint.getTarget());
	}
}
