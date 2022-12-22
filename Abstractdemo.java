package inheritance;

abstract class Bank1
{abstract public void getLoan();
public void display()
{
	System.out.println("This is a Bank Class");
	
}
	}
class Sbi1 extends Bank1{
	public void getLoan() {
		System.out.println("7.5% is the interest");
	}
}
class Axis1 extends Bank1{
	public void getLoan() {
		System.out.println("9% is the interest");
	}
}
public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bk=new Sbi1();
		bk.display();
        bk.getLoan();
        bk=new Axis1();
        bk.getLoan();
        bk.display();
	}

}
