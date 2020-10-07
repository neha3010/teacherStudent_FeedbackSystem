import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener{
JButton b1,b2;
TextField tf1,tf2;
JLabel l1,l2;
Container c;
public AdminLogin(){
c = this.getContentPane();
c.setLayout(null);
c.setBackground(Color.gray);
l1 = new JLabel("Username:",Label.LEFT);
l1.setBounds(150,70,90,20);
tf1 = new TextField();
tf1.setBounds(150,90,90,20);
l2 = new JLabel("Password",Label.LEFT);
l2.setBounds(150,120,90,20);
tf2 = new TextField(5);
tf2.setBounds(150,140,90,20);
b1 = new JButton("LOGIN");
b1.setBounds(100,180,80,20);
b2 = new JButton("Forgot Password");
b2.setBounds(210,180,150,20);
tf2.setEchoChar('*');
c.add(l1);
c.add(tf1);
c.add(l2);
c.add(tf2);
c.add(b1);
c.add(b2);
tf1.addActionListener(this);
tf2.addActionListener(this);
b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae){
 String s = ae.getActionCommand();
   if(s.equals("LOGIN")){
     String n = tf1.getText();
     String p = tf2.getText();
    if(n.equals("admin1")&& p.equals("Test@1234")){
     JLabel l = new JLabel("Login Successful!",Label.LEFT);
     l.setBounds(120,210,130,20);
     c.add(l);
    }
    else{
     JLabel l = new JLabel("Incorrect Username or Password",Label.LEFT);
     l.setBounds(120,210,200,20);
     c.add(l);
     }
  }

}
public static void main(String []args){
  AdminLogin a = new AdminLogin();
  a.setVisible(true);
  a.setSize(400,400);
  a.setTitle("Admin Login");
  a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
