package com.lambda;

interface price{
	 int foo(int a);
}
public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		price mylambda = (int a) -> {
			if(a >10000) 
				{
				System.out.println("Accepted"); 
				}
				else
				{
					System.out.println("Not Accepted");
				}
			return a;
		};
		System.out.println("order amount:" +(mylambda.foo(100000)));
	}
	

}
