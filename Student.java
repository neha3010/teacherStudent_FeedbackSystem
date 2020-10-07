import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Student extends JFrame implements ActionListener{
  Container c;
  Button s1, s2;


  Student(){
    c = getContentPane();
    c.setLayout(null);

    s1 = new Button("Student 1");
    s1.setBounds(50, 50, 100, 50);

    c.add(s1);


    s2 = new Button("Student 2");
    s2.setBounds(50, 100, 100, 50);

    c.add(s2);



    s1.addActionListener(this);
    s2.addActionListener(this);


  }

  public void actionPerformed(ActionEvent e){

      if(e.getSource()==s1){

        CheckFeedBack af = new CheckFeedBack();
        af.setSize(4960,7016);
        af.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
        af.setVisible(true);

        }



      else if(e.getSource()==s2){

        CheckFeedBack2 af2 = new CheckFeedBack2();
        af2.setSize(4960,7016);
        af2.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
        af2.setVisible(true);


      }

  }

  public static void main(String args[]){

    Student st = new Student();
    st.setSize(400,400);
    st.setTitle("Choose Student number");
    st.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
  //  st.setLayout(null);
    st.setVisible(true);


  }


}
