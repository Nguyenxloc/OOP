import java.applet.*; 
 import java.awt.*; 
import java.awt.event.*; 
public class unit2004 extends Applet 
{ 
 Button b[]; 
 TextField t1; 
 String txt=""; 
 int no1=0,no2=0,no3=0; 
 String oprt=""; 
 public void init() 
 { 
 b = new Button[16]; 
 for(int i =0; i <= 9; i++) 
 { 
 b[i] = new Button(i + ""); 
 } 
 b[10] = new Button("+"); 
 b[11] = new Button("-");

 b[12] = new Button("*"); 
 b[13] = new Button("/"); 
 b[14] = new Button("="); 
 b[15] = new Button("C"); 
 t1 = new TextField(25); 
 add(t1); 
 
 for(int i =0; i <= 15; i++) 
 { 
 add(b[i]); 
 b[i].addActionListener(new Bh()); 
 } 
 } 
 class Bh implements ActionListener 
 { 
 public void actionPerformed(ActionEvent e) 
 { 
 String s = e.getActionCommand(); 
 if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") ) 
 { 
 no1 = Integer.parseInt(t1.getText()); 
 oprt = s; 
 t1.setText(no1+ ""); 
 txt = ""; 
 } 
 else if (s.equals("C")) 
 { 
 no1 = no2 = 0; 
 txt = ""; 
 t1.setText(""); 
 } 
 else if (s.equals("=")) 
 { 
 no2 = Integer.parseInt(t1.getText()); 
 if (oprt.equals("+")) 
 t1.setText((no1 + no2) + ""); 
 if (oprt.equals("-")) 
 t1.setText((no1 - no2) + ""); 
 if (oprt.equals("*")) 
 t1.setText((no1 * no2) + ""); 
 if (oprt.equals("/")) 
 t1.setText((no1 / no2) + ""); 
 txt = ""; 
 } 
 else 
 { 
 txt = txt + s; 
 t1.setText(txt); 
 }
}
}
}
/*
<applet code="unit2004" width=300 height=100></applet>
*/