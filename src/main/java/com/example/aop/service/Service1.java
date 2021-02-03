package com.example.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.dao.Dao1;

@Service
public class Service1 {
	
	
	private static final Logger logger = LoggerFactory.getLogger(Service1.class);

	
	@Autowired
	private Dao1 dao1;

	public String getSomething() {
		logger.info("Log by normal way: dao1 ");
		return dao1.retrieveSomething();
	}
}
