
import java.awt.*;
public class unit192 extends Frame
{
public unit192()
{
super (" Grid Layout 1");
setLayout (new GridLayout (3, 3, 30, 5) );
add (new Button ("Button 1" ) );
add (new Button ("Button 2") );
add (new Button ( "Button 3") );
add (new Button ( "Button 4" ) );
add (new Button ("Button 5" ) );
setBounds(100,100,200,100);
setVisible (true);
}
public static void main(String arg [ ])
{
new unit192();
}
}
/*
<applet code="unit192" width=300 height=100></applet>
*/