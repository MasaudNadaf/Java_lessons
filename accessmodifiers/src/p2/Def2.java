package p2;

import def.Def;

public class Def2 extends Def{
	public static void main(String[] args) {
		
		
		Def d=new Def();
		//default not access by other package
		//d.test();
		Def.test1();
		
		
	}

}
