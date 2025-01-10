import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
		
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for taking first input
        System.out.print("Enter length: ");
        double length = input.nextDouble();
		
		// Prompt for taking second input
        System.out.print("Enter width: ");
        double width = input.nextDouble();
		
		// Calculate perimeter
        double perimeter = 2 * (length + width);
		
		// Output the result
        System.out.println("Perimeter of the rectangle: " + perimeter);
		
		// Close scanner
		input.close();
    }
}
