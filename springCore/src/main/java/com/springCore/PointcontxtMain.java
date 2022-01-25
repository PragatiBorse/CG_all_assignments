package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointcontxtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("contxtpoint.xml");
		ContextAware c=(ContextAware) context.getBean("ca");
		
		c.draw();

	}

}
