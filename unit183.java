import java.awt.*;
public class unit183 extends Frame
{
public unit183()
{
super ("Flow Layout 1");
setLayout (new FlowLayout ( ) );
add (new Button ( "Button 1") );
add (new Button ("Button 2") );
add ( new Button ("Button 3") );
add ( new Button (" Button 4") );
add (new Button (" Button 5") );
setBounds (100,100,200,100);
setVisible (true);
}
public static void main (String arg [ ])
{
new unit183();
Button button = new Button("Click!");

}
}
/*
<applet code="unit183" width=300 height=100></applet>
*/