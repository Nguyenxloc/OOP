// Create class box
//box3d is extended class of box
// include contructor 
// set value of lenghth, breadth, height
//find out area and volume
class Box// name of parent class
{
private int length;/// type of length 
private int breadth;/// type of breadth

public Box ( )// 
{
length =0;// not nescessary
breadth =0;//not nescessary
}
public Box (int x, int y)// contructor
{
length = x;
breadth =y;
}
public void setval (int x, int y)// contructor
{
length = x;
breadth = y;
}
public int area ( ) /// method not working whyyy!!!!!
{
return (length * breadth);
}
}////// x y of class box not relate to class Box3d
class Box3d extends Box
{
private int height;
public Box3d ( )
{
super ( );///////////////////////////////////////new ---> maybe: object but  not nescessary
height = 0;//not nescessary
}
public Box3d(int x, int y, int z)
{
super (x, y);//// delete supper is not impact to program
height = z;
}
public void setval (int x, int y, int z)//// not relate to volume but ---> result= 7344
{
super.setval(x, y);
height = z;
}
public int volume ( )
{
return (area ( ) * height );// use contructor from box class
}
public static void main(String[] args) 
	
{
Box b1 = new Box ( );
Box3d b2 = new Box3d(12,34,18);
b1.setval (25,30);
System.out.println ("The area of b1 is : " + b1.area( ) );
System.out.println ("The volume of b2 is : "+ b2.volume ( ));//----> return result: 
System.out.println(12*34*18);
System.out.println(25*30);
System.out.println(750*18);

}
}