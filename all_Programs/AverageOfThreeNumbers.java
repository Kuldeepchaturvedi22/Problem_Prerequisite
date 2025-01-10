import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for first input from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
		
		// Prompt for second input from user
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
		
		// Prompt for third input form user
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
		
		// Calculate final result
        double average = (num1 + num2 + num3) / 3;
		
		// Output final result
        System.out.println("Average: " + average);
		
		// Close scanner
		input.close();
    }
}
