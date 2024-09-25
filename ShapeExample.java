package sumedha_practice;

//Base class
class GeometricShape {
 // Method to get the area
 public double getArea() {
     return 0.0; // Default implementation (can be overridden)
 }
}

//Subclass
class RectangularShape extends GeometricShape {
 private double width;
 private double height;

 // Constructor to initialize width and height
 public RectangularShape(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Override getArea method
 @Override
 public double getArea() {
     return width * height;
 }
}

//Main class
public class ShapeExample {
 public static void main(String[] args) {
     // Create a RectangularShape object
     RectangularShape myRectangle = new RectangularShape(5.0, 3.0);
     
     // Calculate and print the area of the rectangle
     System.out.println("Area of the rectangle: " + myRectangle.getArea());
 }
}

