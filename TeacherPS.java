import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.Desktop;

public class TeacherPS extends JFrame implements ActionListener{
JButton ad,rem,cf,ca,submit;
Container c;JLabel label,limg,ladn,ldes,lorg,lima;
ImageIcon im,ima;
Desktop desk;

public TeacherPS(){
 c = this.getContentPane();
 //c.setBackground(Color.gray);
 c.setLayout(null);

 ima = new ImageIcon(getClass().getResource("ps2.jpg"));
 lima = new JLabel(ima);
 lima.setBounds(30,10,100,100);
 c.add(lima);
 ladn = new JLabel("Dr Prabhakar Singh",JLabel.LEFT);
 ladn.setBounds(30,110,300,20);
 ldes = new JLabel("Faculty",JLabel.LEFT);
 ldes.setBounds(30,130,100,20);
 lorg = new JLabel("Mahindra Ecole Centrale",JLabel.LEFT);
 lorg.setBounds(30,150,300,20);
 c.add(ladn);
 c.add(ldes);
 c.add(lorg);
 label = new JLabel("FACULTY FUNCTIONS : ");
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
 cf.setBounds(570,250,200,50);
 ca = new JButton("Check Attendance");
 ca.setBounds(570,350,200,50);
 c.add(label);
 //c.add(ad);
 //c.add(rem);
 c.add(cf);
 c.add(ca);
 //ad.addActionListener(this);
 //rem.addActionListener(this);
 cf.addActionListener(this);
 ca.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
  String s = ae.getActionCommand();
  if(s.equals("Check Attendance")){
     CheckAttendance att = new CheckAttendance();
     att.setSize(400,400);
     att.setVisible(true);
     att.setTitle("Check Attendance");
 }
   else if(s.equals("Check Feedback")){
     CheckFeedBackC cfa = new CheckFeedBackC();
     cfa.setSize(4960,7016);
     cfa.setVisible(true);
     cfa.setTitle("FeedBack");

      }


}
public static void main(String args[]){
  TeacherPS af = new TeacherPS();
  af.setSize(4960,7016);
  af.setVisible(true);
  af.setTitle("Faculty Functions");
  af.getContentPane().setBackground(new java.awt.Color(144, 238, 144));
  af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

class CheckFeedBackC extends JFrame implements ActionListener{
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

	static String o,t,th,f,fi,si,se,ei;

	public CheckFeedBackC(){
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
			FeedBackt4 f1 = new FeedBackt4();
			f1.openFile();
			//f1.readFile();
			//f1.closeFile();

			o = FeedBackt4.q1;
			t = FeedBackt4.q2;
			th = FeedBackt4.q3;
			f = FeedBackt4.q4;
			fi = FeedBackt4.q5;
			si = FeedBackt4.q6;
			se = FeedBackt4.q7;
			ei = FeedBackt4.q8;

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

	}


}
