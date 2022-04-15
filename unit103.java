// program : illustrate  sub class exception precedence over base class 
// Accept file name as command line arguments.
import java.io.*;
class BaseSubException
{
public static void main(String a[])
{
if(a.length == 0)
{
System.out.println("invalid usage");
System.out.println("usage : Java <filename> file1 file2 file3 ...");
return;
}
for(int I=0;I < a.length; I++)
{
File f = new File(a[I]);

try {
String line;
DataInput d = new DataInputStream(new FileInputStream(a[I]));
if (f.exists() && f.isFile())
{
System.out.println("file exists");
System.out.println(f + "is ordinary file");
System.out.println("printing the contents of file named : " + a[I]);
System.out.println("========================");
while((line = d.readLine()) != null)
{
System.out.println(line);
}
}
} catch(FileNotFoundException e)
{
if(f.exists() && f.isDirectory())
{
System.out.println("======================");
System.out.println("Name : " + f + "is a directory");
System.out.println("inside catch of FileNotFoundException");
System.out.println("========================");
}
else {
System.out.println("=====================");
System.out.println("Name : " + a[I] + "does not exists");
System.out.println("generated exception :"+e);
System.out.println("======================");
}
} catch(IOException i) {
System.out.println("super class is higher up in the program");
}
}
}
}


