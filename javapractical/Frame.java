

import java.awt.*;

 class FirstFrame extends Frame 
 {
 	FirstFrame()
 	{
 		Button b = new Button("click me");
 		b.setBounds(30,100,80,30);
 		setTitle("Frame by inheritance ");
 		add(b);
 		setSize(300,300);
 		setLayout(null);
 		setVisible(true);
   }
    public static void main(String args[]) 
    	{
        FirstFrame f = new FirstFrame();
        }       
 }
