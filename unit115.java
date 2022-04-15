//write program using modifiers.
import java.lang.reflect.*;
import java.util.*;
class Modi
{
public static void main(String a[])throws ClassNotFoundException
{
Class c = Class.forName("Lang");
Method m[] = c.getDeclaredMethods();
for(int i =0; i < m.length; i++)
{
int mo = m[i].getModifiers();
if (Modifier.isPublic(mo))
System.out.println(m[i].getName());
}
}
}