package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question9Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("SpringQ9.xml");
		((AbstractApplicationContext) ap).close();

	}

}
