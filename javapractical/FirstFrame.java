//Simple example of AWT Frame by Association
import java.awt.*;

 class SecondFrame 
 {
 	SecondFrame()
 	{
 		Frame f = new Frame();
 		Button b = new Button("click me");
 		b.setBounds(30,100,80,30);
 		f.setTitle("Frame by Association");
 		f.add(b);
 		f.setSize(300,300);
 		f.setLayout(null);
 		f.setVisible(true);
   }
    public static void main(String args[]) 
    	{
        SecondFrame f = new SecondFrame();
        }       
 }
