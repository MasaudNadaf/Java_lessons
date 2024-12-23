package p2;
import p1.Publ;

public class Publ1 extends Publ {
	
	
	public static void main(String[] args) {
		
		
		Publ.test1();//stat call direct by class
		
		Publ p=new Publ();//object create to call nonstat
		p.test();
		
		
		
		


}
}
