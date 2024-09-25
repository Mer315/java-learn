package sumedha_practice;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter student grade: ");
        char grade = scanner.next().charAt(0);

        // Display the student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
