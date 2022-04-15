// program to get input from the user
//store it into file 
//Using Reader and Writer file 
import java.io.*;
public class ReaderWriter
{
public static void main(String args[])
{
try{
BufferedReader in = new BufferedReader(new FileReader(args[0]));
String s, s1 = new String();// object 
while ((s = in.readLine())!= null)// read data and check no null 
s1 += s + "\n";
in.close();

BufferedReader stdin =new BufferedReader(new InputStreamReader (System.in));// object read data from user
System.out.println("enter line");
System.out.println ("usage of BufferedReader and InputStreamReader…");
System.out.println (stdin.roadLine());
StringReader in2= new StringReader(s1);
int c;
System.out.println ("printing individual characters of the file"+ args[0]);
while (( c = in2.read()) != -1)
System.out.println((char)c);
BufferedReader in4 = new BufferedReader(new StringReader (s1));
PrintWriter p = new PrintWriter (new BufferedWriter(new FileWriter("input.txt")));
while((s = in4.readLine()) != null)
p.println("output " + s );
p.close();
}catch (IOException e ) { }
}
}
// idea type from user by (system.in) 
// idea declare before call it and use it anywhere