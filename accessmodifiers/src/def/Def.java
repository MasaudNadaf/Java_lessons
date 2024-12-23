package def;

public class Def {
	
	String str="hello";
	static int n=1;
	//u can access static and non static variable 
	//in nonstatic method
	 void test()
	{
		System.out.println(str+n);
	}
	  
	//static only access static variable 
	protected  static void test1()
	  {
	 
		 System.out.println(n);
	 }

}
