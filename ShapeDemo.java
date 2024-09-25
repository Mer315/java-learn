package sumedha_practice;

//Abstract class Shape
abstract class Shape {
 int dimension1, dimension2;

 // Constructor for the abstract class
 public Shape(int dimension1, int dimension2) {
     this.dimension1 = dimension1;
     this.dimension2 = dimension2;
 }

 // Abstract method to print the area
 abstract void printArea();
}

//Rectangle class extends Shape
class Rectangle extends Shape {

 // Constructor for Rectangle
 public Rectangle(int length, int width) {
     super(length, width);  // Calling the parent class constructor
 }

 // Method to calculate and print the area of the rectangle
 @Override
 void printArea() {
     int area = dimension1 * dimension2;
     System.out.println("Area of Rectangle: " + area);
 }
}

//Triangle class extends Shape
class Triangle extends Shape {

 // Constructor for Triangle
 public Triangle(int base, int height) {
     super(base, height);  // Calling the parent class constructor
 }

 // Method to calculate and print the area of the triangle
 @Override
 void printArea() {
     double area = 0.5 * dimension1 * dimension2;
     System.out.println("Area of Triangle: " + area);
 }
}

//Circle class extends Shape
class Circle extends Shape {

 // Constructor for Circle, only using one dimension (radius)
 public Circle(int radius) {
     super(radius, 0);  // Second dimension is not needed for Circle
 }

 // Method to calculate and print the area of the circle
 @Override
 void printArea() {
     double area = Math.PI * dimension1 * dimension1;
     System.out.println("Area of Circle: " + area);
 }
}

//Main class to test the shapes
public class ShapeDemo {
 public static void main(String[] args) {
     // Creating objects for each shape and calculating the areas
     Shape rectangle = new Rectangle(5, 4);
     Shape triangle = new Triangle(4, 3);
     Shape circle = new Circle(7);

     // Printing the areas
     rectangle.printArea();
     triangle.printArea();
     circle.printArea();
 }
}
