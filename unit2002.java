import java.awt. *;
public class PanelExample extends Frame
{
public static void main (String args[] )
{
panelExample win = new panelExample();
}
public panelExamaple ()
{
super ("panelExample");
pack ( );
resize (400,400);
addMenus ( );
addpanel ( );
show ( );
}
void addMenus ( ) {
MenuBar menubar = new MenuBar ( );
Menu file = new Menu("File");
file.add ("Quit" );
menubar.add (file);
setMenuBar (menubar);
}
void addpanel ( ) {
Panel panel = new Panel();
panel.add(new Button ("one") );
panel.add (new Button ("two") );
panel.add (new Button ("three") );
panel.add (new Button ("four") );
panel.add (new Button ("five") );
add ("South", panel );
}
public boolean handleEvent (Event event ) {
if(event.id == Event.WINDOW_DESTROY) {
System.exit ( 0);
return true;
}else if (event.id ==Event.ACTION_EVENT && event.target instanceof MenuItem ) {
if("Quit", equals (event .arg) ) {
System.exit (0);
return true;
}else {
return false;
}
}else return false;
}
}
/*
<applet code="unit201" width=300 height=100></applet>
*/