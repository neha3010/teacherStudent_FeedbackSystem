import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminFunction extends JFrame implements ActionListener{
JButton ad,rem,cf,ca,submit,back;
Container c;JLabel label,limg,ladn,ldes,lorg,lima;
ImageIcon im,ima;

public AdminFunction(){
 c = this.getContentPane();
 //c.setBackground(Color.gray);
 c.setLayout(null);

 ima = new ImageIcon(getClass().getResource("adm.png"));
 lima = new JLabel(ima);
 lima.setBounds(30,10,100,100);
 c.add(lima);
 ladn = new JLabel("Admin 1",JLabel.LEFT);
 ladn.setBounds(30,110,100,20);
 ldes = new JLabel("Administration",JLabel.LEFT);
 ldes.setBounds(30,130,100,20);
 lorg = new JLabel("Mahindra Ecole Centrale",JLabel.LEFT);
 lorg.setBounds(30,150,300,20);
 c.add(ladn);
 c.add(ldes);
 c.add(lorg);
 label = new JLabel("ADMIN FUNCTIONS : ");
 label.setBounds(600,90,200,50);
 im = new ImageIcon(getClass().getResource("Logo5.png"));
 limg = new JLabel(im);
 limg.setBounds(1020,10,300,100);
 c.add(limg);
 ad = new JButton("Add Teacher");
 ad.setBounds(570,150,200,50);
 rem = new JButton("Remove Teacher");
 rem.setBounds(570,250,200,50);
 cf = new JButton("Check Feedback");
 cf.setBounds(570,350,200,50);
 ca = new JButton("Check Attendance");
 ca.setBounds(570,450,200,50);
 back = new JButton("Back");
 back.setBounds(400,470,100,20);
 c.add(back);
 c.add(label);
 c.add(ad);
 c.add(rem);
 c.add(cf);
 c.add(ca);
 ad.addActionListener(this);
 rem.addActionListener(this);
 cf.addActionListener(this);
 ca.addActionListener(this);
 back.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
  String s = ae.getActionCommand();
  if(s.equals("Check Feedback")){
     Check_admin cad = new Check_admin();
     cad.setSize(400,400);
     cad.setVisible(true);
     cad.setTitle("Check Feedback");
 }
  if(s.equals("Check Attendance")){
     CheckAttendance att = new CheckAttendance();
     att.setSize(400,400);
     att.setVisible(true);
     att.setTitle("Check Attendance");
 }

  if(s.equals("Back")){

      Index t = new Index();
       t.setSize(4960,7016);
        t.setVisible(true);
        t.setLayout(null);

 }

  if(s.equals("Remove Teacher")){
     RemoveT t = new RemoveT();
     t.setSize(400,400);
     t.setVisible(true);

 }

   if(s.equals("Add Teacher")){
     AddT t = new AddT();
     t.setSize(400,400);
     t.setVisible(true);

 }

}
public static void main(String args[]){
  AdminFunction af = new AdminFunction();
  af.setSize(4960,7016);
  af.setVisible(true);
  af.setTitle("Admin Functions");

  af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
//
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
      add(st);
      add(rn);
      add(atn);
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
