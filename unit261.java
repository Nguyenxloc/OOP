//sum of digit
class sumdig
{
public static void main (String args [ ] )
{
int i, s;
i = 927489;
s=0;
System.out.println (i);
while (i>10)
{
s += i%10;
i/=10;
}
s += i;
System.out.println ("the sum of the digits is :"+ s);
System.out.println(s);
}

}