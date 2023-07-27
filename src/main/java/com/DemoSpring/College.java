package com.DemoSpring;

import org.springframework.stereotype.Component;

@Component
public class College {
	private String  collegeName="SV University";
	
	public void printCollegeName() {
		System.out.println("College Name is :"+collegeName);
	}

}
