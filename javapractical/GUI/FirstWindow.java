import java.awt.*;
import javax.swing.JFrame;

public class FirstWindow extends JFrame
{
  public StudentApplication()
{
Button b = new Button("Register");
b.setBounds(100,200,100,70);
Button b = new Button("Search");
b.setBounds(100,200,100,70);
Button b = new Button("Update");
b.setBounds(100,200,100,70);
Button b = new Button("Delete");
b.setBounds(100,200,100,70);
setTitle("Student Application");
add(b);
setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400,400);
setVisible(true);

}
public static void main(String args[])
{
StudentApplication win = new StudentApplication();
 
}
}