package sumedha_practice;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Hardcoded number to check
        int number = 29; // You can change this number to test other values

        // Check if the number is prime
        boolean isPrime = true;

        // Handle numbers less than 2
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, not prime
                    break; // No need to check further
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
