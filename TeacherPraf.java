import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.Desktop;

public class TeacherPraf extends JFrame implements ActionListener{
  JButton cf,ca,submit;
  Container c;JLabel label,limg,ladn,ldes,lorg,lima;
  ImageIcon im,ima;
  static String sF;

public TeacherPraf(){
  c = this.getContentPane();
  //c.setBackground(Color.gray);
  c.setLayout(null);

  ima = new ImageIcon(getClass().getResource("adm.png"));
  lima = new JLabel(ima);
  lima.setBounds(30,10,100,100);
  c.add(lima);
  ladn = new JLabel("Teacher 1",JLabel.LEFT);
  ladn.setBounds(30,110,100,20);
  ldes = new JLabel("Faculty",JLabel.LEFT);
  ldes.setBounds(30,130,100,20);
  lorg = new JLabel("Mahindra Ecole Centrale",JLabel.LEFT);
  lorg.setBounds(30,150,300,20);
  c.add(ladn);
  c.add(ldes);
  c.add(lorg);
  label = new JLabel("TEACHER FUNCTIONS : ");
  label.setBounds(600,90,200,50);
  im = new ImageIcon(getClass().getResource("Logo5.png"));
  limg = new JLabel(im);
  limg.setBounds(1020,10,300,100);
  c.add(limg);

  cf = new JButton("Check Feedback");
  cf.setBounds(570,350,200,50);
  ca = new JButton("Check Attendance");
  ca.setBounds(570,450,200,50);
  c.add(label);

  c.add(cf);
  c.add(ca);

  cf.addActionListener(this);
  ca.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
  if(ae.getSource() == cf){

    Student s = new Student();
    s.setSize(400,400);
 	  s.setTitle("Choose student number");
    s.setLayout(null);
    s.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
    s.setVisible(true);
		// cfa.setTitle("FeedBack");


 }else if(ae.getSource() == ca){

	 CheckAttendance att = new CheckAttendance();
	 att.setSize(400,400);
	 att.setVisible(true);
   att.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
	 att.setTitle("Check Attendance");


 }


}
public static void main(String args[]){
  TeacherPraf af = new TeacherPraf();
  af.setSize(4960,7016);
  af.setTitle("Faculty Functions");
  af.getContentPane().setBackground(new java.awt.Color(144, 238, 144));
  af.setVisible(true);
  af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

class CheckFeedBack extends JFrame implements ActionListener{
	 private Container c;
	 private JTextField jF1 = new JTextField(20);
	 private JTextField jF2 = new JTextField(20);
	 private JTextField jF3 = new JTextField(20);
	 private JTextField jF4 = new JTextField(20);
	 private JTextField jF5 = new JTextField(20);
	 private JTextField jF6 = new JTextField(20);
	 private JTextField jF7 = new JTextField(20);
	 private JTextField jF8 = new JTextField(20);
	//private JFrame f1 = new JFrame("FeedBack");
	 private JButton B = new JButton("Check");


	private static String o,t,th,f,fi,si,se,ei;

	public CheckFeedBack(){
		c = this.getContentPane();
    c.setLayout(new FlowLayout());
		//FeedBackt1 fb1 = new FeedBackt1();
	 	 c.add(new JLabel("1)  Overall quality of the course?"));
		 jF1.setEditable(false);
	 	 c.add(jF1);

		 c.add(new JLabel("2)  Overall quality of the instructor: "));
		 jF2.setEditable(false);
	 	 c.add(jF2);

		 c.add(new JLabel("3) Instructor's ability to communicate the subject: "));
		 jF3.setEditable(false);
	 	 c.add(jF3);

		 c.add(new JLabel("4) Instructor's ability to stimulate student interest: "));
		 jF4.setEditable(false);
	 	 c.add(jF4);

		 c.add(new JLabel("5) Instructor's accessibility and willingness to discuss problems: "));
		 jF5.setEditable(false);
	 	 c.add(jF5);

     c.add(new JLabel("6) Please rate the difficulty of the course(1 = easy to 5 = difficult): "));
		 jF6.setEditable(false);
	 	 c.add(jF6);

		 c.add(new JLabel("7) Please rate the amount of work required for this course(1 = very little to 5 = very much): "));
		 jF7.setEditable(false);
	 	 c.add(jF7);

		 c.add(new JLabel("8) Any suggestions or comments related to the course: "));
	 	 jF8.setEditable(false);
	 	 c.add(jF8);


		 B.addActionListener(this);
		 c.add(B);




	// fb1.setTitle("FeedBack");
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == B){
			FeedBackt1 f1 = new FeedBackt1();
			f1.openFile();
			//f1.readFile();
			//f1.closeFile();

			o = FeedBackt1.q1;
			t = FeedBackt1.q2;
			th = FeedBackt1.q3;
			f = FeedBackt1.q4;
			fi = FeedBackt1.q5;
			si = FeedBackt1.q6;
			se = FeedBackt1.q7;
			ei = FeedBackt1.q8;

			jF1.setText(o);
			jF2.setText(t);
			jF3.setText(th);
			jF4.setText(f);
			jF5.setText(fi);
			jF6.setText(si);
			jF7.setText(se);
			jF8.setText(ei);
		}


	}

  public static void main(String []args){
	//	CheckFeedBack CF = new CheckFeedBack();
		// new CheckFeedBack();
		//
		// FeedBackt1 f1 = new FeedBackt1();
		// f1.openFile();
		// //f1.readFile();
		// //f1.closeFile();
		//
		// o = FeedBackt1.q1;
		// t = FeedBackt1.q2;
		// th = FeedBackt1.q3;
		// f = FeedBackt1.q4;
		// fi = FeedBackt1.q5;
		// si = FeedBackt1.q6;
		// se = FeedBackt1.q7;
		// ei = FeedBackt1.q8;

	//	CF.setSize(400,400);
	//	CF.setVisible(true);
	}
}


  class CheckFeedBack2 extends JFrame implements ActionListener{
  	 private Container c;
  	 private JTextField jF1 = new JTextField(20);
  	 private JTextField jF2 = new JTextField(20);
  	 private JTextField jF3 = new JTextField(20);
  	 private JTextField jF4 = new JTextField(20);
  	 private JTextField jF5 = new JTextField(20);
  	 private JTextField jF6 = new JTextField(20);
  	 private JTextField jF7 = new JTextField(20);
  	 private JTextField jF8 = new JTextField(20);
  	//private JFrame f1 = new JFrame("FeedBack");
  	 private JButton B = new JButton("Check");


  	private static String o,t,th,f,fi,si,se,ei;

  	public CheckFeedBack2(){
  		c = this.getContentPane();
      c.setLayout(new FlowLayout());
  		//FeedBackt1 fb1 = new FeedBackt1();
  	 	 c.add(new JLabel("1)  Overall quality of the course?"));
  		 jF1.setEditable(false);
  	 	 c.add(jF1);

  		 c.add(new JLabel("2)  Overall quality of the instructor: "));
  		 jF2.setEditable(false);
  	 	 c.add(jF2);

  		 c.add(new JLabel("3) Instructor's ability to communicate the subject: "));
  		 jF3.setEditable(false);
  	 	 c.add(jF3);

  		 c.add(new JLabel("4) Instructor's ability to stimulate student interest: "));
  		 jF4.setEditable(false);
  	 	 c.add(jF4);

  		 c.add(new JLabel("5) Instructor's accessibility and willingness to discuss problems: "));
  		 jF5.setEditable(false);
  	 	 c.add(jF5);

       c.add(new JLabel("6) Please rate the difficulty of the course(1 = easy to 5 = difficult): "));
  		 jF6.setEditable(false);
  	 	 c.add(jF6);

  		 c.add(new JLabel("7) Please rate the amount of work required for this course(1 = very little to 5 = very much): "));
  		 jF7.setEditable(false);
  	 	 c.add(jF7);

  		 c.add(new JLabel("8) Any suggestions or comments related to the course: "));
  	 	 jF8.setEditable(false);
  	 	 c.add(jF8);


  		 B.addActionListener(this);
  		 c.add(B);




  	// fb1.setTitle("FeedBack");
  	}

  	public void actionPerformed(ActionEvent ae){

  		if(ae.getSource() == B){
  			FeedBackt1 f2 = new FeedBackt1();
  			f2.openFile2();
  			//f1.readFile();
  			//f1.closeFile();

  			o = FeedBackt1.q21;
  			t = FeedBackt1.q22;
  			th = FeedBackt1.q23;
  			f = FeedBackt1.q24;
  			fi = FeedBackt1.q25;
  			si = FeedBackt1.q26;
  			se = FeedBackt1.q27;
  			ei = FeedBackt1.q28;

  			jF1.setText(o);
  			jF2.setText(t);
  			jF3.setText(th);
  			jF4.setText(f);
  			jF5.setText(fi);
  			jF6.setText(si);
  			jF7.setText(se);
  			jF8.setText(ei);
  		}


  	}


	public static void main(String []args){
	//	CheckFeedBack CF = new CheckFeedBack();
		// new CheckFeedBack();
		//
		// FeedBackt1 f1 = new FeedBackt1();
		// f1.openFile();
		// //f1.readFile();
		// //f1.closeFile();
		//
		// o = FeedBackt1.q1;
		// t = FeedBackt1.q2;
		// th = FeedBackt1.q3;
		// f = FeedBackt1.q4;
		// fi = FeedBackt1.q5;
		// si = FeedBackt1.q6;
		// se = FeedBackt1.q7;
		// ei = FeedBackt1.q8;

	//	CF.setSize(400,400);
	//	CF.setVisible(true);
	}


}
