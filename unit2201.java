public class cycle extends java.applet. Applet
{
public void init()
{
// Display the this statement at the bottom of the Window
showStatus(“ The applet is initializing …” );
// Pause for a period of time
for(int i = 1;i < 1000000; i++);
}
public void start()
{
showStatus(“ The applet is starting …”);
for(int i =1;i < 1000000;i++);
}
public void destroy()
{
showStatus(“ The applet is being destroyed ...” );
for(int i = 1 ;i < 1000000;i++);
}
}
// After compiling this run the program using appletviewer.
// create a following HTML coding.
// appletviewer filename (html file name).
< applet code = cycle width=200 height=200 >
