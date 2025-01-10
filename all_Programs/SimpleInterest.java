import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for first input from user
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
		
		// Prompt for second input from user
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
		
		// Prompt for third input from user
        System.out.print("Enter time: ");
        double time = input.nextDouble();
		
		// Calculate interest based on given input
        double interest = (principal * rate * time) / 100;
		
		// Output the result
        System.out.println("Simple Interest: " + interest);
		
		// Close scanner
		input.close();
    }
}
