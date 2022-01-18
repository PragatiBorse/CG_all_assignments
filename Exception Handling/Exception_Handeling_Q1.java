import java.util.Scanner;

public class Exception_Handeling_Q1 {
	
public static void main(String[] args) {
        
        // Create scanner class object
        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        try {
            System.out.println(num1 / num2); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Divided by zero operation cannot possible");
        }
    }
}
