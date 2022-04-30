import java.awt.*;
public class grid1 extends Frame
{
public grid1()
{
super (" Grid Layout 1");
setLayout (new GridLayout (3, 3, 30, 5) );
add (new Button ("Button 1" ) );
add (g.drawString(lastdate, 5, 125);
}
if (xm != lastxm || ym != lastym) {
g.drawLine(xcenter, ycenter-1, lastxm, lastym);
g.drawLine(xcenter-1, ycenter, lastxm, lastym); }
if (xh != lastxh || yh != lastyh) {
g.drawLine(xcenter, ycenter-1, lastxh, lastyh);
g.drawLine(xcenter-1, ycenter, lastxh, lastyh); }
g.setColor(numberColor);
g.drawString("", 5, 125);
g.drawString(today, 5, 125);
g.drawLine(xcenter, ycenter, xs, ys);
g.setColor(handColor);
g.drawLine(xcenter, ycenter-1, xm, ym);
g.drawLine(xcenter-1, ycenter, xm, ym);
g.drawLine(xcenter, ycenter-1, xh, yh);
g.drawLine(xcenter-1, ycenter, xh, yh);
lastxs=xs; lastys=ys;
lastxm=xm; lastym=ym;
lastxh=xh; lastyh=yh;
lastdate = today;
currentDate=null;
}
public void start() {
timer = new Thread(this);
timer.start();
}
public void stop() {
timer = null;
}
public void run() {
Thread me = Thread.currentThread();
while (timer == me) {
try {
Thread.currentThread().sleep(100);
} catch (InterruptedException e) {
}
repaint();
}
}
public void update(Graphics g) {
paint(g);
}
public String getAppletInfo() {
return "Title: A Clock \nAuthor: Rachel Gollub, 1995 \nAn analog clock.";
}
public String[][] getParameterInfo() {
String[][] info = {
{"bgcolor", "hexadecimal RGB number", "The background color. Default is the color of your browser."},
{"fgcolor1", "hexadecimal RGB number", "The color of the hands and dial. Default is blue."},
{"fgcolor2", "hexadecimal RGB number", "The color of the seconds hand and numbers. Default is dark gray."}
};
return 
}

