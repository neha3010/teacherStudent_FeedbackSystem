import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class FeedBackt4 {


	Scanner scan;
	static String q1,q2,q3,q4,q5,q6,q7,q8;

	public void openFile(){
		File file = new File("ps_fb.txt");
		try{
			Scanner scan = new Scanner(file);
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
