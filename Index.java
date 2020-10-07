import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Index extends JFrame implements ActionListener{
	private Container c;
	private JLabel title;
	private JLabel name,l1,lt1,h1,h2,h3,name2;
	private JLabel pass,l2,lt2,ls,lt,la,li, pass2;
	private JTextField tname, tname1, tname2;
	private TextField tpass, tpass1, tpass2;
	private JLabel branch;
	private JComboBox cbranch;
	private JLabel descrip,d1,d2,d3,d4,d5,l5;
	private ImageIcon logo;
	private JButton b,s,t,a, login,fp;
	//JButton b;
  //JLabel l;

	//JPanel panel = (JPanel)frame.getContentPane();

	private String branches[] = {"--Select--",
															"Computer Science and Engineering (CSE)",
															"Electrical and Electronics Engineering (EEE)",
															"Mechanical Engineering (ME)",
															"Civil Engineering (CE)"};

	private Image BgImg;


	Index(){

		//setVisible(true);


		c = getContentPane();
		c.setLayout(null);

		//setLayout(new BorderLayout());


		//setBackground(Color.CYAN);

		descrip = new JLabel("MEC College of Engineering in Hyderabad offers a full-time, four-year engineering program leading to a B.Tech ");
		descrip.setFont(new Font("Arial",Font.ITALIC,14));
		//descrip.setSize(500,400);
		descrip.setBounds(20,20,2000,18);

		//descrip.setEditable(false);
		c.add(descrip);

		d1 = new JLabel("degree in one of these four streams: Civil Engineering (CE) , Computer Science and Engineering (CSE), Electrical");
		d1.setFont(new Font("Arial",Font.ITALIC,14));
		d1.setBounds(20,38,2000,36);
		c.add(d1);


		d2 = new JLabel("and Electronics Engineering (EEE), and Mechanical Engineering (ME); with thrust areas that include, but are not ");
		d2.setFont(new Font("Arial",Font.ITALIC,14));
		d2.setBounds(20,56,2000,54);
		c.add(d2);

		d3 = new JLabel("limited to energy, environment, communication, infrastructure, transportation, materials and defence.");
		d3.setFont(new Font("Arial",Font.ITALIC,14));
		d3.setBounds(20,74,2000,72);
		c.add(d3);



		logo = new ImageIcon(getClass().getResource("Logo5.png"));
		li = new JLabel(logo);
		//logo.setSize(200,100);
		li.setBounds(1000,20,300,100);


		c.add(li);

		title = new JLabel("LOGIN");
		title.setFont(new Font("Arial",Font.BOLD,20));
		title.setBounds(650,200,200,30);
		//title.setLocation(50,130);
		c.add(title);



		s = new JButton("Student");
		s.setBounds(500,280,100,50);
		s.addActionListener(this);
		c.add(s);

		t = new JButton("Teacher");
		t.setBounds(650,280,100,50);
		t.addActionListener(this);
		c.add(t);

		a = new JButton("Admin");
		a.setBounds(800,280,100,50);
		a.addActionListener(this);
		c.add(a);

    login = new JButton("Login");
    /*login.setBounds(600,700,80,40);
		login.addActionListener(this);
		c.add(login);*/

		// h1 = new JLabel("STUDENT LOGIN");
		// h1.setFont(new Font("Arial",Font.PLAIN,15));
		// h1.setBounds(600,350,200,20);
		// c.add(h1);

		name = new JLabel("Username");
		name.setFont(new Font("Arial",Font.PLAIN,15));
		name.setBounds(600,400,100,20);
		name.setVisible(false);
		//name.setLocation(50,200);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial",Font.PLAIN,15));
		tname.setBounds(720,400,100,20);
		tname.setVisible(false);
		//tname.setLocation(150,200);
		c.add(tname);

		pass = new JLabel("Password");
		pass.setFont(new Font("Arial",Font.PLAIN,15));
		pass.setBounds(600,450,100,20);
		pass.setVisible(false);
		//pass.setLocation(50,220);
		c.add(pass);

		tpass = new TextField(7);
		tpass.setFont(new Font("Arial",Font.PLAIN,15));
		tpass.setBounds(720,450,100,20);
		tpass.setEchoChar('*');
		tpass.setVisible(false);
		//tpass.setLocation(150,220);
		c.add(tpass);

		branch = new JLabel("Branch");
		branch.setFont(new Font("Arial",Font.PLAIN,15));
		branch.setBounds(600,500,100,25);
		branch.setVisible(false);
		//branch.setLocation(50,270);
		c.add(branch);

		cbranch = new JComboBox(branches);
		cbranch.setFont(new Font("Arial",Font.PLAIN,15));
		cbranch.setBounds(720,500,500,25);
		cbranch.setVisible(false);
		//cbranch.setLocation(100,270);
		c.add(cbranch);

		// h2 = new JLabel("ADMIN LOGIN");
		// h2.setFont(new Font("Arial",Font.PLAIN,15));
		// h2.setBounds(50,370,100,20);
		// c.add(h2);

		name2 = new JLabel("Username");
		name2.setFont(new Font("Arial",Font.PLAIN,15));
		name2.setBounds(600,400,100,20);
		name2.setVisible(false);
		c.add(name2);

		tname2 = new JTextField();
		tname2.setBounds(720,400,100,20);
		tname2.setVisible(false);
		c.add(tname2);

		pass2 = new JLabel("Password");
		pass2.setFont(new Font("Arial",Font.PLAIN,15));
		pass2.setBounds(600,450,100,20);
		pass2.setVisible(false);
		c.add(pass2);

		tpass2 = new TextField(7);
		tpass2.setBounds(720,450,100,20);
		tpass2.setEchoChar('*');
		tpass2.setVisible(false);
		c.add(tpass2);


		l1 = new JLabel("Username");
		l1.setFont(new Font("Arial",Font.PLAIN,15));
		l1.setBounds(600,400,100,20);
		l1.setVisible(false);
		c.add(l1);

		tname1 = new JTextField();
		tname1.setBounds(720,400,100,20);
		tname1.setVisible(false);
		c.add(tname1);

		l2 = new JLabel("Password");
		l2.setFont(new Font("Arial",Font.PLAIN,15));
		l2.setBounds(600,450,100,20);
		l2.setVisible(false);
		c.add(l2);

		tpass1 = new TextField(7);
		tpass1.setBounds(720,450,100,20);
		tpass1.setEchoChar('*');
		tpass1.setVisible(false);
		c.add(tpass1);


		login.setBounds(600,600,100,20);
		login.addActionListener(this);
		login.setVisible(false);
		c.add(login);

                fp = new JButton("Forgot Password");
                fp.setBounds(840,450,200,20);
                fp.addActionListener(this);
                fp.setVisible(false);
                c.add(fp);

    l5 = new JLabel("Incorrect Username or Password!");
    l5.setFont(new Font("Arial", Font.PLAIN, 15));
    l5.setSize(300, 20);
    l5.setLocation(600, 700);
    l5.setVisible(false);
    c.add(l5);


		tname.addActionListener(this);
		tpass.addActionListener(this);
		tname1.addActionListener(this);
		tpass1.addActionListener(this);



	}







	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		String s1 = ae.getActionCommand();


		String lbranch = cbranch.getSelectedItem().toString();

		if(s1.equals("Student")){
			h1 = new JLabel("STUDENT LOGIN");
			h1.setFont(new Font("Arial",Font.PLAIN,15));
			h1.setBounds(600,350,200,20);

			name.setVisible(true);
			tname.setVisible(true);
			pass.setVisible(true);
			tpass.setVisible(true);
			branch.setVisible(true);
			cbranch.setVisible(true);
			login.setVisible(true);
                        fp.setVisible(true);

      l1.setVisible(false);
			tname1.setVisible(false);
			l2.setVisible(false);
			tpass1.setVisible(false);

			name2.setVisible(false);
			tname2.setVisible(false);
			pass2.setVisible(false);
			tpass2.setVisible(false);

		}else if(s1.equals("Teacher")){
			h3 = new JLabel("TEACHER LOGIN");
			h3.setFont(new Font("Arial",Font.PLAIN,15));
			h3.setBounds(600,350,200,20);

			name2.setVisible(true);
			tname2.setVisible(true);
			pass2.setVisible(true);
			tpass2.setVisible(true);
			login.setVisible(true);
                        fp.setVisible(true);

                        name.setVisible(false);
			tname.setVisible(false);
			pass.setVisible(false);
			tpass.setVisible(false);
			branch.setVisible(false);
			cbranch.setVisible(false);

			l1.setVisible(false);
			tname1.setVisible(false);
			l2.setVisible(false);
			tpass1.setVisible(false);


		}

		else if(s1.equals("Admin")){
			h2 = new JLabel("ADMIN LOGIN");
			h2.setFont(new Font("Arial",Font.PLAIN,15));
			h2.setBounds(600,350,200,20);

			l1.setVisible(true);
			tname1.setVisible(true);
			l2.setVisible(true);
			tpass1.setVisible(true);
			login.setVisible(true);
                        fp.setVisible(true);

			name.setVisible(false);
			tname.setVisible(false);
			pass.setVisible(false);
			tpass.setVisible(false);
			branch.setVisible(false);
			cbranch.setVisible(false);

			name2.setVisible(false);
			tname2.setVisible(false);
			pass2.setVisible(false);
			tpass2.setVisible(false);


		}

		String n = tname1.getText();
		String p = tpass1.getText();
		String lname = tname.getText();
		String lpass = tpass.getText();
		String lname1 = tname2.getText();
		String lpass1 = tpass2.getText();


		if(s.equals("Login")){


		 if((lname.equals("18XJ1A0501") && lpass.equals("18501")) || (lname.equals("18XJ1A0502") && lpass.equals("18502"))){
 		  //l3.setVisible(true);
      this.dispose();
      CSE c = new CSE();
      c.setSize(4096,7016);
      c.setLayout(null);
			c.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
      c.setVisible(true);


 		}else if(lname.equals("18XJ1A0201") && lpass.equals("18201")){
      this.dispose();
      EEE e = new EEE();
      e.setSize(4096,7016);
      e.setLayout(null);
			e.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
      e.setVisible(true);
     }
     else if(lname.equals("18XJ1A0301") && lpass.equals("18301")){
       this.dispose();
       MECH m = new MECH();
       m.setSize(4096,7016);
       m.setLayout(null);
			 m.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
       m.setVisible(true);
      }
      else if(lname.equals("18XJ1A0101") && lpass.equals("18101")){
        this.dispose();
        CIV i = new CIV();
        i.setSize(4096,7016);
				i.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
        i.setLayout(null);
        i.setVisible(true);
       }

		else if(n.equals("admin1")&& p.equals("Test@1234")){

     this.dispose();
     AdminFunction f2 = new AdminFunction();
     f2.setSize(4096,7016);
		 f2.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
     f2.setLayout(null);
     f2.setVisible(true);

		}
		else if(lname1.equals("Prafulla") && lpass1.equals("Test123")){
			//this.dispose();
      TeacherPraf tf1 = new TeacherPraf();
      tf1.setSize(4096,7016);
      tf1.setLayout(null);
      tf1.setVisible(true);
		}else if(lname1.equals("Bhargav") && lpass1.equals("Test123")){
			TeacherBhargav tf2 = new TeacherBhargav();
      tf2.setSize(4096,7016);
      tf2.setLayout(null);
      tf2.setVisible(true);
		}else if(lname1.equals("Prasad") && lpass1.equals("Test123")){
			TeacherPrasad tf3 = new TeacherPrasad();
      tf3.setSize(4096,7016);
      tf3.setLayout(null);
      tf3.setVisible(true);
		}else if(lname1.equals("Prabhakar Singh") && lpass1.equals("Test123")){
			TeacherPS tf4 = new TeacherPS();
      tf4.setSize(4096,7016);
      tf4.setLayout(null);
      tf4.setVisible(true);
		}
		else{
      l5.setVisible(true);
			tname.setText("");
			tpass.setText("");
			//tname.requestFocus();
		}
	}
          else if(s.equals("Forgot Password")){
                ForgotPass f = new ForgotPass();
                 f.setTitle("Forgot Password");
                 f.setSize(400,400);
								 f.getContentPane().setBackground(new java.awt.Color(207, 158, 255));
                 f.setVisible(true);
                 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            }


	}



	public static void main(String []args) throws Exception {

		Index In = new Index();
		In.setTitle("FeedBack - INDEX");
		In.setSize(4960,7016);
		In.getContentPane().setBackground(new java.awt.Color(217, 255, 223));
		In.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		In.setVisible(true);
	}

}
