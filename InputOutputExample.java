import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.print("Enter a value: ");

        // Read the entered value from the user
        int userInput = scanner.nextInt();

        // Output the entered value
        System.out.println("You entered: " + userInput);

        // Close the Scanner to avoid resource leakage
        scanner.close();
    }
}

