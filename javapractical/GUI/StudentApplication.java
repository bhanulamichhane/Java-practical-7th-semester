import java.awt.*;
import javax.swing.JFrame;

public class StudentApplication extends JFrame
{
  	public StudentApplication()
	{	
		JLabel 1l=new JLabel("Student Address Book");
		l1.setBounds(100,10,300,40);
		Button b = new Button("Register");
		b.setBounds(100,200,100,70);
		Button b1 = new Button("Search");
		b1.setBounds(100,200,100,70);
		Button b2 = new Button("Update");
		b2.setBounds(100,200,100,70);
		Button b3= new Button("Delete");
		b3.setBounds(100,200,100,70);
		setTitle("Student Application");
		add(l1);
		add(b);
		add(b1);
		add(b2);
		add(b3);
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);

	}
public static void main(String args[])
	{
		StudentApplication win = new StudentApplication();
 
	}
		

}