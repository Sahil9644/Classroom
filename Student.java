package inheritance;

import java.util.Scanner;

class Multi_Inhe
{
    int rollno;
    String name;

    Multi_Inhe(int r, String n)
    {
        rollno = r;
        name = n;
    }
    void dispdatas()
    {
        System.out.println("Rollno = " + rollno);
        System.out.println("Name = " + name);
    }
}

class marks extends Multi_Inhe
{
    int total;
    marks(int r, String n, int t)
    {
        super(r,n);   //call super class (student) constructor
        total = t;
    }
    void dispdatam()
    {
        dispdatas();    // call dispdatap of student class
        System.out.println("Total = " + total);
    }
}

class percentage extends marks
{
    int per;
     
    percentage(int r, String n, int t, int p)
    {
        super(r,n,t);  //call super class(marks) constructor
        per = p;
    }
    void dispdatap()
    {
        dispdatam();    // call dispdatap of marks class
        System.out.println("Percentage = " + per);
    }
}
class Student
{
    public static void main(String[] args)
    {
    	int roll,total,per;
    	String name;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Name \nRoll \nTotal Marks \nPercentage");
    	name=sc.nextLine();
    	roll=sc.nextInt();
    	total=sc.nextInt();
    	per=sc.nextInt();
        percentage stu = new percentage(roll,name,total,per); //call constructor percentage
        stu.dispdatap();  // call dispdatap of percentage class
    }
}
