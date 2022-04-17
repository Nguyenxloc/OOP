// demonstrate static variable, method, and block class usestatic 2
// using method
class StaticDemo
{
static int a = 48;
static int b = 99;
static void callme()
{
System.out.println ("a =" + a);
}
}
class StaticByName
{
public static void main( String args[])

{
StaticDemo.callme();
System.out.println ("b =" + StaticDemo.b);
}
}