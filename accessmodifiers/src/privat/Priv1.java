package privat;

public class Priv1 {
	
	private static void demo1()
	{
		System.out.println("acces  private static method");
	}
	

	 private void demo()
	{
		System.out.println("Accessing private method ");
	}


	
	public static void main(String[] args) {
		
		Priv1 p=new Priv1();
		p.demo();
		Priv1.demo1();
		
		
	}
}
