package com.example.aop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.aop.dao.Dao2;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

	@Autowired
	private Dao2 dao2;
	
	public String getSomething() {
		return dao2.retrieveSomething();
	}
	
}
