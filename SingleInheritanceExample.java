package sumedha_practice;

//Base class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Derived class
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Main class
public class SingleInheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     
     // Calling method from the base class
     myDog.eat();
     
     // Calling method from the derived class
     myDog.bark();
 }
}