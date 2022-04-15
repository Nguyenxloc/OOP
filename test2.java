class Animal {
  public void animalSound() {////animal method
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() { /// pig method
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() { //// dog method
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object has inheritance from class pig/// object name: mypig inheritance Pig() 
    Animal myDog = new Dog();  // Create a Dog object has inheritance from class dog
    animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}