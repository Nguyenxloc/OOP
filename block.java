package blockProgram; 
public class Test 
{ 
// Declare Zero parameter constructor. 
   Test() 
   { 
      System.out.println("0-arg Constructor"); 
   } 
// Declaration of an Instance block. 
   { 
      System.out.println("Instance Block"); 
   } 
public static void main(String[] args) 
{ 
 // First approach: Create the object of the class. 
     Test t = new Test(); // named object because object contains reference variable. 

// Second approach: 
      new Test(); // nameless object. It is frequently used to reduce the length of the code. 
   } 
}
