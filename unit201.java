//Win version 1.0 rev
import java.awt.*;
public class unit201 extends java.applet.Applet
{
public void init()
{
// Set the Layout to FlowLayout
setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
// Add a Label and a Button
add (new Label("Please press the button below:"));
Button show = new Button("Show Window");

add(show);
setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
add (new Label("Please press the button below:"));
Button abc = new Button("abc");
add(abc);
}
}
// After compiling this run the program using appletviewer.
// create a following HTML coding.
// appletviewer filename (html file name).
/*
<applet code="unit201" width=300 height=100></applet>
*/