// Demonstrate the key event handlers.
///keylisteners 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class unit2008 extends Applet implements KeyListener {
String msg = " ";
int X = 10, Y = 20;
public void init() {// function init
addKeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke) {//// func keypressed
showStatus("Key Down");/// user typed from keyboard
}
public void keyReleased(KeyEvent ke) {//// func keyrealease
showStatus("Key Up");/// machine realease char into display
}
public void keyTyped (KeyEvent ke) {//// func keytyped
msg += ke.getKeyChar();

repaint();
}
public void paint(Graphics g) {///func paint
g.drawString(msg, X, Y);
}
}
/*
<applet code="unit2008" width=300 height=100></applet>
*/