import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to the Java Calculator ===");

        while (running) {
            // Display the menu options
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            // If user wants to exit, break out of the loop immediately
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                continue;
            }

            // Check for invalid menu selections before asking for numbers
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select an option between 1 and 5.");
                continue;
            }

            // Prompt user for input numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Perform calculation based on user choice
            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                    break;
                case 2:
                    System.out.printf("Result: %.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
                    break;
                case 3:
                    System.out.printf("Result: %.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
                    break;
                case 4:
                    // Prevent crash due to division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                    }
                    break;
            }
        }
        
        scanner.close();
    }
}