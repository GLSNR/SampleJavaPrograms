//Variables initilization using constructor and passing values in object creation

package package1;

public class P3 {

	//declaring class level variables
	int a;
	String k;
	float f;
	double d;
	
	//Constructor is used to initilize the class level variables.
	P3(int m, String n, float o, double p)
	{
		//this is the keyword which is used for current class variables reference
		this.a=m;
		this.k=n;
		this.f=o;
		this.d=p;
	}
	
	public static void main(String[] args) {
		
		//Creating object and passing the values as arguments
		P3 p=new P3(12, "Hello", 2.33f, 14.2344);
		
		//printing the values using object reference varible p
		System.out.println(p.a);
		System.out.println(p.k);
		System.out.println(p.f);
		System.out.println(p.d);
	}

}

//Output:
//12
//Hello
//2.33
//14.2344