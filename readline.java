
import java.io.*;
public class GFG {
    public static void main(String[] args)
    {
        // Create the console object

        Console cnsl= System.console();
  		
        if (cnsl == null) {////// replace != null instead == null----> result= "No console available"
            System.out.println(
                "No console available"+cnsl);
            return;
        }
  
        // Read line
        String str = cnsl.readLine("Enter string : "); /// read infor from console 
  
        // Print
        System.out.println(
            "You entered : " + str);
    }
}
////java.io.Console@11c20519