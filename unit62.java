// a program to give example for multiple inheritage in java. 
// key point: multiple inheritage 
class Number
{
protected int x;
protected int y;
}
interface Arithmetic
{
int add(int a, int b);
int sub(int a, int b);
}
class UseInterface extends Number implements Arithmetic /// 2 inheritage ( 1 extends and 1 implements )
{
public int add(int a, int b)
{
return(a + b);
}
public int sub(int a, int b)
{
return (a - b);
}
public static void main(String args[])
{
UseInterface ui = new UseInterface();
System.out.println("Addition --- >" + ui.add(2,3));//output=5
System.out.println("Subtraction ----- >" + ui.sub(2,1));//output=1
}
}