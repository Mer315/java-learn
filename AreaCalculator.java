package sumedha_practice;

public class AreaCalculator {

    // Method to calculate area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a circle
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius; // Using Math.PI for better precision
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a square
        double squareSide = 4.0;
        double squareArea = calculator.calculateArea(squareSide);
        System.out.println("Area of Square (side " + squareSide + "): " + squareArea);

        // Calculate area of a rectangle
        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        double rectangleArea = calculator.calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle (length " + rectangleLength + ", width " + rectangleWidth + "): " + rectangleArea);

        // Calculate area of a circle
        double circleRadius = 2.0;
        double circleArea = calculator.calculateArea(circleRadius, true);
        System.out.println("Area of Circle (radius " + circleRadius + "): " + circleArea);
    }
}
