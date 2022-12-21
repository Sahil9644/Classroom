package classwork;

import java.util.Scanner;

public class college_selection 
{
	public static void main(String[] args) 
	{
	int ch,d;
	do
	{
	System.out.println("Welcome to Subject Selection Process \nSelect a Subject you want to persue\n1:ECE \n2:CSE \n3:CIVIL \n4:BBA \n5:BCA \n6:BSC \n7:Exit");

	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
		   	System.out.println("The subjects in ECE are : \n1:Engineering Mathematics – I \n2:Elements of Mechanical Engineering \n 3:Engineering Mathematics – II	\n4:Basic Electronics & Communication Engineering \n5:Engineering Physics	\n6:Basic Electronics \n7:Engineering Chemistry	Constitution of India and Professional Ethics");
			System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
		   	d=sc.nextInt();
		   	if(d==1)
		   	{
				System.out.print("Congratulations for choosing stream");
				ch=7;
		    }
		   	
			break;
		case 2:
			System.out.println("The subjects in CSE are : \n1:Artificial Intelligence \n2:Embedded Systems \n3:Computer Graphics \n4:Probability Theory For Computer Engineers \n5:Digital Image Processing \n6:Machine Learning \n7:Network Programming \n8:Software Project Management.");
			System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
		   	d=sc.nextInt();
		   	if(d==1)
		   	{
				
		   		System.out.print("Congratulations for choosing stream");
		   		ch=7;
		    }
		   	
			break;
			
			
		case 3:
			System.out.println("The subjects in Civil are :\n1.Engineering Mathematics-I \n2.Engineering Physics \n3.Engineering Chemistry \n4.Systems in Mechanical Engineering \n5.Basic Electrical Engineering \n6.Basic Electronics Engineering \n7.Programming and Problem Solving / 8.Engineering Mechanics \n9.Workshop");
		System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
	   	d=sc.nextInt();
	   	if(d==1)
	   	{
			System.out.print("Congratulations for choosing stream");
			ch=7;
	    }
	   	break;
	   	
	   	
		case 4:
			System.out.println("The subjects in BBA are:\n1:Microeconomics \n2:Financial Accounting \n3:Quantitative Techniques - I \n4:India Socio-Political Economics \n5:Principles of Management \n6:Essentials of IT");
			System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
		   	d=sc.nextInt();
		   	if(d==1)
		   	{
				System.out.print("Congratulations for choosing stream");
				ch=7;
		    }
		   	break;
		    
		case 5:
			System.out.println("The subjects in BCA are:    \n1:Fundamentals of Computers.\r\n"
					+ "    2:C Programming.\r\n"
					+ "    3:Operating Systems.\r\n"
					+ "    4:Multimedia Systems.\r\n"
					+ "    5:Understanding Organisational Behaviour.\r\n"
					+ "    6:Data and Database Management Systems.\r\n"
					+ "    7:Web-Based Application Development.\r\n"
					+ "    8:Computer Lab and Practical Work.");
			System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
		   	d=sc.nextInt();
		   	if(d==1)
		   	{
				System.out.print("Congratulations for choosing stream");
				ch=7;
		    }
		   	
			break;
		 
		case 6:
			System.out.println("The subjects in BSC are :    \n1:Fundamentals of Computer Organisation & Introduction to Embedded Systems.\r\n"
					+ "    2:Programming with Python- I.\r\n"
					+ "    3:Linux Fundamentals.\r\n"
					+ "    4:Discrete Mathematics.\r\n"
					+ "    5:Descriptive Statistics and Introduction to Probability.\r\n"
					+ "    6:Soft Skills Development.");
			System.out.println("Do you want to continue \n1:To continue \n2:for Main menu selection");
		   	d=sc.nextInt();
		   	if(d==1)
		   	{
				System.out.print("Congratulations for choosing stream");
				ch=7;
		    }
		   	
			break;
		case 7:
			System.exit(0);
		default:
			System.out.println("Enter correct option");
			break;
	}
	}
	while(ch<7);

}
}
		



