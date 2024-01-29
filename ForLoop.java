package JAVA_A;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop program to print table of any number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+(a*i));
		}
	}

}
