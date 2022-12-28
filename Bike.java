package classwork;

import java.util.Scanner;

class Details
{
	String bikec,model,no;
	public Details(String bikec,String model,String no)
	{
		this.bikec=bikec;
		this.model=model;
		this.no=no;
	}
	void getData() {
		System.out.println("Vehicle Company:"+bikec+"\n"+"Vehicle model:"+model+"Vehicle number"+no);
		
	}

}
class Assign extends Details
{
	String type,dname,dl;
	public Assign(String bikec,String model,String no,String type,String dname,String dl)
	{
		super(bikec,model,no);
		this.type=type;
		this.dname=dname;
		this.dl=dl;
	}
	void setData()
	{
		super.getData();
		System.out.println("Vehicle type: "+type+"\n"+"Driver name: "+dname+"\nDriving License: "+dl);
		
	}
}
public class Bike
{
	public static void main(String[] args) {
		String bikec,model,no,dname,dl,type;
		System.out.println("enter 1:For 4wheeler \n2:For 2wheeler");
		Scanner sc=new Scanner(System.in);
		type=sc.nextLine();
		System.out.println("Enter Vehicle company \nmodel \nnumber");
		bikec=sc.nextLine();
		model=sc.nextLine();
		no=sc.nextLine();
		System.out.println("Enter driver Details: \nName: \nDriving License: ");
		dname=sc.nextLine();
		dl=sc.nextLine();
		Assign g=new Assign(bikec,model,no,type,dname,dl);
		g.setData();
	}
	}
