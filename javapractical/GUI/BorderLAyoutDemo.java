import javax.swing.*;

import java.awt.*;

public class BorderLayoutDemo extends JFrame 
{
 
   JButton b1, b2, b3,b4,b5;
  public BorderLayoutDemo()
{
 b1 = new JButton("First Button ");
 b2 = new JButton("Second Button ");
 b3 = new JButton("Third Button ");
 b4 = new JButton("Fourth Button ");
 b5 = new JButton("Fifth Button ");
 
setTitle("Border layout demo");
setLayout(new BorderLayout());
add(b1,BorderLayout.SOUTH);add(b2,BorderLayout.NORTH);add(b3,BorderLayout.EAST);add(b4,BorderLayout.CENTER); add(b5,BorderLayout.WEST);

setSize(400,300);
setVisible(true);
}
public static void main(String args[])
{
 BorderLayoutDemo win = new BorderLayoutDemo();
}

}