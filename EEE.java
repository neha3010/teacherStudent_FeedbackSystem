import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EEE extends JFrame implements ActionListener{

JLabel title, oop, toc, dld, num, alg, name, br, roll, l1, l2,l;
JRadioButton t1, t2, t3, t4, t5, t6, t7,t11;
Button proceed, back;
ButtonGroup t;
ImageIcon im, im2;
static boolean []eee = {true,true,true,true,true,true,true};
//JComboBox cou;
public static String dep,na;
//String course[] = {"OOPs", "DLDCA", "TOC"};
static boolean addt = false;
EEE(){

  Scrollbar s=new Scrollbar(Scrollbar.VERTICAL, 1000, 600, 0, 1000);
  add(s);

  title = new JLabel("Select Faculty to give Feedback");
  title.setFont(new Font("Arial", Font.PLAIN, 20));
  title.setSize(700, 30);
  title.setLocation(600, 30);
  add(title);

  oop = new JLabel("Course : Digital Electronics");
  oop.setFont(new Font("Arial", Font.PLAIN, 15));
  oop.setSize(700, 30);
  oop.setLocation(300, 100);
  add(oop);

  toc = new JLabel("Course : Linear Electronics");
  toc.setFont(new Font("Arial", Font.PLAIN, 15));
  toc.setSize(700, 30);
  toc.setLocation(300, 200);
  add(toc);

  dld = new JLabel("Course : Digital Signal Processing");
  dld.setFont(new Font("Arial", Font.PLAIN, 15));
  dld.setSize(700, 30);
  dld.setLocation(300, 300);
  add(dld);

  num = new JLabel("Course : Numerical Methods");
  num.setFont(new Font("Arial", Font.PLAIN, 15));
  num.setSize(700, 30);
  num.setLocation(300, 400);
  add(num);

  alg = new JLabel("Course : EM Waves");
  alg.setFont(new Font("Arial", Font.PLAIN, 15));
  alg.setSize(700, 30);
  alg.setLocation(300, 550);
  add(alg);

  name = new JLabel("B"); //Change this
  name.setFont(new Font("Arial", Font.PLAIN, 15));
  name.setSize(700, 30);
  name.setLocation(50, 200);
  add(name);

  roll = new JLabel("18XJ1A0201");
  roll.setFont(new Font("Arial", Font.PLAIN, 15));
  roll.setSize(700, 30);
  roll.setLocation(50, 250);
  add(roll);

  br = new JLabel("EEE");
  br.setFont(new Font("Arial", Font.PLAIN, 15));
  br.setSize(700, 30);
  br.setLocation(50, 300);
  add(br);

  t1 = new JRadioButton("Dr.Bhargava");
  t1.setFont(new Font("Arial", Font.PLAIN, 15));
  t1.setSelected(true);
  t1.setSize(175, 20);
  t1.setLocation(300, 150);
  if(eee[0]){add(t1);}

  t2 = new JRadioButton("Dr.K R Sharma");
  t2.setFont(new Font("Arial", Font.PLAIN, 15));
  t2.setSelected(false);
  t2.setSize(175, 20);
  t2.setLocation(300, 250);
  if(eee[1]){add(t2);}

  t3 = new JRadioButton("Dr.Subba Rao");
  t3.setFont(new Font("Arial", Font.PLAIN, 15));
  t3.setSelected(false);
  t3.setSize(175, 20);
  t3.setLocation(300, 350);
  if(eee[2]){add(t3);}


  t5 = new JRadioButton("Dr.Bhooshan");
  t5.setFont(new Font("Arial", Font.PLAIN, 15));
  t5.setSelected(false);
  t5.setSize(275, 20);
  t5.setLocation(300, 600);
  if(eee[6]){add(t5);}

  t4 = new JRadioButton("Dr.Satyanarayana Chirala");
  t4.setFont(new Font("Arial", Font.PLAIN, 15));
  t4.setSelected(false);
  t4.setSize(275, 20);
  t4.setLocation(300, 450);
  if(eee[3]){add(t4);}

  t6 = new JRadioButton("Dr.Sanjukta Das");
  t6.setFont(new Font("Arial", Font.PLAIN, 15));
  t6.setSelected(false);
  t6.setSize(175, 20);
  t6.setLocation(700, 450);
  if(eee[4]){add(t6);}

  t7 = new JRadioButton("Dr.Rakhee");
  t7.setFont(new Font("Arial", Font.PLAIN, 15));
  t7.setSelected(false);
  t7.setSize(175, 20);
  t7.setLocation(300, 500);
  if(eee[5]){add(t7);}


  t = new ButtonGroup();
  t.add(t1);
  t.add(t2);
  t.add(t3);
  t.add(t4);
  t.add(t5);
  t.add(t6);
  t.add(t7);
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

/*  cou = new JComboBox(course);
  cou.setFont(new Font("Arial", Font.PLAIN, 15));
  cou.setSize(100, 30);
  cou.setLocation(200, 250);
  add(cou);*/


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

  im = new ImageIcon(this.getClass().getClassLoader().getResource("Logo5.png"));
  l1 = new JLabel(im);
  l1.setBounds(1000,20,300,100);
//  l1.setLayout(new BorderLayout.EAST);
  this.add(l1);

  if(t1.isSelected()&&e.getSource() == proceed){

    this.dispose();
      QuestionBhargav f1 = new QuestionBhargav();
      f1.setSize(4096,7016);
      f1.setLayout(null);
      f1.setVisible(true);


  }

else  if(e.getSource() == back){

  this.dispose();
   Index f = new Index();
    f.setSize(4096,7016);
    f.setLayout(null);
    f.setVisible(true);


  }



}

public static void main(String args[]){

      EEE p = new EEE();
      p.setSize(4096, 7016);
      p.setTitle("EEE COURSE FEEDBACK");
      p.setLayout(new BorderLayout());
      p.setVisible(true);
      p.setDefaultCloseOperation(EXIT_ON_CLOSE);


}

}
