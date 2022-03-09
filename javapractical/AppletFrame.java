//Create a child frame window from witin an applet 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
 <applet code = "AppletFrame" width = 400 height = 60>
 </applet>
*/

public class AppletFrame extends Applet 
 {
    Frame f;
    public void init() 
	{
		f = new Frame("A frame window");
		f.setSize(150,150);
	    f.setVisible(true);
    }
    public void start()
    { 
    	f.setVisible(false);
    }

    public void paint(Graphics g) {
        g.drawString("this is in applet window", 15, 30);
    }
 }