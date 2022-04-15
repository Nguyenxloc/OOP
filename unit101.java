//program: try and catch block 
//check whether array size is nagative or not.
class NegTest
{
public static void main(String a[])
{
try
{
int a1[] = new int[-2];
System.out.println("first element : "+a1[0]);
}
catch(NegativeArraySizeException n)
{
System.out.println(" generated exception : " + n);
}
System.out.println(" After the try block");
}
}
