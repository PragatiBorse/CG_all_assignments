package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambda_5_firstletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> b = Arrays.asList("Pragati", "Pooja", "Roshani", "Shubhangi", "Mamta"); 
		Consumer<String> consumerString=s1->System.out.println(s1);
		b.stream()
		       .map(s1 ->s1.substring(0, 1)) 
		       .forEach(s1 ->System.out.println(s1)); 
	}

}
