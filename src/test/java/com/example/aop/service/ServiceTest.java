package com.example.aop.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ServiceTest {

	@Autowired
	private Service1 service1;
	
	@Autowired
	private Service2 service2;
	
	@Test
	void test_logging() {
		service1.getSomething();
		service2.getSomething();
	}
}
