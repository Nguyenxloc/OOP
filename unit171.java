//applet program to display the "helloworld" in the browser
//browser 
import java.awt.Graphics;
/*
<applet code="Unit171" width=300 height=100></applet>
*/

class Unit171 extends java.applet.Applet
{
public void paint (Graphics g )	
{
g.drawString ("Hello World" , 5, 50 );
}
}


