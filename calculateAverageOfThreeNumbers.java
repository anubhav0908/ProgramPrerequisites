import java.util.Scanner;

public class calculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask the user to enter the third number
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Print the result
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner object
        scanner.close();
    }
}
