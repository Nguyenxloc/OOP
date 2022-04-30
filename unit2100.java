//text box 
import java.awt. *;
                             public class unit2100 extends Frame {
TextField textfield = new TextField ("Enter text here.");
TextArea textarea = new TextArea ("And it will be inserted here !");
                             public static void main(String args[])
{
unit2100 win = new unit2100();
}
                             public unit2100()
{
super ("TextExample");
addComponents();
pack();
resize(400,400);
show();
}
                                               void addMenus()
{
MenuBar menubar = new MenuBar ( );
Menu file = new Menu("File");
file.add("Quit");
menubar.add (file);
setMenuBar(menubar);
}
                                               void addComponents()
{
add ("North", textfield);
add("Center", textarea);
}
                              public boolean handleEvent(Event event)
{
if (event.id == Event.WINDOW_DESTROY)
{
System.exit(0);
return true;
}
else
if(event.id == Event.ACTION_EVENT && event.target instanceof MenuItem )
{
if ("Quit".equals(event.arg))
{
System.exit (0);
return true;
}
else

{
return false ;
}
}
else{
if (event.id == Event.ACTION_EVENT && event.target instanceof TextField )
{
textarea.insertText(textfield.getText() + "\n", 0);
return true;
}
else return false;
}
}
}
/*
<applet code="unit2100" width=300 height=100></applet>
*/
