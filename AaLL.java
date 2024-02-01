package JAVA_A;
import java.util.*;
import java.util.ArrayList;
public class AaLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>();//generic
		List<Integer> al1 = new ArrayList<Integer>();
		List al2 = new ArrayList<>();//non generic
		ArrayList<String> al3 = new ArrayList<>();
		al2.add(1);
		al2.add("Ayush");
		al2.add('S');
		al2.add(445.44);
		System.out.println(al2);
		al.add(44);
		al.add(55);
		al.add(23);
		al.add(88);
		al.add(1);
		al1.add(55);
		al1.add(90);
		System.out.println("Before add: "+al.size());
		al.addAll(al1);
		System.out.println("After add: "+al.size());
		//int x = al.remove(2);
		System.out.println(+al.size());
		//System.out.println("removed number: "+x);
		System.out.println("Position 2: "+al.get(3));
		al.set(1,50);
		Iterator<Integer>i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		System.out.println();
		System.out.println("Before sort: "+al);
		al.sort(Comparator.naturalOrder());
		System.out.println("After sort: "+al);
		al.sort(Comparator.reverseOrder());
		System.out.println("Reverse order"+al);
		
		
		
		

	}

}
