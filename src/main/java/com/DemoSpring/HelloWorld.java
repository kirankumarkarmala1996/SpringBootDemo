package com.DemoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String helloWorldApp() {

		return "helloWorld welcome to spring boot Application";
	}

}
