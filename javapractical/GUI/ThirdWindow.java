import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class ThirdWindow extends JFrame implements KeyListener
{
  JLabel l1, l2, l3;
   JTextField tf1,tf2,tf3;
   JButton b;
  public ThirdWindow()
{
 l1 = new JLabel("FirstNumber ");
 l2 = new JLabel("SecondNumber ");
 l3 = new JLabel("ThirdNumber "); 
 tf1= new JTextField(10);
 tf2= new JTextField(10);
b=new JButton("Compute");
 tf3= new JTextField(10);
setTitle("Third Window for key event demo");
setLayout(new FlowLayout(FlowLayout.LEFT,150, 10));
add(l1);add(tf1);add(l2);add(tf2); add(l3);add(tf3);add(b);

setSize(600,600);
setVisible(true);
b.addKeyListener(this);

}
public static void main(String args[])
{
ThirdWindow win = new ThirdWindow();
 }
public void keyPressed(KeyEvent evt)
{
int n1,n2,res;
n1=Integer.parseInt(tf1.getText());
n2=Integer.parseInt(tf2.getText());
if(evt.getKeyChar()=='s')
{
res = n1-n2;
}
else if (evt.getKeyChar()=='a')
{
 res=n1+n2;
}
else
{
tf3.setText("Press a or s"); return;
}
tf3.setText(String.valueOf(res));
}
public void keyTyped(KeyEvent evt)
{
}
public void keyReleased(KeyEvent evt)
{
System.out.println(evt.getKeyCode());
}
}
