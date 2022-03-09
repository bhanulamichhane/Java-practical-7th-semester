import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RegisterStudent extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf1, tf2, tf3;
	JButton b;
	public RegisterStudent()
	{
		l1 = new JLabel("Name");
		l2 = new JLabel("City");
		l3 = new JLabel("Phone");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		b = new JButton("Submit");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(l1); add(tf1); add(l2); add(tf2); add(l3);add(tf3);add(b);
		setTitle("Register Student");
		setSize(350,250);
		b.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		String name = tf1.getText();
		String phone = tf2.getText();
		String city = tf3.getText();
		StudentQuery sq = new StudentQuery();
		Student std = new Student(name,phone,city);
		sq.insertStudent(std);

		
	}

}