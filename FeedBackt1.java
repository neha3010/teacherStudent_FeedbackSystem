import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class FeedBackt1 {


	Scanner scan;
	static String q1,q2,q3,q4,q5,q6,q7,q8;
	static String q21,q22,q23,q24,q25,q26,q27,q28;

	public void openFile(){

		try{


			File file = new File("praf_fb.txt");

			Scanner scan = new Scanner(file);
			scan.useDelimiter("/");
			// while(scan.hasNext()){
				q1 = scan.next();
			 	q2 = scan.next();
			 	q3 = scan.next();
			 	q4 = scan.next();
			 	q5 = scan.next();
			 	q6 = scan.next();
			 	q7 = scan.next();
			 	q8 = scan.next();

			scan.close();}



		catch(Exception e){
				System.out.println("File not Found");
		}

	}

	public void openFile2(){

		try{


			File file2 = new File("praf_fb_2.txt");

			Scanner scan = new Scanner(file2);
			scan.useDelimiter("/");
			// while(scan.hasNext()){
				q21 = scan.next();
			 	q22 = scan.next();
			 	q23 = scan.next();
			 	q24 = scan.next();
			 	q25 = scan.next();
			 	q26 = scan.next();
			 	q27 = scan.next();
			 	q28 = scan.next();

			scan.close();}



		catch(Exception e){
				System.out.println("File not Found");
		}

	}
}
