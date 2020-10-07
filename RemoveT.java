import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RemoveT extends JFrame implements ItemListener, ActionListener{
Choice ch1,tcse,teee,tce,tme;
Container c;
JButton remove,back;
public RemoveT(){
c = this.getContentPane();
c.setLayout(null);
ch1 = new Choice();
ch1.add("Select Branch");
ch1.add("Computer Science");
ch1.add("Electrical and Electronics");
ch1.add("Mechanical");
ch1.add("Civil");
ch1.setBounds(150,70,200,20);
c.add(ch1);
ch1.addItemListener(this);
//cse teachers
tcse = new Choice();
//tcse.add("Select Teacher");
tcse.add("Dr Prafulla");
tcse.add("Dr Neha");
tcse.add("Dr Rama Murthy");
tcse.add("Dr Achal");
tcse.add("Dr Satya");
tcse.add("Dr Sanjukta");
tcse.add("Dr Rakhee");
tcse.add("Dr Pandurangan");
tcse.add("Dr Sunny");
tcse.add("Dr Ravi Kishore");
tcse.setBounds(150,120,200,20);
tcse.setVisible(false);
c.add(tcse);
tcse.addItemListener(this);
//eee teachers
teee = new Choice();
//teee.add("Select Teacher");
teee.add("Dr Bhargava");
teee.add("Dr K R Sharma");
teee.add("Dr Subba Rao");
teee.add("Dr Satya");
teee.add("Dr Sanjukta");
teee.add("Dr Rakhee");
teee.add("Dr Bhooshan");
teee.setBounds(150,120,200,20);
teee.setVisible(false);
c.add(teee);
teee.addItemListener(this);
//me teachers
tme = new Choice();
//tme.add("Select Teacher");
tme.add("Dr Palash");
tme.add("Dr Senbagaraman");
tme.add("Dr Harshavardhan");
tme.add("Dr Satya");
tme.add("Dr Sanjukta");
tme.add("Dr Jai Prakash");
tme.add("Dr Prasad");
tme.setBounds(150,120,200,20);
tme.setVisible(false);
c.add(tme);
tme.addItemListener(this);
//ce teachers
tce = new Choice();
//tce.add("Select Teacher");
tce.add("Dr Prabhakar");
tce.add("Dr Jai Prakash");
tce.add("Dr Kodeboyina");
tce.add("Dr Satya");
tce.add("Dr Sanjukta");
tce.add("Dr SV Subbarao");
tce.setBounds(150,120,200,20);
tce.setVisible(false);
c.add(tce);
tce.addItemListener(this);
//
remove = new JButton("Remove");
remove.setBounds(150,180,80,20);
remove.addActionListener(this);
c.add(remove);

back = new JButton("Back");
back.setBounds(150,210,80,20);
back.addActionListener(this);
c.add(back);
}

public void itemStateChanged(ItemEvent ie){
String bri = ch1.getSelectedItem();
  if(bri.equals("Computer Science")){
    tcse.setVisible(true);
   }
  if(bri.equals("Electrical and Electronics")){
   teee.setVisible(true);

   }

   if(bri.equals("Mechanical")){
   tme.setVisible(true);

   }

   if(bri.equals("Civil")){
   tce.setVisible(true);

   }
}

public void actionPerformed(ActionEvent e){
  String s = e.getActionCommand();
 if(s.equals("Remove")){

    if(tcse.isVisible()){
    int i = tcse.getSelectedIndex();
       CSE.cse[i] = false;
     System.out.println("Index "+ i+ " Removed");
   }
  if(teee.isVisible()){

    int i = teee.getSelectedIndex();
       EEE.eee[i] = false;
   }

   if(tme.isVisible()){

    int i = tme.getSelectedIndex();
       MECH.me[i] = false;
   }

   if(tce.isVisible()){
    int i = tce.getSelectedIndex();
       CIV.ce[i] = false;
   }
   JOptionPane.showMessageDialog(null, "Teacher removed Successfully!");
  }
    if(s.equals("Back")){
     this.dispose();
   }

   //JOptionPane.showMessageDialog(null, "Teacher removeded Successfully!");

}



public static void main(String []args){
   RemoveT t = new RemoveT();
   t.setSize(400,400);
   t.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
   t.setVisible(true);
 }
}
