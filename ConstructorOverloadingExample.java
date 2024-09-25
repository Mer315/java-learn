package sumedha_practice;

//Class with constructor overloading
class Book {
 String title;
 String author;
 double price;

 // Constructor with one parameter
 public Book(String title) {
     this.title = title;
     this.author = "Unknown";
     this.price = 0.0;
 }

 // Constructor with two parameters
 public Book(String title, String author) {
     this.title = title;
     this.author = author;
     this.price = 0.0;
 }

 // Constructor with three parameters
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
     System.out.println();
 }
}

//Main class
public class ConstructorOverloadingExample {
 public static void main(String[] args) {
     // Creating objects using different constructors
     Book book1 = new Book("Java Programming");
     Book book2 = new Book("Effective Java", "Joshua Bloch");
     Book book3 = new Book("Clean Code", "Robert C. Martin", 29.99);

     // Displaying book details
     book1.displayDetails();
     book2.displayDetails();
     book3.displayDetails();
 }
}
