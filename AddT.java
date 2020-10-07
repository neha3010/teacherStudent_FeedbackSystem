import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AddT extends JFrame implements ActionListener,ItemListener{
Container c;
TextField fn,cr; Choice b;
JLabel n,br,crse;
JButton check,back;String item;
 String s,d;
public AddT(){
  c = this.getContentPane();
  c.setLayout(null);
  //c.setBackground(Color.gray);
  n = new JLabel("Name",JLabel.LEFT);
  fn = new TextField();
  br = new JLabel("Department",JLabel.LEFT);
  n.setBounds(150,50,90,20);
  fn.setBounds(150,70,90,20);
  br.setBounds(150,100,90,20);
  b = new Choice();
  b.setBounds(150,130,90,20);
  b.add("Select");
  b.add("CSE");
  b.add("EEE");
  b.add("ME");
  b.add("CE");
  c.add(n);
  c.add(fn);
  c.add(br);
  c.add(b);
  crse = new JLabel("Course");
  crse.setBounds(150,160,80,20);
  cr = new TextField();
  cr.setBounds(150,180,200,20);
  c.add(crse);
  c.add(cr);
  check = new JButton("Add");
  check.setBounds(150,210,80,20);
  c.add(check);
  b.addItemListener(this);
  check.addActionListener(this);

  back = new JButton("Done");
  back.setBounds(150,240,80,20);
  c.add(back);
  b.addItemListener(this);
  back.addActionListener(this);

 }
public void itemStateChanged(ItemEvent ie){

 }
public void actionPerformed(ActionEvent ae){
   String str = ae.getActionCommand();
    item = b.getSelectedItem();
    s = fn.getText();
    d = cr.getText();

   if(str.equals("Add")){
        if(item.equals("CSE")){
         CSE.dep = "Course : "+d;
         CSE.na = s;
        CSE.addt = true;
         }

    if(item.equals("EEE")){
         EEE.dep = "Course : "+d;
         EEE.na = s;
        EEE.addt = true;
         }
     if(item.equals("CE")){
         CIV.dep = "Course : "+d;
         CIV.na = s;
        CIV.addt = true;
         }
      if(item.equals("ME")){
         MECH.dep = "Course : "+d;
         MECH.na = s;
        MECH.addt = true;
         }

         JOptionPane.showMessageDialog(null, "New teacher added Successfully!");


}

       if(str.equals("Done")){
      this.dispose();
    }


  /* else if(s.equals("18XJ1A0201") && item.equals("EEE")){
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
   */

 }
public static void main(String []args){

    AddT at = new AddT();
    at.setVisible(true);
    at.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
    at.setSize(400,400);
}
}
