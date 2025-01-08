import java.util.Scanner;

public class calculateSimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user to enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Ask the user to enter the time period
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner object
        scanner.close();
    }
}
