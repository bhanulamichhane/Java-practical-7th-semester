import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends Frame 
{
   JButton b1, b2, b3, b4, b5;
   public GridLayoutDemo()
  {
    b1=new JButton("Button1");
    b2=new JButton("Button2");
    b3=new JButton("Button3");
    b4=new JButton("Button4");

     add(b1);
     add(b2);
     add(b3);
     add(b4);
     setTitle("Card layout demo");
     setLayout(new GridLayout(2,3));
    setSize(400,300);
    setVisible(true);
   }
public static void main(String args[])
   {
     GridLayoutDemo win = new GridLayoutDemo();
   }

}