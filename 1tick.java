import java.awt.*;
public class test extends Frame {
Label label = new Label ("waiting ....");// text
Checkbox checkbox[] = new Checkbox[3];// array of class check box to create to box 
public static void main (String args [] ) {
test win = new test();
} 

   public test()
{
super ("check box");
addComponents();
resize(400,400);
show();
pack();
}

void addComponents ( ) {// set stick square

add ("North", label );
label.setAlignment(Label.CENTER);
Panel panel = new Panel();
Panel panel1 = new Panel();// pannel1 is a object off panl
panel1.setLayout (new GridLayout (3,1) );
Panel panel2 = new Panel();///// panel2 is a object off panel
panel2. setLayout (new GridLayout (3,1) );
checkbox [0] = new Checkbox ("one");
checkbox [1] = new Checkbox ("two");
CheckboxGroup group = new CheckboxGroup ( ) ;//// remove it : "default text " not change while click
checkbox [2] = new Checkbox ("four", group, false );

for (int i=0;i<2;++i )
panel1.add (checkbox [i]);
panel.add (panel1);
panel.add(panel2);

add("Center", panel);
}
 public boolean handleEvent (Event event)
{
if (event.id == Event.ACTION_EVENT && event.target instanceof Checkbox ) {
String text ="";/// "" apear while remove tick
for (int i=0;i<2; i++) {// /create 2 if on 1 function
if (checkbox [i].getState ( ) )
text += checkbox[i].getLabel ( ) + " ";
}
label.setText(text);
return true;
}
else return false;
}
}
/*
<applet code="test" width=300 height=100></applet>
*/
