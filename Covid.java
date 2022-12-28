package inheritance;

import java.util.Scanner;

abstract class Vaccine
{
	int c=0,age;
	String yn,lo;
	abstract public void boosterdose();
	void getData()
	{
		System.out.println("Welcome to Cowin");
	}
	public abstract void firstDose();
	public abstract void secondDose();
	protected abstract void input();
}
class Firstdose extends Vaccine
{
	public void firstDose() 
	{
		int a=age;
		String l=lo;
		if(a>=18 && l.equals("Indian")) 
		{
			String yn="Y";
			c++;
		}
		
	}

	@Override
	public void boosterdose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void secondDose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void input() {
		// TODO Auto-generated method stub
		
	}
}

class Seconddose extends Vaccine
{
	
	public void secondDose(int c) 
	{
		if(c>=1)
		{
			System.out.println("You can get your Second dose");
		}
	}

	@Override
	public void boosterdose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void firstDose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void secondDose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void input() {
		// TODO Auto-generated method stub
		
	}


	
	
}
class Input extends Vaccine
{

	@Override
	public void boosterdose() {
		// TODO Auto-generated method stub
		
	}
	public void input()
	{
		System.out.println("Enter Details of User");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		sc.nextLine();
		lo=sc.nextLine();
		
	}
	@Override
	public void firstDose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void secondDose() {
		// TODO Auto-generated method stub
		
	}
    	
}


public class Covid
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vaccine fd=new Firstdose();
		fd=new Firstdose();
		fd.getData();
		fd.firstDose();
		Vaccine sd=new Seconddose();
		sd.getClass();
		sd.secondDose();
		Vaccine in=new Input();
		in.input();
		
	}
}






