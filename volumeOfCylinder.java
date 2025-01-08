import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Ask the user to enter the height of the cylinder
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder using the formula: Volume = π * radius^2 * height
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Print the result
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);

        // Close the scanner object
        scanner.close();
    }
}
