abstract class debuggable{
abstract void dump()
{
System.out.println("debuggable error: no dump() defined for the class");
}
}
class X extends debuggable{
private int a,b,c;
public:
X( int aa =0,int bb=0,int cc=0)
{
a = aa;
b = bb;
c = cc;
}
void dump()
{
Systen.out.println( "a = " + a +"b=" +b+ "c=" +c);
}
}
class Y extents debuggable{
private int i,j,k;
public:
Y( int ii =0,int jj=0,int kk=0)
{
i = ii;
j = jj;
k = kk;
}
void dump()
{
Systen.out.println( "i = " + i +"j=" +j+ "k=" +k);
}
}
class Z extents debuggable{
private int p,q,r;
public:
Y( int pp =0,int qq=0,int rr=0)
{
p = pp;
q = qq;
r = rr;
}
void dump()
{
Systen.out.println( "p = " + p +"q=" +q+ "r=" +r);
}
}
class abstdemo
{
public static void main(String arg[])
{
X x(1,2,3);
Y y(2,4,5);
Z z;
x = new X;
y = new Y;
z = new Z;
x.dump();
y.dump();
z.dump();
}