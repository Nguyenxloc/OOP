//program display the menubar
//when you click the option it has to display a dialog box stating 
//
import java.awt. *;
public class unit182 extends Frame
{
String menuSelection = "Select a menu item.";
public static void main (String args [ ] ) {
unit182 win = new unit182 ( );
}
public unit182()
{
super ("MenuExample");
pack ( );
resize (400,400);
addMenu( );
show ( );
}
void addMenu()
{
MenuBar menubar = new MenuBar ();
Menu file = new Menu ("File");
Menu edit = new Menu ("Edit");
Menu view = new Menu ("View");
file.add ("Open");
file.add("Save");
file.add("Close");
file.add("Quit");
edit.add( "Copy");
edit.add("Cut");
edit.add ("Zoom");
menubar.add (file);
menubar.add(edit);
menubar.add(view);
setMenuBar(menubar);
}
public void paint(Graphics g)
{
g.drawString (menuSelection,100,100);
}
public boolean handleEvent(Event event)
{
if (event.id ==Event.WINDOW_DESTROY)
{
System.exit (0);
return true;
}
else if (event.id == Event.ACTION_EVENT && event. target instanceof MenuItem )
{
if ("Quit".equals (event.arg) )
{
System.exit (0);
return true;
}
else
{
menuSelection = "You selected" +event.arg.toString ( );
repaint ( );
return true;
}
}
else
return false;
}
}
/*
<applet code="unit182" width=300 height=100></applet>
*/