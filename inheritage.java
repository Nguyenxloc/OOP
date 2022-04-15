// subclass and supper class

class Vehicle {/////supoer class
  public String brand = "Ford";        // Vehicle attribute
  public static void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
  public void kfc(){
    System.out.println("ga ran");
}
}
class Car extends Vehicle {//// car subclass
  private String modelName = "Mustang";    // Car attribute
  }
class main{
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();
    myCar.kfc();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    
  }
}
