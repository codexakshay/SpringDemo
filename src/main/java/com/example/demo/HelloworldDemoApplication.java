package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;


@SpringBootApplication
public class HelloworldDemoApplication {

	public static void main(String[] args) {
		System.out.println("****WELCOME TO SPRING CONCEPT DEMO******");
		ApplicationContext context = SpringApplication.run(HelloworldDemoApplication.class, args);
		System.out.println("Checking context:" + context.getBean(DemoBean.class));
	}
}
