import java.util.Scanner;

public class convertKilometersToMiles {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert the distance from kilometers to miles using the formula
        double miles = kilometers * 0.621371;

        // Print the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        // Close the scanner object
        scanner.close();
    }
}
