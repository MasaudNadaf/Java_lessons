package protect;

public class Prot2 extends Prot1 {
	
	protected void test2()
	{
		System.out.println("boss");
	}
	
	public static void main(String[]args) {
		Prot1.test();
		Prot2 t=new Prot2();
		t.test2();
		
		
		
		
	}

}
