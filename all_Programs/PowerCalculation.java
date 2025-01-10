import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for taking first input
        System.out.print("Enter base: ");
        double base = input.nextDouble();
		
		// Prompt for taking second input
        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();
		
		// Calculate final result
        double result = Math.pow(base, exponent);
		
		// Output result
        System.out.println("Result: " + result);
		
		// Close scanner
		input.close();
    }
}
