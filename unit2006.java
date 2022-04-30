// get coordinate of mouse 
import java.awt.*;
import java.applet.*;
      public class unit2006 extends Applet
{
private String message = "Waiting for events . . .";
// Default constructor

     public unit2006 ( )////func (1)
{
// Call superclass
super ( );
}
// Init method, called when applet first initializes public void


     public void init () ///// func(2) bachground of applet
{
setBackground(Color.black );
}
// Overridden paint method

     public void paint ( Graphics g)///// func(3) /// color of text 
{
g.setColor( Color.blue );
g.drawString (message, 0, size ( ).height - 10);
}
// Overridden methods for event handling

     public boolean mouseEnter1 (Event evt1, int x, int y)///////// func(4)// event coordinate mouse
{

// Set message ………
message = "mouseEnter – x:" + x +" Y:" + y;// … and repaint applet
repaint();
// Signal we have handled the event
return true;
}

       public boolean mouseExit (Event evt1, int x, int y)/////// func (5)/// mouse exit()
{
// Set message …….
message = " mouseOut – x : " + x + "y :" + y;
// …. and repaint applet
repaint();
// Signal we have handled the event
return true;
}

       public boolean mouseMove (Event evt1, int x, int y)////// func(6) mouse move
{
// Set message ……
message = "mouseMove – x: " + x +"y:" + y;
// ….. and repaint applet
repaint();
// Signal we have handled the event
return true;
}
// Mouse click event

       public boolean mouseDown (Event evt1, int x, int y )////// func(7)  mouse down
{
// Set message …..
message = "mouseDown – x: " + x + " y: "+ y;
// … and repaint applet
repaint();
// Signal we have handled the event
return true ;
}
}
/*
<applet code="unit2006" width=300 height=100></applet>
*/