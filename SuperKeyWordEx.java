package JAVA_A;
class BaseClass
{
	int a=7;
	void show()
	{
		System.out.println("Show - base");
	}
}

public class SuperKeyWordEx extends BaseClass{

	
		// TODO Auto-generated method stub
		int a=10;
		void show()
		{
			super.show();//base class method called
			//System.out.println("Show - derived");
			System.out.println(super.a);//base class value print
		}

		public static void main(String[] args) {
			SuperKeyWordEx s=new SuperKeyWordEx();
			
			s.show();

	}

}
