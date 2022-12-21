package inheritance;
class Animal{
	public void display() {
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	public void dog() {
		System.out.println("Dog is Barking");
	}
}

class Puppy extends Dog{
	public void puppy()
	{
		System.out.println("Puppy is Sleeping");
	}
}

public class Multilevelinheritance {
	public static void main(String[] args) {
		Puppy j=new Puppy();
		j.display();
		j.dog();
		j.puppy();
		
	} 

}
