package sumedha_practice;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        // Hardcoded array
        int[] numbers = {34, 67, 23, 89, 12, 45, 78}; // You can change the elements to test others

        // Initialize largest and smallest
        int largest = numbers[0];
        int smallest = numbers[0];

        // Loop through the array to find largest and smallest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if current number is greater
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if current number is smaller
            }
        }

        // Print the results
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);
    }
}
