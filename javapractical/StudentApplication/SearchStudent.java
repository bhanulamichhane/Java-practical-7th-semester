import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SearchStudent extends JFrame implements ActionListener
{
	JLabel l;
	JTextField tf;
	JButton b;
	public SearchStudent()
	{
		l = new JLabel("Name");
		tf = new JTextField(10);
		b = new JButton("Search");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(l); add(tf);add(b);
		setTitle("Search Student");
		setSize(350,250);
		b.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		JButton btn =(JButton) evt.getSource();

		
	}

}