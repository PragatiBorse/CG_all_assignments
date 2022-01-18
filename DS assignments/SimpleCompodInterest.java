package com.basic;
import java.util.*;
public class SimpleCompodInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount, years, rate,simpleInterest, compoundInterest;
		 
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("Enter the amount=");
		amount=scanner.nextDouble();
		System.out.println("Enter the rate of interest=");
		rate=scanner.nextDouble();
		System.out.println("Enter no. of years=");
		years=scanner.nextDouble();
		
		simpleInterest=(amount*rate*years)/100;
		compoundInterest=amount*Math.pow(1+rate/100, years)-amount;
		
		System.out.println("simple interest is=" +simpleInterest);
		System.out.println("compound interest is=" +compoundInterest);
		
		

	}

}
