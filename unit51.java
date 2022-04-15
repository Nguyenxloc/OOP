// class name:shape                     //// related inheritance 
//sub classes :circle, triangle, square ////
//each class has 2 member: draw(), erase()
//using polymorphism concepts.
class Animal {//// superclass
  public void animalSound() {
    System.out.println("The animal makes a sound");/// any in the world animal have sound
  }
}

class Pig extends  { //// sub classes
  public void animalSound() {
    System.out.println("The pig says: wee wee");///inhertage from Animal: sound like wee wee 
  }
}

class Dog extends Animal {   // sub classes
  public void animalSound() {
    System.out.println("The dog says: bow wow");/// inhertage from Animal: sound like bow bow
  }
}

class Main { // execute
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}