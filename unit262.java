//prime number checking
import java.lang.*;
class prime
{
public static void main (String args [ ])
{
int i, j, n, lastn;
double a;
boolean flag;
for (i=0;i<1000;i++)
{
a = i;
a = Math.sqrt (a);
lastn = (int)a;
flag =true;
for (j=2;j<=lastn; j++)
{
if(i != j)
{
if(i % 2==0)
{
flag = false;
break;       ///////// if i/2==0  break loop there and not print i/2==0, return loop1
}
}
}
if (flag) System.out.println ("\n" + i );

}
}
}
