package com.collection;
import java.util.HashSet;
import java.util.Set;

public class Collection_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<String> m1=new HashSet<String>();
		
		m1.add("Redmi");
		m1.add("Samsung");
		m1.add("Apple");
		m1.add("Oppo");
		m1.add("Vivo");
		m1.add("Redmi"); //try to add Duplicate Values
		m1.add("Samsung");  //try to add Duplicate Values
		m1.add("Moto");
		m1.add("Oneplus");
        
		for(String s : m1)
		{
			System.out.println(s);
		}
	}

}
