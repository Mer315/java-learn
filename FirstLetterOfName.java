package sumedha_practice;

import java.util.Scanner;

public class FirstLetterOfName {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            // Prompt the user for their name
            System.out.print("Enter your name (or type 'exit' to quit): ");
            name = scanner.nextLine();

            // Check if the user wants to exit
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            // Check if the name is not empty
            if (name.length() > 0) {
                // Print the first letter of the name
                char firstLetter = name.charAt(0);
                System.out.println("The first letter of your name is: " + firstLetter);
            } else {
                System.out.println("Please enter a valid name.");
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Program exited.");
    }
}
