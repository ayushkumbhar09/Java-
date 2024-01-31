package JAVA_A;

public class StaticEx {
	int i =5;
	static int j = 10;
	 void show()
     {
    	 System.out.println(i+" "+j);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx se=new StaticEx();
		StaticEx se2=new StaticEx();
		se.i++;
		se.j++;
	System.out.println(se.i);//non static
	System.out.println(se2.i);
    System.out.println(se.j);
    System.out.println(se2.j);
	}

	}

     
