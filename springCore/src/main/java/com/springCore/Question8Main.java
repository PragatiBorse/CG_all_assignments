package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ap=new ClassPathXmlApplicationContext("Spring8.xml");
		
		((AbstractApplicationContext) ap).close();

	}

}
