//Accessing class level varibles form the main method using object reference

package package1;

public class P2 {
	
	//Declaring varibles at class level
	int a;
	String k;
	float f;
	double d;

	public static void main(String[] args) {
		
		//Object creation
		P2 p2=new P2();
		
		//It will print the default values of the datatypes.
		//Here we are calling class varibles using its reference varible p2
		System.out.println(p2.a);
		System.out.println(p2.k);
		System.out.println(p2.f);
		System.out.println(p2.d);	
	}

}


//  Output:
//	0
//	null
//	0.0
//	0.0
