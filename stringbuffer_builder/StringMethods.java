/*Given a String "Java String pool refers to collection of Strings which are strored in heap memory", 
 * perform some operation using String methods*/
package com.stringbuffer_builder;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are strored in heap memory";
		//a.print the string to console in lowercase
		String s1=str.toLowerCase();
		System.out.println(s1);
		//print the string to console in uppercase
		String s2=str.toUpperCase();
		System.out.println(s2);
		//replace all 'a' character in the string with $ sign
		System.out.println(str.replace('a', '$'));
		//check if the original string contains the word "collection"
		if(str.contains("collection"));
		System.out.println("The word: collection: is found in given String");
		//else
			System.out.println("The word: collection: is not found in given String");
			
		//check if the following string "Java String pool refers to collection of Strings which are stored in heap memory"
		//matches the original
		//if the string does not match check if there is another method which can be used to check
		//if the strings are equal

	}

}
