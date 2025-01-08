import java.util.Scanner;

public class celsiusToFahrenheitConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9/5) + 32;

        // Print the result
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");

        // Close the scanner object
        scanner.close();
    }
}
