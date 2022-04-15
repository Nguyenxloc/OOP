// ACDemo - Using arraycopy ( )
class ArrayCopy
{
static char a [ ] = { 'H', 'E', 'L', 'L', 'O'} ;
static char b [ ] = { 'W', 'O', 'R', 'L', 'D'};
public static void main ( String args [ ])
{
System.out.print ("Before ArrayCopy a - - >" );
System.out.println (a);
System.out.print ("Before ArrayCopy b - - >" );
System.out.println (b);

System.arraycopy (a, 0, b, 0 ,a.length);
System.out.print ("After ArrayCopy a - - >" );
System.out.print (a);
System.out.print ("After ArrayCopy b - ->" );
System.out.println (b);
}
}