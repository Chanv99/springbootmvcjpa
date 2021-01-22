package com.chango.springbootmvcjpa;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(public * com.chango.springbootmvcjpa.EmployeeController.getEmployees())")
	public void logBefore()
	{
		LOGGER.info("getEmployees method called from ascpect");
	}
	
	@After("execution(public * com.chango.springbootmvcjpa.EmployeeController.getEmployees())")
	public void logAfter()
	{
		LOGGER.info("getEmployees method called finally");
	}
	
	@AfterReturning("execution(public * com.chango.springbootmvcjpa.EmployeeController.getEmployees())")
	public void logAfterReturn()
	{
		LOGGER.info("getEmployees method called after successful return");
	}
	
	@AfterThrowing("execution(public * com.chango.springbootmvcjpa.EmployeeController.getEmployees())")
	public void logAfterThrow()
	{
		LOGGER.info("getEmployees method called after getting error");
	}
}
