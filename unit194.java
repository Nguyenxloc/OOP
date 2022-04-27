
import java.awt.*;
public class unit194 extends Frame
{
public unit194 ( )
{
super ("Border Layout 1");
setFont (new Font ("Helvetica", Font.PLAIN, 16) );
setLayout (new BorderLayout (10, 10) );
Panel p1 = new Panel();
p1.add (new Button ("Button 1") );
add ("West", p1);
Panel p2 = new Panel();
p2.add ( new Button ("Button 2" ) );
add( "North", p2);
Panel p3 = new Panel();
p3.add ( new Button ("Button 3") );
add ("East", p3);
Panel p4 = new Panel();
p4.add ( new Button ("Button 4") );
add ("South", p4);
Panel p5 = new Panel();
p5.add ( new Button ("Button 5") );
add ("Center", p5);
setBounds (500, 500, 500, 500);
setVisible (true);
}
static public void main (String [ ]argv )
{
new unit194 ( );
}
}
/*
<applet code="unit194" width=300 height=100></applet>
*/