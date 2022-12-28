package wrapperclass;

public class Wrapper {

	public static void main(String[] args) {
		int a=30;
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		Integer i1=a;
		System.out.println(i1);
		Integer in=new Integer(60);
		int c=in.intValue();
		System.out.println(c);
		int j=in;
		System.out.println(j);
		// TODO Auto-generated me;thod stub

	}

}
