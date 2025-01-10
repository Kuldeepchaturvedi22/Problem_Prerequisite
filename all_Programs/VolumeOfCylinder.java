import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
		
		// Used scanner class for taking input from user
        Scanner input = new Scanner(System.in);
		
		// Promt for taking first input from user
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
		
		// Promt for taking second input from user
        System.out.print("Enter height: ");
        double height = input.nextDouble();
		
		// Calculat volume of cylinder
        double volume = Math.PI * radius * radius * height;
		
		// Output result
        System.out.println("Volume of the cylinder: " + volume);
		
		//Close scanner
		input.close();
		
    }
}
