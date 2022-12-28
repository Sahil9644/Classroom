package inheritance;
interface Printable1
{
	void display();
	void fun();
	}
interface Drawable extends Printable1
{
	void draw();
	
	
}
interface Sayable{
	void say();
}
class Print1 implements Drawable{
	@Override
	public void display() {
		System.out.println("Display the message");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun() {
		System.out.println("Learning is fun");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		System.out.println("This is print class");
		// TODO Auto-generated method stub
		
	}
	
}
class Message1 implements Drawable,Sayable{

	@Override
	public void display() {
		System.out.println("This is message1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun() {
		System.out.println("This is message 2");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		System.out.println("This is message 3");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		System.out.println("This is message 4");
		// TODO Auto-generated method stub
		
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		Print1 p=new Print1();
		p.display();
		p.fun();
		p.draw();
		Message1 msg=new Message1();
		msg.display();
		msg.fun();
		msg.say();
		msg.draw();

		// TODO Auto-generated method stub

	}

}
