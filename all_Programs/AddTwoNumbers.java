import java.util.Scanner;

public class AddTwoNumbers {
	
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Input first number
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
		
		// Input second number
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
		
		// Used sum variable to store sum of two number
        int sum = number1 + numer2;
		
		// Output sum of both number
        System.out.println("Sum: " + sum);
		
		// Scanner closed
		input.close();
    }
}
