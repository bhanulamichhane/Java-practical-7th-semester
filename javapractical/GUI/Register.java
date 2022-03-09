import java.awt.*;
import javax.swing.JFrame;

public class Register extends JFrame
{
  	public Register()
	{	
		Button Submit;
		
		JLabel l1=new JLabel("Name");
		l1.setBounds(100,10,300,40);
		JLabel l2=new JLabel("City");
		l2.setBounds(100,10,300,40);
		JLabel l3=new JLabel("Phone");
		l3.setBounds(100,10,300,40);	
		JTextField f1=new JTextField();
		JTextField f2=new JTextField();
		JTextField f3=new JTextField();
		Submit=new Button();
		add(Submit);
		add(l1);
		add(l2);
		add(l3);
		l1.add(f1);
		l2.add(f2);
		l3.add(f3);
		setTitle("Student Registration");
		setLayout(new GridLayout(3,3));
		setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		submit.addActionListener(this);
	}
public static void main(String args[])
	{
		Register rs = new Register();
 
	}
	

}