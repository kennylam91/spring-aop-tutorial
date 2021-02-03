package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

	
	private static final Logger logger = LoggerFactory.getLogger(UserAccessAspect.class);
	
	@Before(value = "execution(* com.example.aop.dao.*.*(..)) ")
	public void before(JoinPoint joinPoint) {
		//Advice
		logger.info("before execution of {}", joinPoint);
	}
	
	@AfterReturning(value = "execution(* com.example.aop.dao.*.*(..)) ", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		//Advice
		logger.info("{} returned with value {}", joinPoint, result);
	}

	@After(value = "execution(* com.example.aop.dao.*.*(..)) ")
	public void after(JoinPoint joinPoint) {
		//Advice
		logger.info("after execution of {}", joinPoint);
	}
}
