package com.basic;
import java.util.*;
public class Result_declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double math,science,physics;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks in math= ");
		math=sc.nextDouble();
		System.out.println("Enter the marks in science= ");
		science=sc.nextDouble();
		System.out.println("Enter the marks in physics= ");
		physics=sc.nextDouble();
		
		if(math>=60 && science>=60 && physics>60)
		{
			System.out.println("Passed");
		}
		else if((math>60 && science>60) || (science>60 && physics>60) || (math>60 && physics>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}	
	}
}
