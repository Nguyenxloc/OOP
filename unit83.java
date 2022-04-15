// program to create a package named: package
//circle class
// create a package 
//create a package
package mypack;
class Circle
{
 double r;
 void area()//the same method
 {
 System.out.println("Area of the circle = " + (3.14 * r * r));
 }
}
class Square
{
 double s;
 void area()// the same method
 {
 System.out.println("Area of the Square = " + (s * s));
 }
}
class Rectangle
{
 double l,b;
 void area()// the same method
 {
 System.out.println("Area of the circle = " + (l * b));
 }
}
//implements the package
import mypack.Circle.*;// not working
class Eg
{
 public static void main(String a[])
 {
 Circle c = new Circle();
 c.area();/// method area in package mypack
 }
} 
