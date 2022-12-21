package inheritance;
class ParentBank{
	public void loanInterest() {
		System.out.println("9% Interest");
	}
}
class Childsbi extends ParentBank {
	public void loanInterest() {
		System.out.println("7.5% Interest");
	}
	
}
class Childaxis extends ParentBank{
	public void loanInterest() {
		System.out.println("8% Interest");
	}
}
class ChildHdfc extends ParentBank
{
	public void loanInterest() {
		System.out.println("12% Interest");
	}
	}
public class Methodoverriding {

	public static void main(String[] args) {
		//Childsbi sbi=new Childsbi();
		//sbi.loanInterest();
		//ChildHdfc hdfc=new ChildHdfc();
		//hdfc.loanInterest();
		ParentBank pb;
		pb=new Childsbi();      //upcasting
		pb.loanInterest();
		pb=new ChildHdfc();
		pb.loanInterest();
		pb=new Childaxis();
		pb.loanInterest();
		
	}
}
