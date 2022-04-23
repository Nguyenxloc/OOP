//Write a program to show how synchronized methods and objects
//monitors are used to coordinate access to a common object by multiple
//threads. Clue use first program of this section for use will synchronized
//methods.
// how synchronized are used to coordinate

import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.InterruptedException;
class ThreadSynchronization
{
public static void main (String args [ ])
{
MyThread thread1 = new MyThread ("thread1:");
MyThread thread2 = new MyThread ("thread2:");
thread1.start ( );
thread2.start ( );
boolean thread1IsAlive = true;
boolean thread2IsAlive = true;
do
{
if (thread1IsAlive && !thread1.isAlive ( ) )
{
thread1IsAlive = false;
System.out.println ("Thread 1 is dead.");
}
if (thread2IsAlive && !thread2.isAlive ( ))
{
thread2IsAlive = false;
System.out.println ("Thread 2 is dead.");
}
}while (thread1IsAlive || thread2IsAlive);
}
}
class MyThread extends Thread
{
static String message [ ] = {"Java", "is", "hot", "aromatic,","and", "invigorating." };
public MyThread (String id)
{
super (id);
}
public void run ( )
{
SynchronizedOutput.displayList (getName(),message);
}
void randomWait ()
{
try
{
sleep ( (long ) (3000*Math.random ( )) );
}
catch (InterruptedException x )
{
System.out.println ("Interrupted!");
}
}
}
class SynchronizedOutput
{
public static synchronized void displayList(String name,String list [ ])
{
for (int i=0;i<list.length; ++i)
{
MyThread t = (MyThread) Thread.currentThread ( );
t.randomWait ( );
System.out.println (name + list [i]);
}
}
}
//thread1:Java
//thread1:is
//thread1:hot
//thread1:aromatic,
//thread1:and
//thread1:invigorating.
//Thread 1 is dead.
//thread2:Java
//thread2:is
//thread2:hot
//thread2:aromatic,
//thread2:and
//thread2:invigorating.
//Thread 2 is dead.