package com.basic;
import java.util.*;
public class BubbleSort_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++)
		{		
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("sorted Array :");
		System.out.println(Arrays.toString(arr));
		

	}

}
