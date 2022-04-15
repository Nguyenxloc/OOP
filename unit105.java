class ThrowsException
{
public static void main(String a[]) throws ArithmeticExceptionS
{
System.out.println("Inside main");
int I = 0;
int j = 40/I;
System.out.println("this statement is not printed");
}
}
/* Output of this program is
* inside main
* java.lang.ArithmeticException: / by Zero
* at ThrowsException.main(ThrowsEception.java:5) */