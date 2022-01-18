package com.generics;

//case a:HashMap application for key=string,value=string
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Demo {
	public static void demo()
	{
		System.out.println("Senario a : Only taking key as String and value as String");
		HashMap<String ,String>map=new HashMap<>();
		map.put("01", "Hello");
		map.put("02", "World");
		for(Map.Entry m:map.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
	}
}

//case b. key=string value=date
public class example {
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.demo();
		System.out.println("\nSenario b : Only taking key as String and value as Date");
		HashMap<String ,Date>map=new HashMap<>();
		map.put("Today is", new java.util.Date());
		System.out.println(map);	
	}
}




