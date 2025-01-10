import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for taking first input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();
		
		// Calculate final result
        double Miles = kilometers * 0.621371.
		
		// Output result
        System.out.println("Miles: " + Miles);
		
		// Close scanner
		input.close();
    }
}
