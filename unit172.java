// Logo version 1.0 rev
import java.awt.Graphics;
import java.awt.Font;
public class unit172 extends java.applet.Applet
{
// Declare the object variable array StrLine with 2 values.
String StrLine[] = new String[2];
// Declare the Font object called appFont.
Font appFont;
public void init()
{
// Get the value for theObject Oriented Programming with Java
appFont = new Font(" Helvetica",Font.BOLD, 28);
String att = getParameter("Text");
StrLine[0] = (att == null) ? "Please Enter Something in the parameter Text !" : att;
StrLine[1] = (att == null) ? "Please Enter Something in the parameter Text !" : att;
// Construct the font with the following attributes :
// Font Attrib Size appFont = new Font(" Helvetica",Font.BOLD, 28);
}
public void paint(Graphics g)
{
// Set the Font for object g
g.setFont(appFont);
// Display the variable on the screen
g.drawString(StrLine[0], 5, 50);
g.drawString(StrLine[0], 10, 100);
}
}
/*
<applet code="unit172" width=300 height=100></applet>
*/