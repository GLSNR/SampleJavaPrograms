//Defining arrays and printing the element in the array.

package package1;

public class P4 {

	public static void main(String[] args) {
		
		//Array declaration type1
		int a[]=new int[5];
		boolean b[]=new boolean[4];
		String s[]=new String[5];
		
		//Array declaration type2
		int x[]= {2,3,4,5};
		boolean y[]= {true,false,true,true};
		String z[]= {"abc","cde","def","ghi","jkl"};
		
		//printing the elements using for loop
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}

}

//	Output:
//	true
//	false
//	true
//	true

