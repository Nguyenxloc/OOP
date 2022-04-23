//Write a complex program to illustrate how the thread priorities? Imagine
//that the first thread has just begun to run, even before it has a chance to
//do anything. Now comes the higher priority thread that wants to run as
//well. Now the higher priority thread has to do its work before the first
//thread starts. 

public class ComplexThread extends Thread
{
private int delay;
ComplexThread (String name, float seconds)
{
super (name);
delay = (int) seconds * 1000;// delays are in milliseconds
start(); // start up ourself!
}
public void run ( )
{
while (true)
{
System.out.println (Thread.currentThread ( ).getName ( ) );
try
{
Thread.sleep (delay);
}
catch (InterruptedException e)
{
return ;
}
}
}
public static void main (String argc[ ])
{
new ComplexThread ("one potato", 1.1F);
new ComplexThread ("two potato", 1.3F);
new ComplexThread ("three potato", 0.5F);
new ComplexThread ("four", 0.7F);
}
}
//our
//three potato
//three potato
//four
//four
//three potato
//three potato
//four
//four
//three potato
//three potato
//four
//four
//three potato
//three potato
//four
//four
//three potato
//three potato
//three potato
//four
//four
//three potato
//three potato
//three potato
//four
//four