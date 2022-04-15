//program to open one application using process class
import java.io.*;
class Lang
{
public static void main(String a[])throws IOException
{
Runtime r;
r = Runtime.getRuntime();
System.out.println(r.freeMemory());
int x[] = {1};
r.gc();
System.out.println(r.freeMemory());
Process p = r.exec("pbrush.png");
System.out.println(r.freeMemory());
}
}
