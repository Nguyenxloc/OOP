//program: multiple catch statements occurring  2 catch in program 
// program checking valid or invalid
import java.io.*;
class MultiCatchException
{
public static void main( String a[])
{
int a1[] = { 100,200,300,400,500 };
System.out.println("enter a number as array index and find out its value");
System.out.println("enter and to come out of the programs");
try/// valid 
{
String line;
int x;
BufferedReader d = new BufferedReader( new InputStreamReader(System.in));// object to type number//// new class Bufferedreader
while (( line = d.readLine()) != null)// "!=" is mean not equal/// not undertand readline 
{
if (line.equals("end"))//"type end into break "
break;
else {
try {
x = Integer.parseInt(line);
System.out.println("valid element and it is : "+a1[x]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("invalid elements ");
System.out.println("exception generated : "+e);
}
catch(NumberFormatException n)
{
System.out.println("sorry no characters");
System.out.println("generated exception : " + n);
}
}
}
}catch(IOException i){ }/// if space then result" try without catch" look like syntax() must have 
}
}
