package inheritance;
abstract class A{
	abstract void display();
	public void demo() {
		System.out.println("abstract class");
	}
}
interface in{
	int add(int a,int b);
}
class Child3 extends A implements in
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.print("The answer is: ");
	}
}
public class AbstractInheritance {
	public static void main (String[] args) {
		Child3 cal=new Child3();
		cal.display();
		int a=cal.add(5, 7);
		System.out.println(a);
		cal.demo();
	}
	} 


