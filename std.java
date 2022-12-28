package classwork;
class st
{
	int id;
	 String name;
	 static String college="SVU";
	 st(int id,String name)
	 {
		this.id=id;
		this.name=name;
	 }
	 void display() 
	 {
		 System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"College: "+college);
	 }
}
public class std{

	public static void main(String[] args) {
	 st s1=new st(111,"karan");
	 st s2=new st(112,"Sahil");
	 s1.display();
	 System.out.println("=================================================================");	 

	 s2.display();
	}

}
