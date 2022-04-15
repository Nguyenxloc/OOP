// abtract class
// Abstract class
 abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();


  // Regular method
  public void sleep() {
    System.out.println("Zzz");//// creat 
  }
  public void eat(){
  	System.out.println("food");////

}
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
class Dog extends Animal {
	public void animalSound() {
	int a = 1 ;
	int b =2 ;
	int c =3;
	int d =4;
	int result = a+b+c+d;	
	System.out.println(result);
}
}
class Cat extends Animal {
	public void animalSound(){/// atribute: cat eat fish 
	String a = " Fish "; 
	System.out.println("eat"+a);
	}
}

class Main {       ///// different beetween abstract method and interface method
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    Dog myDog = new Dog();  // Creat a dog object 
    Cat myCat = new Cat();  // Creata a cat object 
    myPig.animalSound();    // use method off subclass pig not from abtract so ----> the question: position of abtract class. not influence to any excecute 
    myPig.sleep();
    myDog.animalSound();
    myCat.eat();
    

  }
}
 


 
 

