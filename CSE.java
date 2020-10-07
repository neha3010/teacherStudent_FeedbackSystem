import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CSE extends JFrame implements ActionListener{

JLabel title, oop, toc, dld, num, alg, name, br, roll, l1, l2,l;
public static JRadioButton t1, t2, t3, t4, t5, t6, t7, t8, t9, t10,t11;
Button proceed, back;
public static ButtonGroup t;
ImageIcon im, im2;
static boolean []cse = {true,true,true,true,true,true,true,true,true,true};
public static String dep,na;
static boolean addt = false;
CSE(){

  Scrollbar s=new Scrollbar(Scrollbar.VERTICAL, 1000, 600, 0, 1000);
  add(s);

  title = new JLabel("Select Faculty to give Feedback");
  title.setFont(new Font("Arial", Font.PLAIN, 20));
  title.setSize(700, 30);
  title.setLocation(600, 30);
  add(title);

  oop = new JLabel("Course : Object Oriented Programming");
  oop.setFont(new Font("Arial", Font.PLAIN, 15));
  oop.setSize(700, 30);
  oop.setLocation(300, 100);
  add(oop);

  toc = new JLabel("Course : Theory of Computation");
  toc.setFont(new Font("Arial", Font.PLAIN, 15));
  toc.setSize(700, 30);
  toc.setLocation(300, 200);
  add(toc);

  dld = new JLabel("Course : Digital Logic Design & Computer Architecture");
  dld.setFont(new Font("Arial", Font.PLAIN, 15));
  dld.setSize(700, 30);
  dld.setLocation(300, 300);
  add(dld);

  num = new JLabel("Course : Numerical Methods");
  num.setFont(new Font("Arial", Font.PLAIN, 15));
  num.setSize(700, 30);
  num.setLocation(300, 400);
  add(num);

  alg = new JLabel("Course : Design & Analysis of Algorithms");
  alg.setFont(new Font("Arial", Font.PLAIN, 15));
  alg.setSize(700, 30);
  alg.setLocation(300, 550);
  add(alg);



  name = new JLabel("A"); //Change this
  name.setFont(new Font("Arial", Font.PLAIN, 15));
  name.setSize(700, 30);
  name.setLocation(50, 200);
  add(name);

  roll = new JLabel("18XJ1A0501");
  roll.setFont(new Font("Arial", Font.PLAIN, 15));
  roll.setSize(700, 30);
  roll.setLocation(50, 250);
  add(roll);

  br = new JLabel("CSE");
  br.setFont(new Font("Arial", Font.PLAIN, 15));
  br.setSize(700, 30);
  br.setLocation(50, 300);
  add(br);



  t1 = new JRadioButton("Dr.Prafulla");
  t1.setFont(new Font("Arial", Font.PLAIN, 15));
  t1.setSelected(true);
  t1.setSize(175, 20);
  t1.setLocation(300, 150);
  if(cse[0]){
  add(t1);
}
  t2 = new JRadioButton("Dr.Neha");
  t2.setFont(new Font("Arial", Font.PLAIN, 15));
  t2.setSelected(false);
  t2.setSize(175, 20);
  t2.setLocation(300, 250);
  if(cse[1]){
  add(t2);
}

  t3 = new JRadioButton("Dr.Ramamurthy");
  t3.setFont(new Font("Arial", Font.PLAIN, 15));
  t3.setSelected(false);
  t3.setSize(175, 20);
  t3.setLocation(300, 350);
  if(cse[2]){
  add(t3);
}

  t4 = new JRadioButton("Dr.Achal");
  t4.setFont(new Font("Arial", Font.PLAIN, 15));
  t4.setSelected(false);
  t4.setSize(175, 20);
  t4.setLocation(700, 350);
  if(cse[3]){
  add(t4);
}

  t5 = new JRadioButton("Dr.Satyanarayana Chirala");
  t5.setFont(new Font("Arial", Font.PLAIN, 15));
  t5.setSelected(false);
  t5.setSize(275, 20);
  t5.setLocation(300, 450);
  if(cse[4]){
  add(t5);
}

  t6 = new JRadioButton("Dr.Sanjukta Das");
  t6.setFont(new Font("Arial", Font.PLAIN, 15));
  t6.setSelected(false);
  t6.setSize(175, 20);
  t6.setLocation(700, 450);
  if(cse[5]){
  add(t6);
}

  t7 = new JRadioButton("Dr.Rakhee");
  t7.setFont(new Font("Arial", Font.PLAIN, 15));
  t7.setSelected(false);
  t7.setSize(175, 20);
  t7.setLocation(300, 500);
  if(cse[6]){
  add(t7);
}

  t8 = new JRadioButton("Dr.Pandurangan");
  t8.setFont(new Font("Arial", Font.PLAIN, 15));
  t8.setSelected(false);
  t8.setSize(175, 20);
  t8.setLocation(300, 600);
  if(cse[7]){
  add(t8);
}

  t9 = new JRadioButton("Dr.Sunny Rai");
  t9.setFont(new Font("Arial", Font.PLAIN, 15));
  t9.setSelected(false);
  t9.setSize(175, 20);
  t9.setLocation(700, 600);
  if(cse[8]){
  add(t9);
}

  t10 = new JRadioButton("Dr.Ravi Kishore");
  t10.setFont(new Font("Arial", Font.PLAIN, 15));
  t10.setSelected(false);
  t10.setSize(175, 20);
  t10.setLocation(300, 650);
  if(cse[9]){
  add(t10);
}



  t = new ButtonGroup();
  t.add(t1);
  t.add(t2);
  t.add(t3);
  t.add(t4);
  t.add(t5);
  t.add(t6);
  t.add(t7);
  t.add(t8);
  t.add(t9);
  t.add(t10);

   if(addt){
  l = new JLabel(dep);
  //l.setJLabel(dep);
  l.setFont(new Font("Arial", Font.PLAIN, 15));
  l.setSize(700, 30);
  l.setLocation(800, 200);
  add(l);

  t11 = new JRadioButton(na);
  t11.setFont(new Font("Arial", Font.PLAIN, 15));
  t11.setSelected(false);
  t11.setSize(175, 20);
  t11.setLocation(800, 250);
   add(t11);
  t.add(t11);
  }

  proceed = new Button("Proceed");
  add(proceed);
  proceed.setBounds(1200,700,75,20);
  proceed.addActionListener(this);

  back = new Button("Back");
  add(back);
  back.setBounds(1100,700,75,20);
  back.addActionListener(this);

  im = new ImageIcon(this.getClass().getClassLoader().getResource("Logo5.png"));
  l1 = new JLabel(im);
  l1.setBounds(1100,20,300,100);
//  l1.setLayout(new BorderLayout.EAST);
  this.add(l1);

  im2 = new ImageIcon(this.getClass().getClassLoader().getResource("dp.png"));
  l2 = new JLabel(im2);
  l2.setBounds(40,30,150,150);
//  l1.setLayout(new BorderLayout.EAST);
  this.add(l2);

}

public void actionPerformed(ActionEvent e){



  if(t1.isSelected()&& e.getSource() == proceed){

    //this.dispose();
      QuestionPraf f1 = new QuestionPraf();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }
 /* if(t3.isSelected()&& e.getSource() == proceed){

    this.dispose();
      QuestionRama f1 = new QuestionRama();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }
if(t5.isSelected()&& e.getSource() == proceed){

    this.dispose();
      QuestionSatya f1 = new QuestionSatya();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }
 if(t6.isSelected()&& e.getSource() == proceed){

    this.dispose();
      QuestionRK f1 = new QuestionRK();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }
  if(t9.isSelected()&& e.getSource() == proceed){

    this.dispose();
      QuestionSunny f1 = new QuestionSunny();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }
 if(t10.isSelected()&& e.getSource() == proceed){

    this.dispose();
      QuestionSanj f1 = new QuestionSanj();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);

  }*/


else  if(e.getSource() == back){

    this.dispose();
     Index f = new Index();
      f.setSize(4100,7020);
      f.setLayout(null);
      f.setVisible(true);

  }



}

public static void main(String args[]){

      CSE p = new CSE();
      p.setSize(4096, 7016);
      p.setTitle("CSE COURSE FEEDBACK");
      p.setLayout(null);
      p.setVisible(true);
      p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);



}

}
