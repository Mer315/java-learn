package sumedha_practice;

//Class definition
class Cat {
 // Instance variables
 String name;
 int age;

 // Default constructor
 public Cat() {
     this.name = "Unknown";
     this.age = 0;
 }

 // Method to display the values of name and age
 public void displayInfo() {
     System.out.println("Cat Name: " + name);
     System.out.println("Cat Age: " + age);
 }
}

//Main class
public class CatExample {
 public static void main(String[] args) {
     // Create an instance of Cat using the default constructor
     Cat myCat = new Cat();
     
     // Print the values of the variables
     myCat.displayInfo();
 }
}
