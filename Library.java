package inheritance;

import java.util.Scanner;

interface LibraryUser
{
	void registersaccount();
	void requestbook();
}
class Kidsuser implements LibraryUser
{
	int c,s,r;
	String name;
	@Override
	public void registersaccount() 
	{
		System.out.println("Enter your Name,\nClass,\nSection,\nRoll");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		c=sc.nextInt();
		s=sc.nextInt();
		r=sc.nextInt();
	}

	@Override
	public void requestbook() 
	{
		System.out.println("Name:"+name+"\nClass:"+c+"\nSection:"+s+"\nRoll:"+r+"You have been issued the book no.KIDS3453");
		
	}
	
}
class Adultuser implements LibraryUser{
	int c,s;
	String name;
	@Override
	public void registersaccount()
	{
		System.out.println("Enter your Name,\nUniqueId,\nPhone no.");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		c=sc.nextInt();
		s=sc.nextInt();
		
		
	}

	@Override
	public void requestbook()
	{
	
		System.out.println("Name:"+name+"\nId:"+c+"\nPhone no:"+s+"\nYou have been issued the book no.FICTION3453");
	}
	
}
public class Library {

	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age<=12) 
		{
			LibraryUser bk=new Kidsuser();
		
			bk.registersaccount();
			bk.requestbook();
			System.out.println("Age:"+age);
			
		}
		else
		{
			LibraryUser nm=new Adultuser();
			nm.registersaccount();
			nm.requestbook();
			System.out.println("Age:"+age);
		}

	}

}
