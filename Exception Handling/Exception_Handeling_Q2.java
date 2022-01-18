import java.util.Scanner;

public class Exception_Handeling_Q2 {
	
public static void main(String[] args) {
        
        // Create scanner class object
        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        try {
        	if(num2 == 0) {
        		throw new UnsupportedOperationException();
        	}else
            System.out.println(num1 / num2);
            
        }
        catch (java.lang.UnsupportedOperationException e) {
            System.out.println("Unsupported Operation:Can not divide by 0");
        }
    }
}
