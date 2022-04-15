//program create directory 
//check whether the directory is created  
import java.io.*;
class FileMethods4
{
public static void main (String args[]) throws IOException//// no throws IOException ---> the same result
{
File f = new File ("c:/java/temp");
if (f.mkdir())
System.out.println("created a directory");
else
System.out.println ("unable to create a directory");
}
}