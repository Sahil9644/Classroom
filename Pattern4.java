package classwork;

public class Pattern4 {

	public static void main(String[] args) 
	{ 
		int i,j,r=5,s;
		
		for(i=5;i>=1;i--)
		{
			for(s=i;s<=5;s++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
