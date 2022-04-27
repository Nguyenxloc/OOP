// program to create a dialobox and menu
import java.awt.*;
public class DialogExample extends Frame
{
Dialog dialog;
public static void main (String args [ ])
{
DialogExample win = new DialongExample();
}
public DialogExample ( )
{
super ("DialogExample");
pack ( );
resize (400,400);
createDialog();
show();
}
void addMenus()
{
MenuBar menubar = new MenuBar();
Menu file = new Menu ("File");
Menu dialog = new Menu ("Dialog");
file.add ("Quit");
dialog.add("Show");
dialog.add("Hide");
menubar.add (file);
menubar.add(file);
menubar.add(dialog);
setMenuBar (menubar);
}
void createDialog ( )
{
dialog = new Dialog (this, "Dialog Box", false);
dialog.resize (200,200);
}
public boolean handleEvent(Event event)
{
if (event.id ==Event.WINDOW_DESTROY)
{
System.exit (0);
return true;
}
else if (event.id == Event.ACTION_EVENT &&event.target instanceof MenuItem)
{
if ("Quit." equals (event.arg) )
{
System.exit (0);
return true;
} else if ("Show".equals (event.arg ) ) {
dialog.show ( );
return true;
} else
{
dialog.hide ();
return true;
}
}
else
return false;
}
}
/*
<applet code="unit183" width=300 height=100></applet>
*/