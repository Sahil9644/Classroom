package inheritance;

class Bank{                                //parent class
	public void loaninterest() {
		System.out.println("9% Interest");
	}
}
class Sbi extends Bank                     //subclass
{
	public void sbiloan()
	{
		System.out.println("For SBI");
	}	
	}
class Hdfc extends Bank{                    //subclass
	public void hdfcloan() {
		System.out.println("For HDFC");
	}
}
class Axis extends Bank{                    //subclass
	public void Axisloan()                  
    {
		System.out.println("For Axis");
		}
	}
public class HirarchicalDemo {

	public static void main(String[] args) {
		Axis ax=new Axis();   
		ax.Axisloan();
		ax.loaninterest();
		Hdfc hd=new Hdfc();
		hd.hdfcloan();
		hd.loaninterest();
		Sbi sb=new Sbi();
		sb.sbiloan();
		sb.loaninterest();

	}

}
