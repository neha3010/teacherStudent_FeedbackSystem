import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.FileWriter;

public class QuestionPS extends JFrame implements ActionListener{
 JLabel q1,q2,q3,q4,q5,q6,q7,q8,prof,dept,pic,limg,l,crs,crs1;
 JLabel l1,l2,l3,l4,l5,l6,l7,l8;
 Button b,b1;
 Container c;
 ImageIcon imp,im;
 JTextField t1,t2,t3,t4,t5,t6,t7,t8;
 FileWriter fw;
QuestionPS(){
   c = this.getContentPane();
   c.setLayout(null);
   Font font = new Font("Times New Roman",Font.BOLD,25);
   Font mf = new Font("Times New Roman",Font.ITALIC,18);
   imp = new ImageIcon(getClass().getResource("ps2.jpg"));
   pic = new JLabel(imp);
   pic.setBounds(30,10,150,150);
   c.add(pic);
   prof = new JLabel("Dr. Prabhakar Singh",JLabel.LEFT);
   prof.setBounds(30,190,300,20);
   dept = new JLabel("Civil Engineering",JLabel.LEFT);
   dept.setBounds(30,210,300,20);
   crs = new JLabel("Course : Fluid Mechanics",JLabel.LEFT);
   crs.setBounds(30,230,300,20);
  // crs1 = new JLabel("and Computer Architecture");
   //crs1.setBounds(30,260,300,20);
   c.add(prof);
   c.add(dept);
   c.add(crs);
   //c.add(crs1);
   im = new ImageIcon(getClass().getResource("Logo5.png"));
   limg = new JLabel(im);
   limg.setBounds(1020,10,300,90);
   c.add(limg);
   l = new JLabel("Please answer the following questions:");
   l.setFont(font);
   l.setBounds(400,40,1000,30);
   c.add(l);
   //q1
   q1 = new JLabel("1)  Overall quality of the course?",JLabel.LEFT);
   q1.setBounds(390,100,500,30);
   q1.setFont(mf);
   c.add(q1);
   l1 = new JLabel("a) Poor  b) Good  c) Very Good  d) Excellent");
   l1.setFont(mf);
   l1.setBounds(400,120,500,30);
   c.add(l1);
   t1 = new JTextField("Your Answer");
   t1.setBounds(400,160,100,20);
   c.add(t1);
   //q2
   q2 = new JLabel("2)  Overall quality of the instructor?",JLabel.LEFT);
   q2.setBounds(390,190,500,30);
   q2.setFont(mf);
   c.add(q2);
   l2 = new JLabel("a) Poor  b) Good  c) Very Good  d) Excellent");
   l2.setBounds(400,210,500,30);
   l2.setFont(mf);
   c.add(l2);
   t2 = new JTextField("Your Answer");
   t2.setBounds(400,250,100,20);
   c.add(t2);
   //q3
   q3 = new JLabel("3) Instructor's ability to communicate the subject?",JLabel.LEFT);
   q3.setBounds(390,280,500,30);
   q3.setFont(mf);
   c.add(q3);
   l3 = new JLabel("a) Poor  b) Good  c) Very Good  d) Excellent");
   l3.setBounds(400,300,500,30);
   l3.setFont(mf);
   c.add(l3);
   t3 = new JTextField("Your Answer");
   t3.setBounds(400,340,100,20);
   c.add(t3);
   //q4
   q4 = new JLabel("4) Instructor's ability to stimulate student interest?",JLabel.LEFT);
   q4.setBounds(390,370,500,30);
   q4.setFont(mf);
   c.add(q4);
   l4 = new JLabel("a) Poor  b) Good  c) Very Good  d) Excellent");
   l4.setBounds(400,390,500,30);
   l4.setFont(mf);
   c.add(l4);
   t4 = new JTextField("Your Answer");
   t4.setBounds(400,430,100,20);
   c.add(t4);
   //q5
   q5 = new JLabel("5) Instructor's accessibility and willingness to discuss problems?",JLabel.LEFT);
   q5.setBounds(390,460,500,30);
   q5.setFont(mf);
   c.add(q5);
   l5 = new JLabel("a) Poor  b) Good  c) Very Good  d) Excellent");
   l5.setBounds(400,480,500,30);
   l5.setFont(mf);
   c.add(l5);
   t5 = new JTextField("Your Answer");
   t5.setBounds(400,520,100,20);
   c.add(t5);
   //q6
   q6 = new JLabel("6) Please rate the difficulty of the course",JLabel.LEFT);
   q6.setBounds(390,550,500,30);
   q6.setFont(mf);
   c.add(q6);
   l6 = new JLabel("1 = easy to 5 = difficult");
   l6.setBounds(400,570,500,30);
   l6.setFont(mf);
   c.add(l6);
   t6 = new JTextField("Your Answer");
   t6.setBounds(400,610,100,20);
   c.add(t6);
   //q7
   q7 = new JLabel("7) Please rate the amount of work required for this course",JLabel.LEFT);
   q7.setBounds(390,640,500,30);
   q7.setFont(mf);
   c.add(q7);
   l7 = new JLabel("1 = very little to 5 = very much");
   l7.setBounds(400,660,500,30);
   l7.setFont(mf);
   c.add(l7);
   t7 = new JTextField("Your Answer");
   t7.setBounds(400,700,100,20);
   c.add(t7);
   //q8
   q8 = new JLabel("8) Any suggestions or comments related to the course?",JLabel.LEFT);
   q8.setBounds(390,730,500,30);
   q8.setFont(mf);
   c.add(q8);
   t8 = new JTextField("Your Answer");
   t8.setBounds(400,760,500,20);
   c.add(t8);

   b = new Button("Submit");
   b.setBounds(1200,730,100,70);
   b.setFont(font);
   c.add(b);
   b.addActionListener(this);
   b1 = new Button("Back");
   b1.setBounds(30,700,100,30);
   b1.setFont(font);
   c.add(b1);
   b1.addActionListener(this);

   }

   public void actionPerformed(ActionEvent e){

     if(e.getSource()==b){

       try{
             fw = new FileWriter("ps_fb.txt");
             fw.write(t1.getText()+"/"+t2.getText()+"/"+t3.getText()+"/"+t4.getText()+"/"+t5.getText()+"/"+t6.getText()+"/"+t7.getText()+"/"+t8.getText());
             fw.close();
             JOptionPane.showMessageDialog(null, "Feedback Submitted Successfully!");

       }
       catch(Exception ae){
         JOptionPane.showMessageDialog(null, ae+"");
       }


          this.dispose();
          Index t = new Index();
          t.setSize(4096,7016);
          t.setLayout(null);
          t.setVisible(true);

     }
    if(e.getSource()==b1){


          this.dispose();
          CIV t = new CIV();
          t.setSize(4096,7016);
          t.setLayout(null);
          t.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
          t.setVisible(true);

     }
   }

  public static void main(String []args){
    QuestionPS q = new QuestionPS();
    q.setSize(4096,7016);
    q.setTitle("Feedback Questionnaire");
    q.getContentPane().setBackground(new java.awt.Color(255, 249, 170));
    q.setVisible(true);
    q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


  }
}
