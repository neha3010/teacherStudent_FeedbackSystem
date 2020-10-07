import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class CheckAttendance extends JFrame implements ActionListener,ItemListener{
Container c;
TextField u; Choice b;
JLabel n,br;
JButton check;String item;


public CheckAttendance(){
  c = this.getContentPane();
  c.setLayout(null);
  c.setBackground(Color.gray);
  n = new JLabel("Roll Number",JLabel.LEFT);
  u = new TextField();
  br = new JLabel("Branch",JLabel.LEFT);
  n.setBounds(150,70,90,20);
  u.setBounds(150,90,90,20);
  br.setBounds(150,120,90,20);
  b = new Choice();
  b.setBounds(150,140,90,20);
  b.add("Select");
  b.add("CSE");
  b.add("EEE");
  b.add("ME");
  b.add("CE");
  c.add(n);
  c.add(u);
  c.add(br);
  c.add(b);
  check = new JButton("Check");
  check.setBounds(150,180,80,20);
  c.add(check);
  b.addItemListener(this);
  check.addActionListener(this);

 }
public void itemStateChanged(ItemEvent ie){
 }
public void actionPerformed(ActionEvent ae){

   item = b.getSelectedItem();
   String s = u.getText();
   if(s.equals("18XJ1A0501") && item.equals("CSE")){
      JTextField st = new JTextField("Student Name : A",JLabel.LEFT);
      st.setBounds(100,210,200,20);
      JTextField rn = new JTextField("Roll Number : 18XJ1A0501 (CSE)",JLabel.LEFT);
      rn.setBounds(100,240,200,20);
      JTextField atn = new JTextField("Attendance : 90%",JLabel.LEFT);
      atn.setBounds(100,270,200,20);
      c.add(st);
      c.add(rn);
      c.add(atn);
    }
   else if(s.equals("18XJ1A0201") && item.equals("EEE")){
      JLabel st = new JLabel("Student Name : B",JLabel.LEFT);
      st.setBounds(100,210,200,20);
      JLabel rn = new JLabel("Roll Number : 18XJ1A0201 (EEE)",JLabel.LEFT);
      rn.setBounds(100,240,200,20);
      JLabel atn = new JLabel("Attendance : 80%",JLabel.LEFT);
      atn.setBounds(100,270,200,20);
      c.add(st);
      c.add(rn);
      c.add(atn);
    }
   else if(s.equals("18XJ1A0301") && item.equals("ME")){
      JTextField st = new JTextField("Student Name : C",JLabel.LEFT);
      st.setBounds(100,210,200,20);
      JTextField rn = new JTextField("Roll Number : 18XJ1A0301 (ME)",JLabel.LEFT);
      rn.setBounds(100,240,200,20);
      JTextField atn = new JTextField("Attendance : 70%",JLabel.LEFT);
      atn.setBounds(100,270,200,20);
      c.add(st);
      c.add(rn);
      c.add(atn);
    }

    else if(s.equals("18XJ1A0101") && item.equals("CE")){
      JTextField st = new JTextField("Student Name : D",JLabel.LEFT);
      st.setBounds(100,210,200,20);
      JTextField rn = new JTextField("Roll Number : 18XJ1A0101 (CE)",JLabel.LEFT);
      rn.setBounds(100,240,200,20);
      JTextField atn = new JTextField("Attendance : 60%",JLabel.LEFT);
      atn.setBounds(100,270,200,20);
      c.add(st);
      c.add(rn);
      c.add(atn);
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid Details");
      u.setText("");
      u.requestFocus();
    }


 }

 public static void main(String []args){
  }

 }
