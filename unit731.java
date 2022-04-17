//find the maximum of array
//Let int a[]
//if n>1  find the maximum of n - 1 entries of array 
//a[n]=?
// maximum of a[n-1]=? 
//orial recursion
public class Factorial
{
int fact (int n)// int asign return for method
{
if (n <= 1) return 1;
else return ( n * fact(n - 1)) ;// c= 5 fact 
}
public static void main (String arg [ ])
{
int fa, fb, fc;
int a = 3, b = 5, c = 5;
Factorial f = new Factorial ( );// create new object
fa = f.fact (a);
fb =f.fact (b);
fc = f.fact (c);

System.out.println("Factorial of "+ a + "is" + fa);
System.out.println ("Factorial of "+ b + " is" + fb);
System.out.println("Factorial of "+ c + "is" + fc);
System.out.println(fact(3));

}
}