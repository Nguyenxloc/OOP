//unit132.java
//class: MyThread 
//call the base class constructor 
//using supper: and start the thread(method() of class )
//run method of the class starts after this'
//mutiple thread

import java.io.*;
class MyThread extends Thread
{
MyThread()// call class 1 
{
super ("Using Thread class");// using super keyword
System.out.println ("Child thread:" + this);// print child thread 
start();//
}
public void run()// method void 
{
try
{
for ( int i =5; i > 0; i--)
{
System.out.println ("Child thread" + i);
Thread.sleep (500);
}
} catch (InterruptedException e) { }/// end loop print below
System.out.println ("exiting child thread …");
}
}
class TestMyThread
{
public static void main(String args[])
{
new MyThread();
try {
for ( int k = 5; k > 0; k--)
{
System.out.println ("Running main thread :" + k);
Thread.sleep(500);
}
}catch (InterruptedException e) { }
System.out.println ("Exiting main thread . . .");
}
}
