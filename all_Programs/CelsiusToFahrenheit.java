import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
		
		// Used scanner class for taking input from user
        Scanner input = new Scanner(System.in);
		
		// prompt for taking input from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
		
		// Calculate fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
		
		// Output result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		
		// Close scanner
		input.close();
    }
}
