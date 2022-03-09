import javax.swing.*;
import java.awt.*;

public class GridBagDemo extends Frame 
{
   JButton b1, b2, b3, b4, b5;
   GridBagConstraints gc;
   public GridBagDemo()
  {
    b1=new JButton("Button1");
    b2=new JButton("Button2");
    b3=new JButton("Button3");
    b4=new JButton("Button4");
    b5=new JButton("Button5");
     setTitle("Card layout demo");
     setLayout(new GridBagLayout());
     gc = new GridBagConstraints();

     gc.gridx=0;
     gc.gridy=0 ;
     gc.fill = GridBagConstraints.HORIZONTAL;
     add(b1,gc);
     
     gc.gridx=1;
     gc.gridy=0;
     add(b2,gc);

     
     gc.gridx=2;
     gc.gridy=0; 
     add(b3,gc);
     
     
     gc.gridx=0;
     gc.gridy=1; 
     gc.ipady=10;
     gc.gridwidth=3;
     add(b4,gc);
     
     
     gc.gridx=1;
     gc.gridy=2; 
     gc.ipady=0;
     gc.gridwidth=2;
     gc.weighty=0.5;
     gc.anchor = GridBagConstraints.PAGE_END;
     add(b5,gc);
      
      setSize(400,300);
      setVisible(true);
   }
public static void main(String args[])
   {
     GridBagDemo win = new GridBagDemo();
   }

}