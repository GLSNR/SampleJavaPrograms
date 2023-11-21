//TokenPassword
//Java Program to access varibles from method.

package package1;

public class P1 {
	
	//method creation
	public void m1()
	{
		//declaring varibles
		int a=5;
		String s="Hello User";
		float f=24.5f;
		double d=52.34;
		char c='h';
		
		//printing the declared varibles.
		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		//Object creation
		P1 p=new P1();
		
		//method calling using object varible p
		p.m1();
	}

}


//  Output:
//	5
//	Hello User
//	24.5
//	52.34
