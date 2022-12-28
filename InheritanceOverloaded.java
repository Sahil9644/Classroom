package inheritance;

interface Roll
{
  public void sum();
}
interface Name4 extends Roll
{
  default void sum()
  {
    System.out.println("Hello this is interface Name");
  }
}
interface Sec extends Roll
{
  default void sum()
  {
    System.out.println("Hello this is interface Sec");
  }
}
class Student5 implements Name4,Sec
{
  public void sum()
  {
    System.out.println("Hello this is class Student");
    Name4.super.sum();
    Sec.super.sum();
  }  
}

public class InheritanceOverloaded 
{ 

public static void main(String[] args) 
{
		Student5 obj=new Student5();
	    obj.sum();
		// TODO Auto-generated method stub

	}

}

