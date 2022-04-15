//program accept specified number of characters as input 
// convert them into uppercase characters 
//step 1: type
// step2 : nguyenloc 
//step3 : convert to NGUYENLOC
import java.io.*;
class ByteArray
{
public static void main(String args[]) throws Exception
{
ByteArrayOutputStream f = new ByteArrayOutputStream(50);// create a array output 
System.out.println ("enter 10 characters and a return");
System.out.println ("These will be converted to uppercase and displayed");
while (f.size() != 14)
{
f.write(System.in.read( ) );// type character follow loop while
}
System.out.println("Accepted characters into an array");
byte b[] = f.toByteArray();// convert characters into byte array
System.out.println("displaying characters in the array");
for(int l=0;l<b.length;l++)
{
System.out.println((char)b[l]);/// print each char 
}
ByteArrayInputStream inp = new ByteArrayInputStream(b);// input aray from array byte
int c;
System.out.println("converted to upper case characters");
for (int i=0;i<1;i++)
{
while((c=inp.read()) != -1)
{
System.out.print(Character.toUpperCase((char)c));
}
System.out.println();
inp.reset();
}
}
}//idea: type character from user and trans to char data type ----> byte type---->