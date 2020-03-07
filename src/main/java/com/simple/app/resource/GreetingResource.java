package com.simple.app.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingResource {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hey there...";
	}
}
