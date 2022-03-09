import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DisplayStudent extends JFrame
{
	JLabel l1,l2,l3;
	JTextField tf1, tf2, tf3;
	public DisplayStudent()
	{
		l1 = new JLabel("Name");
		l2 = new JLabel("City");
		l3 = new JLabel("Phone");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(l1); add(tf1); add(l2); add(tf2); add(l3);add(tf3);
		setTitle("Register Student");
		setSize(350,250);
		setVisible(true);
	}


}