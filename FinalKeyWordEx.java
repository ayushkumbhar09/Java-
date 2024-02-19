package JAVA_A;
import java.util.*;

class One{
	void aOne()
	{
		System.out.println("AOne-Base");
	}
	
	final void bOne()
	{
		System.out.println("BOne-Base");
	}
}
public class FinalKeyWordEx extends One{
	void aOne()
	{
		System.out.println("AOne-derived");
	}
	//final method cannot be override
    /*void bOne() {
    	System.out.println("derived class method");
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final variable
		final int AGE;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		AGE = sc.nextInt();
		int a = AGE;
		a++;
		System.out.println(a);
		FinalKeyWordEx f = new FinalKeyWordEx();
		f.aOne();
		f.bOne();//final method calling possible
		
		

	}

}
