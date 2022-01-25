package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class replace implements UnaryOperator<String>
{
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class Lambda_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		s.add("");
		s.add("nokia");
		s.add("vivo");
		s.add("oppo");
		s.add("samsung");
		
		s.replaceAll(new replace());
		System.out.println(s);
	}

}
