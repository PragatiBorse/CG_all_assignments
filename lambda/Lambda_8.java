package com.lambda;
import java.util.ArrayList;

import java.util.List;

public class Lambda_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<Integer>(){{
            add(11);
            add(22);
            add(33);
            add(44);
            add(55);
            add(66);
            add(77);
            add(88);
            add(99);
        }};
        
        Thread lambda = new Thread(()->System.out.println(num));
        lambda.run();
	}
}


