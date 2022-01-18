package com.basic;
import java.util.*;
public class AverageScore_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         double a[][]=new double[3][3];
         double total=0;
         
         System.out.println("Enter the marks: ");
         for(int i=0; i<3; i++)
         {
        	 for(int j=0; j<3; j++)
        	 {
        		 a[i][j]=sc.nextInt();
        	 }
         }
         for(int i=0; i<3; i++)
         {
        	 for(int j=0; j<3; j++)
        	 {
        		total += a[i][j];
        	 }
        	 System.out.println("Total marks for student "+(i+1)+" of each subject is:"+total);
        	 System.out.println("Average marks for student "+(i+1)+" of each subject is:"+total/3);
        	 total=0;
         }
	}

}
