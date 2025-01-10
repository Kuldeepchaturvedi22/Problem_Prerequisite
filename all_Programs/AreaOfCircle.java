import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
		
		// Used scanner class for taking input from user
        Scanner input = new Scanner(System.in);
		
		// Promt for taking input from user
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
		
		// Calculate area of circle
        double area = Math.PI * radius * radius;
		
		// Output result
        System.out.println("Area of the circle: " + area);
		
		// Close scanner
		input.close();
		
    }
}
