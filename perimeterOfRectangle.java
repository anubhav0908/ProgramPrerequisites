import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Ask the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter of the rectangle using the formula: Perimeter = 2 * (length + width)
        double perimeter = 2 * (length + width);

        // Print the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner object
        scanner.close();
    }
}
