import java.awt.*;
      public class unit2003 extends Frame {
Label label = new Label ("Default Text");// text
Checkbox checkbox[] = new Checkbox[6];// array
public static void main (String args [] ) {
unit2003 win = new unit2003();
}



      public unit2003()
{
super ("check box");
addMenus();
addComponents();
pack();
resize(400,400);
show();
}


       void addMenus() {
MenuBar menubar = new MenuBar();
Menu file = new Menu("File");
file.add("Quit");
menubar.add(file);
setMenuBar (menubar);
file.add("exit");
menubar.add(file);
setMenuBar (menubar);
Menu  option = new Menu("option");
option.add("setting");
menubar.add(option);
setMenuBar(menubar);
menubar.add(option);
}


      void addComponents ( ) {// set stick square

add ("North", label );
label.setAlignment(Label.CENTER);
Panel panel = new Panel();
Panel panel1 = new Panel();
panel1.setLayout (new GridLayout (3,1) );
Panel panel2 = new Panel();
panel2. setLayout (new GridLayout (3,1) );
checkbox [0] = new Checkbox ("one");
checkbox [1] = new Checkbox ("two");
checkbox [2] = new Checkbox ("three");
CheckboxGroup group = new CheckboxGroup ( ) ;//// remove it : "default text " not change while click
checkbox [3] = new Checkbox ("four", group, false );
checkbox [4] = new Checkbox ("five", group, false );
checkbox [5] = new Checkbox ("six", group, false );
for (int i=0;i<3;++i )
panel1.add (checkbox [i]);
panel.add (panel1);
panel.add(panel2);
add("Center", panel);
}


       public boolean handleEvent (Event event)
{
if (event.id == Event.WINDOW_DESTROY) {
System.exit (0);
return true;
}else if (event.id == Event.ACTION_EVENT && event.target instanceof MenuItem) {
if ("Quit".equals(event.arg ) ) {
label.setText("abc");
return true;
}
else
{
return false;
}
}
else if (event.id == Event.ACTION_EVENT && event.target instanceof Checkbox ) {
String text ="";
for (int i=0;i<6; ++i) {
if (checkbox [i].getState ( ) )
text += checkbox[i].getLabel ( ) + " ";
}
label.setText(text);
return true;
}
else return true;
}
}
/*
<applet code="unit2003" width=300 height=100></applet>
*/