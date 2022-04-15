//unit 225 do statements//// print order 1 2 3 4 5 
class BreakLoop
{
public static void main (String args [ ])
{
int i= 0;
do {
System.out.println ("Im stuck !" ) ;
i++;
if (i > 5)
break;
} while (true);
}
}
