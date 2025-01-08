import java.util.Scanner;

public class powerCalculation {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Ask the user to enter the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the result using Math.pow function
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner object
        scanner.close();
    }
}
