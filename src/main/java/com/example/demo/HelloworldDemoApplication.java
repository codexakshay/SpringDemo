package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;


@SpringBootApplication
public class HelloworldDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloworldDemoApplication.class);

	public static void main(String[] args) {
		System.out.println("****WELCOME TO SPRING CONCEPT DEMO******");
		ApplicationContext context = SpringApplication.run(HelloworldDemoApplication.class, args);
		logger.debug("Checking Context: {}",context.getBean(DemoBean.class));
		logger.debug("\n****** Example Using @Autowire annotation on property *****");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
