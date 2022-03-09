import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DeleteStudent extends JFrame implements ActionListener
{
	JLabel lb;
	JTextField tf;
	JButton b;
	public DeleteStudent()
	{
		lb = new JLabel("ID");
		tf= new JTextField(10);	
		b = new JButton("Delete");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(lb); add(tf);add(b);
		setTitle("Delete Student");
		setSize(350,250);
		b.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		JButton btn =(JButton) evt.getSource();

		
	}

}