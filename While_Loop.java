package JAVA_A;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop program to print table of any number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int i = 1;
		while(i<=10) {

			System.out.println(a+"x"+i+"="+(a*i));
			i++;
		}
		
	}

}
