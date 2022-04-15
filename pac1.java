// Java Program to Import a package
 
// Importing java utility package
import java.util.*;
 
// Main Class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Scanner to take input from the user object
        Scanner myObj = new Scanner(System.in);
        String userName;
 
        // Display message
        // Enter Your Name And Press Enter
        System.out.println("Enter You Name");
 
        // Reading the integer age entered using
        // nextInt() method
        userName = myObj.nextLine();
 
        // Print and display
        System.out.println("Your Name IS : " + userName);
    }
}