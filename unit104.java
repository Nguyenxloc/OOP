//illustrate usage of try/ catch with finally clause 
import java.io.*;
class FinallyException
{
public static void main(String a[]) throws Exception
{
try
{
BufferedInputStream f1 = null;
int size = f1. available();
for(int I = 0; I< size; I++)
{
System.out.print((char)f1.read());
}
}
catch(NullPointerException n)
{
System.out.println("exception generated : " +n);
}
finally
{
System.out.println("===================");
System.out.println("Inside finally");
System.out.println("hay I always have the final");
System.out.println("====================");
}
}
}