import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class StudentApplication extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	
	public StudentApplication()
	{
		
		b1 = new JButton("Register");
		b2= new JButton("Search");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");
		setLayout(new GridLayout());
		setTitle("Student Application");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setSize(350,250);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public static void main(String args[])
	{
		StudentApplication win = new StudentApplication();
	}
	public void actionPerformed(ActionEvent evt)
	{
		JButton b =(JButton) evt.getSource();

		if(b==b1)	{RegisterStudent rstd= new RegisterStudent();}
		if(b==b2)	{SearchStudent sstd= new SearchStudent();}
		if(b==b3)	{UpdateStudent ustd= new UpdateStudent();}
		if(b==b4)	{DeleteStudent dstd= new DeleteStudent();}
		
	}

}