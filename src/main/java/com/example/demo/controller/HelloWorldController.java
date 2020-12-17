package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloController")
public class HelloWorldController {

	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "Hello From Sreekar!!";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + "!!";
	}
	
	@GetMapping("/path/{name}")
	public String sayHelloPath(@PathVariable String name) {
		return "Hello " + name + "!!"; 
	}
}
