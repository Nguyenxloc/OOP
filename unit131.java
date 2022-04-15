//program to illustrate creation of threads using runnable class
//Thread.sleep(time)
import java.io.*;
class IntThread implements Runnable/// new class 
{
Thread t;/// t is variable thread is data type
IntThread()// Inthread is class
{
t = new Thread ( this, "Test thread");// t is object 
System.out.println (" Child thread :" + t);// print "child thread"
t.start();
}
public void run()// create method run()
{
try {
for (int i= 5; i<0; i--)/// not execcute because condition never execute
{
System.out.println ("Child thread :" + i);// not println
Thread.sleep (500);// set time next step
}// Child thread exit because Child thread failed
}catch (InterruptedException e) { }
System.out.println ("Exiting child thread …" );
}
public static void main (String args[])// main[] execute
{
IntThread i = new IntThread();

try {
for ( int j=5; j >0; j--)
{
System.out.println ("Main thread :" + j);
Thread.sleep (1000);/// set time next step
}
} catch (InterruptedException e) { }
System.out.println ( "Main thread exiting …");
}
}