//program to create a file
//write data into it(method OutputStream class)
// type number from keyboard and save it into the path
import java.io.*;
class ReadWriteFile
{
public static byte getInput() [] throws Exception// method getInput( ){static method, return byte, access level: public} static not really understand 
{////non static program not work 
byte inp[ ] = new byte[50];//(array)
System.out.println("enter text.");
System.out.println("only 50 bytes i.e. about 2 lines …");
System.out.println("press enter after each line to get input into the program");
for(int i=0; i<50; i++)
{
inp[i] = (byte)System.in.read();// type 50 number
}
return inp;//return byte 
}
public static void main(String args[])throws Exception
{
byte input[] = getInput();
OutputStream f = new FileOutputStream("c:/java/write.txt");// create a file in path
for(int i=0; i<50; i++)
{
f.write(input [i]);// write input on file created in path 
}
f.close();
int size;
InputStream f1 = new FileInputStream ("c:/java/write.txt");
size = f1.available();
System.out.println("reading contents of file write.txt…");
for(int i=0; i<size; i++)
{
System.out.print((char)f1.read());
}
f.close();
}
}