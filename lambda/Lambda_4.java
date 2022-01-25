package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<>();
        words.add("REDMI");
        words.add("MOTOROLA");
        words.add("OPPO");
        words.add("VIVO");
        words.add("APPLE");
        words.add("SAMSUNG");
        
        words.removeIf(w-> w.length()%2!=0);
        words.forEach(System.out::println);
    

	}

}
