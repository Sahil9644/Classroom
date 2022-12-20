package inheritance;

import java.util.Scanner;

class User
{
	int id;
	String name;
	double sal;
	public User(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void setData()
	{
		System.out.println("Id:"+id+"\n"+"Name:"+name+"\n"+"Salary:"+sal);
	}
	
}
class Employee extends User
{
   String des1,address;
   public Employee(int id,String name,double sal,String des,String address) 
   {
	   super(id,name,sal);
	   des1=des;
	   this.address=address;
	   
   }
   void showData()
   {
	   //super.setData();
	   System.out.println("Designation:"+des1);
	   
   }
	
}

public class salaryinheritance 
{
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		int id,sal;
		String name,des,add;
		System.out.println("Enter name:"+"\n"+"id:"+"\n"+"Salary:"+"\n"+"Designation:"+"\n"+"Address:");
	 	name=sc.nextLine();
		id=sc.nextInt();
		sal=sc.nextInt();
		sc.next();
		des=sc.nextLine();
		add=sc.nextLine();
		
		Employee ch=new Employee(id,name,sal,des,add);
		ch.showData();
		
	}
}
