import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class FeedBackt2 {


	Scanner scan;
	static String q1,q2,q3,q4,q5,q6,q7,q8;

	public void openFile(){

		try{
			File file = new File("bhargav_fb.txt");
			Scanner scan = new Scanner(file);
		//	List<FeedBack> fb = new ArrayList<FeedBack>();
			scan.useDelimiter("/");


				q1 = scan.next();
			 	q2 = scan.next();
			 	q3 = scan.next();
			 	q4 = scan.next();
			 	q5 = scan.next();
			 	q6 = scan.next();
			 	q7 = scan.next();
			 	q8 = scan.next();

				//System.out.println(q1+" "+q3);


			
			scan.close();
		}
		catch(Exception e){
				System.out.println("File not Found");
		}

	}
}
