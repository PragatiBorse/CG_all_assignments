package com.basic;
import java.util.*;
public class Array_class {
	public static void main(String[] args){
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to search in array: ");
		int num=sc.nextInt();
		 
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				System.out.println(num+ " is found in the array at " +i+ "th index.");
			}
			
   		}
	}

}
