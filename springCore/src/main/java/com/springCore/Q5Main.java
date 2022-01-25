package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("Spring5.xml");
		
		Question5 demo=(Question5) con.getBean("msg1");
		System.out.println(demo.getMsgID()+" "+demo.getMsg() );

	}

}
