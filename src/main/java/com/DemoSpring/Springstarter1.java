package com.DemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springstarter1 {
	public static void main(String[] args) {
		SpringApplication spring = new SpringApplication(Springstarter1.class);
		ConfigurableApplicationContext context=spring.run();
		College clgObj=context.getBean(College.class);
		System.out.println("college object created by spring bean"+clgObj);
		clgObj.printCollegeName();
	}

//	@Bean
	public College colgObj() {
		return new College();
		
	}

}
