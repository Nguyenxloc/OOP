//a program to rename the given file 
// after rename the file ----> delete the renamed file
// accept the file name using command the line arguments.
import java.io.File;
public class GFG {
    public static void main(String[] args)
    {
        // Create an object of the File class
        // Replace the file path with path of the directory

        File file = new File("E:/GFG.txt");
  
        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("E:/HelloWorld.txt");
  
        // store the return value of renameTo() method in
        // flag
       
  	
        boolean flag = file.renameTo(rename);
  
        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
           
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
    }
}
