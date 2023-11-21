//Java Program to access varibles from method.

package package1;

public class P1 {
	
	public void m1()
	{
		int a=5;
		String s="Hello User";
		System.out.println(a);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 p=new P1();
		p.m1();
	}

}