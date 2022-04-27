
import java.awt.*;
public class unit193 extends Frame
{
public unit193()
{
super ("Border Layout 1");
setFont (new Font ("Helvetica", Font. PLAIN, 16 ) );
setLayout (new BorderLayout (5, 5));
add ( new Button ("Button 1"),BorderLayout.WEST);
add ( new Button ("Button 2"),BorderLayout.NORTH);
add ( new Button ("Button 3"),BorderLayout.EAST);
add ( new Button ("Button 4"),BorderLayout.SOUTH);
add ( new Button ("Button 5" ),BorderLayout.CENTER);
setBounds(100, 100, 300, 200);
setVisible(true);
}
public static void main (String arg [ ])
{
new unit193( );
}
}
/*
<applet code="unit193" width=300 height=100></applet>
*/