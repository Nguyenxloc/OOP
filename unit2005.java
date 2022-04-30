// sellect number
import java.awt.*;
public class unit2005 extends Frame
{
Label label = new Label ("Default Text");
Choice choice = new Choice ( );
List list = new List (3, true);
public static void main (String args [ ])
{
unit2005 win = new unit2005 ( );
}
public unit2005 ( )
{
super ("ListExample" );
addMenus();
addComponents();
pack();
resize(400,400);
show();
}
void addMenus()
{
MenuBar menubar = new MenuBar();
Menu file = new Menu("file");
file.add("Quit");
menubar.add(file);
setMenuBar(menubar);
}
void addComponents()
{
add("North", label );
label.setAlignment (Label.CENTER);
Panel panel = new Panel();
Panel panel1 = new Panel();
Panel panel2 = new Panel();

try {
choice.addItem ("one");
choice.addItem("two");
choice.addItem ("three");
}catch (NullPointerException ex)
{
}
panel1.add (choice);
list.addItem ("four");
list.addItem ("five");
list.addItem ("six");
list.addItem ("seven");
list.addItem ("eight");
panel2. add (list );
panel.add(panel1);
panel.add(panel2);
add("Center", panel);
}
public boolean handleEvent (Event event)
{
if (event.id == Event.WINDOW_DESTROY ) {
System.exit (0);
return true;
}
else if (event.id == Event.ACTION_EVENT && event .target instanceof MenuItem)
{
if ("Quit".equals(event.arg) )
{
System.exit (0);
return true ;
}
else
{
return false;
}
}
else
if (event.target instanceof Choice || event.target instanceof List )
{
String text = choice. getSelectedItem () + " ";
for (int i=0;i<5;++i)
{
if (list.isSelected (i) )
text += list.getItem (i) + " ";
}
label.setText(text);
return true;
}

else return false;
}
}
/*
<applet code="unit2005" width=300 height=100></applet>
*/