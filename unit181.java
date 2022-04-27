// aniLogo rev
// text move width
import java.awt.*;
public class unit181 extends java.applet.Applet implements Runnable
{
Rectangle r;
// Declare the object variable array StrLine with 3 values .
String StrLine[] = new String[3];
Font appFont;
// Create a Thread object called myThread
Thread myThread = null;
// declare width array
int width[] = new int[3];
public void init()
{
// A for loop to find the three lines of text.
for(int i=0;i < 3;i++)
{
String att = getParameter("Text" + i);
StrLine[i] = (att == null) ? ("please put a parameter in Text" + i ) : att;
}
appFont = new Font("Helvetica", Font.BOLD, 28);
// Set r = to the bounds of the applet
r = bounds();
}
// Override this methods from the interface Runnable
public void run()
{
// Set the current Threads priority.
Thread.currentThread().setPriority(Thread.NORM_PRIORITY-1);
// Initialize the locations of the two lines of text to be
// of the screen.
width[1] = 2000;
width[2] = 2000;
repaint();
// Algorithm to send the first line of Text across the screen.
for(int i = -50;i < r.width/2; i+=7)
{
width[0] = i;
repaint();
// Rest
Rest(1);
}
// Algorithm to send the second line of text across the screen.
for(int i=r.width + 20; i > r.width/2; i -= 7)
{
width[1] = i;
repaint();
Rest(1);
}
// Algorithm to send the third line of text across the screen
for(int i = 90; i < r.width/2; i += 7)
{
width[2] = i;
repaint();
// Rest
Rest(1);
}
}
void Rest(int r)
{
// Rest for a period of time
try
{
myThread.sleep(100*r);
}catch(InterruptedException e)
{
return;
}
}
public void start()
{
if (myThread == null)
{
myThread = new Thread(this);
myThread.start();/// animation
}
}
public void stop()
{
if (myThread != null)
{
myThread.stop();
myThread = null;
}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.setFont(appFont);
for(int i =0;i < 3;i++)
{
g.drawString(StrLine[i],width[i] +(10+i),30 +(125*i));
}
}
}
/*
<applet code="unit181" width=300 height=100></applet>
*/