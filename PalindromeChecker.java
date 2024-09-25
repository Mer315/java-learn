package sumedha_practice;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Hardcoded number to check
        int number = 121; // You can change this number to test other values
        int originalNumber = number; // Store the original number
        int reversedNumber = 0; // Variable to hold the reversed number

        // Reversing the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
