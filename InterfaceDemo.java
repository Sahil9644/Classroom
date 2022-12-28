package inheritance;
interface Printable{
	void display();
	void fun();
}
class Print implements Printable{@Override
public void display() 
{
	System.out.println("Display the message");
	// TODO Auto-generated method stub
	
}@Override
	public void fun() 
     {
		System.out.println("Fun learning");
		// TODO Auto-generated method stub
		
	}
	
}
class Message implements Printable{

	@Override
	public void display() {
		System.out.println("HEllO VOID");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun() {
		
		System.out.println("Programming is fun");// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
	

	public static void main(String[] args) {
		Printable p=new Print();
		p.display();
		p.fun();
		Message msg=new Message();
		msg.display();
		msg.fun();
		
		// TODO Auto-generated method stub

	}

}
