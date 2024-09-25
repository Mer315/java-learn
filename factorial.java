package sumedha_practice;

public class factorial {
	 public static void main(String[] args) {
	        int number = 5; // Example number
	        int result = factorials(number);
	        System.out.println("Factorial of " + number + " is " + result);
	    }

	    public static int factorials(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorials(n - 1);
	        }
	    }

}
