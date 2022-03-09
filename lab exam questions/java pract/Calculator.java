import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener
{	
	JLabel lb1,lb2,lb3,lb4;
	JButton b1,b2,b3;
	JTextField tf1,tf2,tf3;
	public Calculator()
	{
		
		
		lb1 = new JLabel("Calculator");
		lb2 = new JLabel("Num 1:");
		lb3 = new JLabel("Num 2:");
		lb4 = new JLabel("Result:");
		b1= new JButton("+");
		b2= new JButton("-");
		b3= new JButton("*");
		tf1= new JTextField();
		tf2= new JTextField();
		tf3= new JTextField();
		setLayout(null);
		setTitle("Calculator");
		
		lb1.setBounds(100,10,100,20);
		lb2.setBounds(20,40,50,20);
		lb3.setBounds(20,70,50,20);
		lb4.setBounds(80,150,50,20);
		b1.setBounds(20,100,50,30);
		b2.setBounds(80,100,50,30);
		b3.setBounds(140,100,50,30);
		tf1.setBounds(80,40,50,20);
		tf2.setBounds(80,70,50,20);
		tf3.setBounds(140,150,50,20);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(b1);
		add(b2);
		add(b3);
		add(tf1);
		add(tf2);
		add(tf3);
		setSize(300,300);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String args[])
	{
		Calculator c1= new Calculator();
	}
	public void actionPerformed(ActionEvent evt)
	{
		JButton b =(JButton) evt.getSource();
		int n1,n2,res;
		n1= Integer.parseInt(tf1.getText());
		n2= Integer.parseInt(tf2.getText());
		
		
		if(b==b1)	
		{
			res = n1+n2;
			tf3.setText(String.valueOf(res));
		}
		if(b==b2)	
		{
			res = n1-n2;
			tf3.setText(String.valueOf(res));
		}
		if(b==b3)	
		{
			res = n1*n2;
			tf3.setText(String.valueOf(res));
		}
		
		
	}
}

