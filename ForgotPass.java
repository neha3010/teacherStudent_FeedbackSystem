import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ForgotPass extends JFrame implements ActionListener {
JTextField t1,t2,t3,t4,t;
JLabel l1,l2,l3,l4;
JButton b1,b2;
JRadioButton c1,c2,c3;
ButtonGroup c;//Container c;
public ForgotPass(){
   c = new ButtonGroup();
   //c = this.getContentPane();
   this.setLayout(null);
   
   l1 = new JLabel("Choose your Designation :");
   l1.setBounds(30,20,300,20);
   add(l1);
  
   c1 = new JRadioButton("Student");
   c1.setBounds(30,50,100,20);
   c1.setSelected(true);
   add(c1);
   c2 = new JRadioButton("Teacher");
   c2.setSelected(false);
   c2.setBounds(140,50,100,20);
   add(c2);
   c3 = new JRadioButton("Admin");
   c3.setSelected(false);
   c3.setBounds(260,50,100,20);
    add(c3); 
    
   c.add(c1);
   c.add(c2);
   c.add(c3);
   //c.add(cb);
   
   l4 = new JLabel("Branch?");
   l4.setBounds(30,90,100,20);
   add(l4);
   l4.setVisible(false);
   t1 = new JTextField("");
   t1.setBounds(90,90,100,20);
   add(t1);
   t1.setVisible(false);
   //q1
   l2 = new JLabel("What is your favorite book?");
   l2.setBounds(30,120,500,20);
   l2.setVisible(false);
   add(l2);
   t2 = new JTextField("");
   t2.setBounds(40,140,100,20);
   t2.setVisible(false);
   add(t2);
   //q2
   l3 = new JLabel("What is your favorite color?");
   l3.setBounds(30,170,500,20);
   l3.setVisible(false);
   add(l3);
   t3 = new JTextField("");
   t3.setBounds(40,190,100,20);
   t3.setVisible(false);
   add(t3);
   //button
   b1 = new JButton("Submit");
   b1.setBounds(90,230,100,20);
   add(b1);
   b1.setVisible(false);
   b1.addActionListener(this);
   c1.addActionListener(this);
   c2.addActionListener(this);
   c3.addActionListener(this);
   
   b2 = new JButton("Back");
   b2.setBounds(30,290,100,20);
   b2.setVisible(false);
   add(b2);
   b2.addActionListener(this);
   
 }
   public void actionPerformed(ActionEvent ae){
       String s = ae.getActionCommand();
       if(c1.isSelected()){
            l4.setVisible(true);
            t1.setVisible(true);
            l2.setVisible(true);
            t2.setVisible(true);
            l3.setVisible(true);
            t3.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
           if(s.equals("Submit")){
         if(t1.getText().equals("CSE")&&t2.getText().equals("Harry Potter")&&t3.getText().equals("Purple")){
              t = new JTextField("Password : 18501");
               t.setBounds(30,260,200,20);
               add(t);
           }
       
         if(t1.getText().equals("CE")&&t2.getText().equals("Harry Potter")&&t3.getText().equals("Purple")){
              t = new JTextField("Password : 18101");
               t.setBounds(30,260,200,20);
               add(t);
           }
         if(t1.getText().equals("ME")&&t2.getText().equals("Harry Potter")&&t3.getText().equals("Purple")){
              t = new JTextField("Password : 18301");
               t.setBounds(30,260,200,20);
               add(t);
           }

         if(t1.getText().equals("EEE")&&t2.getText().equals("Harry Potter")&&t3.getText().equals("Purple")){
              t = new JTextField("Password : 18201");
               t.setBounds(30,260,200,20);
               add(t);
           }
              }
        }
      
        if(c2.isSelected()){
            //t1.setVisible(true);
            l2.setVisible(true);
            t2.setVisible(true);
            l3.setVisible(true);
            t3.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            if(s.equals("Submit")){
         if(t2.getText().equals("Harry Potter") && t3.getText().equals("Purple")){
              t = new JTextField("Password : Test123");
               t.setBounds(30,260,200,20);
               add(t);
           }
        }
          }
     
        if(c3.isSelected()){
            //t1.setVisible(true);
            l2.setVisible(true);
            t2.setVisible(true);
            l3.setVisible(true);
            t3.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            if(s.equals("Submit")){
         if(t2.getText().equals("Harry Potter") && t3.getText().equals("Purple")){
              t = new JTextField("Password : Test@1234");
               t.setBounds(30,260,200,20);
               add(t);
           }    
     }
        }
          if(s.equals("Back")){
           this.dispose();
            }
       
   }

 
public static void main(String []args){
      ForgotPass fp = new ForgotPass();
      fp.setSize(400,400);
      fp.setVisible(true);
      fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 } 