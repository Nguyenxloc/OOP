// f(n) = f(n-1) + f(n-2).
public class Fibonacci
{
long fibo (int n)
{
if (n <= 1) return 1;
else
return (fibo(n - 1) + fibo (n -2) );
}
public static void main (String arg [ ])
{
Fibonacci f;
long l;
f = new Fibonacci ( );
l = f.fibo (5);
System.out.println ("5th Fibonacci number is : "+1);
System.out.println(l);
}
}

