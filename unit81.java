// Create class point following instance variable and methods 
// instance variable: private int x, y
//Contructor : public Point(), Point(intx, inty)
// Methods   : public void setX(intx), setY(int y ),setXY(int x, int y)
class ThisRetrun
 {
 private int i = 0;

ThisReturn increment()
 {
 i++;
 return this ;
 }
void print()
 {
 System.out.println ("The i value is" + i);
 }
public static void main (String arg[])
 {
 ThisReturn tr = new ThisRetrun();
 tr.increment().increment().increment().increment().print();
 }
}
import java.lang.*;
class point
 {
 private int x;
 private int y;
 public point ( ) { }
public point (int x, int y)
{
 this.x = x;
 this.y = y;
}
public void setX(int x)
{
 this.x = x;
}
public void setY (int y)
{
 this.y = y;
}
public void setXY (int x, int y)
{
 this.x = x;
 this.y = y;
}
public int getX( )
{

 return x;
}
public int gety ( )
{
 return y;
}
public int addXY ( )
{
 return (x + y);
}
public void display( )
{
 System.out.println (x);
 System.out.println (y);
}
public double distance (point p2)// method return a result 
{
 return(Math.sqrt( (x-p2.x)* (x-p2.x) + (y-p2.y) * (y - p2.y)) );
}
public static void main (String args[ ])
 {
 double a, b, c;
 point op,op1,op2;
 op = new point(5, 6);
 op1 = new point();
 op2 = new point();
 op1.setX(3);
 op1.setY(6);
 op1.getX();
 op1.gety();
 op2.setXY(8,9);
 op2.addXY();
 a = op1.distance(op2);
 b = op2.distance(op);
 c = op.distance(op1);
 System.out.println("Distance between point op1 to op2 is"+a);
 System.out.println("Distance between point op2 to op is" +b);
 System.out.println("Distance between point op to op1 is" +c);
 System.out.println(" Points Of op, op1, op2");
 op.display();
 op1.display();
 op2.display();

 }
} 