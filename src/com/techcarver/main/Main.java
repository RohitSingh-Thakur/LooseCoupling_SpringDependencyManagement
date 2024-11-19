package com.techcarver.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");
		Student student = context.getBean("studentObj", Student.class);
		student.cheating();
	}
}
