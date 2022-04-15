//unit43 inhertage class in java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {/////inhertage brand from supper class Vehicle()
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);/// myCar (.brand to call brand from class vehicle)
  }                                                         /// myCar (.modelName to call modelName feom class modelname)
}


//////output:  Tuut, tuut!
///////////////Ford Mustang