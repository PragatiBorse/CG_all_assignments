package com.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class QuestionMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("QueColl.xml");
		
		Question q=(Question) context.getBean("que");
		q.showAnswer();

	}

}
