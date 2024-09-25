package sumedha_practice;

class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();
        
        // Calling the overloaded add() methods
        int sum1 = calc.add(5, 10);  // Calls the method with two int parameters
        int sum2 = calc.add(5, 10, 15);  // Calls the method with three int parameters
        double sum3 = calc.add(5.5, 10.5);  // Calls the method with two double parameters

        // Printing the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
