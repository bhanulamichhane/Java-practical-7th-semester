import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class UpdateStudent extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b;
	public UpdateStudent()
	{
		l1 = new JLabel("ID");
		tf1 = new JTextField(10);	
		l2 = new JLabel("Updated City");
		tf2 = new JTextField(10);
		b = new JButton("Submit");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		setTitle("Update Student");
		setSize(350,250);
		b.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		JButton btn =(JButton) evt.getSource();

	}

}