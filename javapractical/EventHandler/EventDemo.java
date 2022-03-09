import javax.swing.*;
import java.awt.event.*;
class EventDemo extends JFrame implements ActionListener
{
	JTextField tf;
     	EventDemo()
		{
       		tf=new JTextField(15);
		tf.setBounds(60,50,170,20);
		setLayout(null);
		JButton b = new JButton("Click Me");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(300,300);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome");
	}
	public static void main(String args[])
	{
		new EventDemo();
	}
}
