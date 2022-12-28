package inheritance;
class HumanBody{
	public void displayHuman() {
		System.out.println("This is human body");
	}
	
}
interface Male {
	public void displayMale();
}
interface Female
{
	public void show();
}
class Child4 extends HumanBody implements Male,Female{

	@Override
	public void show() {
		System.out.println("This is show method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMale() {
		System.out.println("This is child");
		// TODO Auto-generated method stub
		
	}

	
	
}
public class HybridinheritaceDemo {
	public static void main(String[] args) {
		Child4 dk= new Child4();
		dk.displayHuman();
		dk.displayMale();
		dk.show();
	}

}
