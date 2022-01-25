package com.lambda;

import java.util.Scanner;

interface Arithmetic{
	int operation(int a,int b);
}
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:1:Add   2:Subtract  3:Multiply  4:divide");
		int num=sc.nextInt();
		System.out.println("Enter Two Numbers:1");
		int p=sc.nextInt();
		int q=sc.nextInt();
		switch(num)
		{
		case 1:
			Arithmetic add= (int x,int y)-> p+q;
			int addition= add.operation(p, q);
			System.out.println("Addition is:"+addition);
		case 2:
			Arithmetic subtract=(int x,int y)->p-q;
			int substraction=subtract.operation(p, q);
			System.out.println( "substraction is:"+substraction);
			
		case 3:
			Arithmetic multiply= (int x,int y)->p*q;
			int multiplication=multiply.operation(p, q);
			System.out.println("multiplication is:"+multiplication);
			
		case 4:
			Arithmetic divide= (int x,int y)->p/q;
			int division=divide.operation(p, q);
			System.out.println("division is:"+division);
		}	
		

	}

}
