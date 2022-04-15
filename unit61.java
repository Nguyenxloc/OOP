// creat interface A have two method meth 1 + meth2 
// another class: implements this interface in another class named MyClass.
interface A
{
 void meth1();//// no defition like int spring
 void meth2();//// no defition
}
// B now includes meth1() and meth2()--it adds meth3().
interface B extends A
{
void meth3();
}
// This class must implement all of A and B
class MyClass implements B /// create 3 method in one subclass 
{
public void meth1 ( ) ////  by defining it in the child class
{
System.out.println("Implement meth1().");
}
public void meth2()
{
System.out.println ("Implement meth2().");
}
public void meth3()
{
System.out.println ("Implement meth()." );
}
}
class IFExtend
{
public static void main(String arg[])
{
MyClass ob = new MyClass();
ob.meth1();
ob.meth2();
ob.meth3();
}
}
	

