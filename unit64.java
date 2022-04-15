// outer class have function display
//another class inside the outer class named: inner
// with function name: "display" 
class Outer{
String so = ("This is Outer Class");
void display()
{
System.out.println(so);
}
void test(){/// method test get object froom class
Inner inner = new Inner();///create object in method
inner.display();   /// 
}
//this is an inner class
class Inner{
String si =("This is inner Class");
void display(){///////////////////////object in class Inner 
System.out.println(si);
}
}
}
class InnerClassDemo{
public static void main(String args[]){
Outer outer = new Outer();
outer.display();//////object outer in class Outler and method: display()
outer.test();/////////object outler in class Outer and method: test()
}/// output1:this is outer Class 
}/// output2:this is inner Class 
