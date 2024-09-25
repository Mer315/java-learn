package sumedha_practice;
//Base class
class AnimalBase {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Intermediate class
class MammalBase extends AnimalBase {
 void walk() {
     System.out.println("This mammal walks on land.");
 }
}

//Derived class
class DogBase extends MammalBase {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Main class
public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     DogBase myDog = new DogBase();
     
     // Calling methods from the multilevel inheritance hierarchy
     myDog.eat();   // From AnimalBase class
     myDog.walk();  // From MammalBase class
     myDog.bark();  // From DogBase class
 }
}
