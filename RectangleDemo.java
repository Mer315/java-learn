package sumedha_practice;

//Box class definition
class Box {
 // Private instance variables
 private double length;
 private double width;

 // Getter method for length
 public double getLength() {
     return length;
 }

 // Setter method for length
 public void setLength(double length) {
     if (length > 0) {
         this.length = length;
     } else {
         System.out.println("Length must be positive.");
     }
 }

 // Getter method for width
 public double getWidth() {
     return width;
 }

 // Setter method for width
 public void setWidth(double width) {
     if (width > 0) {
         this.width = width;
     } else {
         System.out.println("Width must be positive.");
     }
 }

 // Method to calculate the area of the box
 public double getArea() {
     return length * width;
 }

 // Method to calculate the perimeter of the box
 public double getPerimeter() {
     return 2 * (length + width);
 }
}

//Main class to test the Box class
public class RectangleDemo {
 public static void main(String[] args) {
     // Creating a Box object
     Box box = new Box();

     // Setting length and width
     box.setLength(5.0);
     box.setWidth(3.0);

     // Displaying length, width, area, and perimeter
     System.out.println("Length: " + box.getLength());
     System.out.println("Width: " + box.getWidth());
     System.out.println("Area: " + box.getArea());
     System.out.println("Perimeter: " + box.getPerimeter());

     // Trying to set invalid dimensions
     box.setLength(-2.0);  // This will trigger an error message
     box.setWidth(0);      // This will trigger an error message
 }
}
