
package firstgui;

import java.awt.FlowLayout;
import javax.swing.* ;
import java.awt.*;
public class form extends JFrame
{
    JButton button ,b2 ,b3,b4,b5;
    JLabel label , l2 , l3 , l4 , l5;
public form ()//constructor
{
    
this.setTitle("Hello GUI"); //we can replace this with form but this is the best
this.setSize(500, 200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
this.setResizable(false);
this.setLayout(new FlowLayout());
button =new JButton("Exit prog");
b2 =new JButton("Exit prog");
b3 =new JButton("Exit prog");
b4 =new JButton("Exit prog");
b5 =new JButton("Exit prog");


label=new JLabel("hello world");
l2=new JLabel("hello world");
l3=new JLabel("hello world");
l4=new JLabel("hello world");
l5=new JLabel("hello world");


this.add(label);


this.add(b2);
this.add(l2);

this.add(b3);
this.add(l3);

this.add(b4);
this.add(l4);

this.add(b5);
this.add(l5);

this.add(button);

}
}
