package JAVA_A;

import java.util.Scanner;

public class Constructor {
	int a = 5;
	int b = 10;
	Constructor(){
		System.out.println("Hello  , I am Constructor!");
	}
	void mul(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}
	
	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//int x = sc.nextInt();
		//int y = sc.nextInt();
		
		Constructor cc = new Constructor();
		//cc.mul(cc.a,cc.b);
		
		System.out.println(cc.add(cc.a,cc.b));
		int z = cc.add(cc.a,cc.b);
		System.out.println(z);
		
		

	}
     
}
