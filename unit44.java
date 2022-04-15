//program to give the example for method overringding concepts 
// A Simple Java program to demonstrate
// method overriding in java
// @overide method
// Base Class
class college {
 public void move() {/////object move()
  System.out.println("College is open");/// atribute of object 
 }
}
class univ extends college {
 public void move() { //// object move()
  System.out.println("University is open too");
 }
}
public class stud {
 public static void main(String args[]) {
  college a = new college();
  college b = new univ();
  a.move();///call object move()
  b.move();/// call object move()
 }
}