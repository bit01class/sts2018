package com.bit.sts06.aop;

import org.springframework.aop.ThrowsAdvice;

public class LogThrow implements ThrowsAdvice{
	
	public void afterThrowing(Exception ex) {
		System.out.println("LogThrow afterThrowing..."+ex.getMessage());
	}

}
