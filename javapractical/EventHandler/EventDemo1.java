//event handling by outer class
import javax.swing.*;
import java.awt.event.*;
class EventDemo1 extends JFrame 
{
	JTextField tf;
     	EventDemo1()
		{
       		tf=new JTextField(15);
		tf.setBounds(60,50,170,20);
		setLayout(null);
		JButton b = new JButton("Click Me");
		b.setBounds(100,120,80,30);
		b.addActionListener(new Handler(this));
		add(b);
		add(tf);
		setSize(300,300);
		setVisible(true);
		}
	
	public static void main(String args[])
	{
		new EventDemo1();
	}
}
class Handler implements ActionListener
{
	EventDemo1 ed;
	Handler(EventDemo1 e)
	{
	ed=e;
	}
	public void actionPerformed(ActionEvent e)
	{
		ed.tf.setText("Welcome");
	}
}