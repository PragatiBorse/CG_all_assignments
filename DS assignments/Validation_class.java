package com.basic;
import java.util.*;
public class Validation_class {
	public static void main(String[] args)
	{
	  String name, password;
	  int count=0, attempt, track=0;
	  while(count<3 && track==0){
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter the login name: ");
		  name=sc.nextLine();
		  System.out.println("Enter the Password: ");
		  password=sc.nextLine();
		  
		  if(name.equals("Pragati") && password.equals("Password"))
		  {
			  track=1;
			  System.out.println("Welcome "+name);
		  }
		  else
		  {
			  count++;
			  attempt=3-count;
			  System.out.println("Try Again. Remaining attempts " +attempt);
			  if (attempt==0)
			  {
				  System.out.println("Contact Admin");
			  }
		  }
	  }
	}
 
}
