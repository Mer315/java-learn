package sumedha_practice;
//Base class
class Creature {
 void eat() {
     System.out.println("This creature eats food.");
 }
}

//Derived class 1
class Doggo extends Creature {
 void bark() {
     System.out.println("The doggo barks.");
 }
}

//Derived class 2
class Kitty extends Creature {
 void meow() {
     System.out.println("The kitty meows.");
 }
}

//Main class
public class HierarchialInheritanceExample {
 public static void main(String[] args) {
     Doggo myDoggo = new Doggo();
     Kitty myKitty = new Kitty();

     // Calling methods from the base class
     myDoggo.eat();   // From Creature class
     myDoggo.bark();  // From Doggo class

     myKitty.eat();   // From Creature class
     myKitty.meow();  // From Kitty class
 }
}
