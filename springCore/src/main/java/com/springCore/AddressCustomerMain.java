package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressCustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("acbean.xml");
		Customer customer=(Customer) context.getBean("customer");
		System.out.println(customer);
		customer.display();
		
	}

}
