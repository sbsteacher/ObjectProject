package com.pdh.obj;

public class BoongBreadTest {
	public static void main(String[] args) {		
		BoongBread bb1 = new BoongBread();		
		bb1.name = "왕눈이";
		bb1.weight = 100;
		bb1.dan = "kg";		
		bb1.swim();
		
		BoongBread bb2 = new BoongBread();
		bb2.name = "삐돌이";
		bb2.weight = 20;
		bb2.dan = "g";		
		bb2.swim();
		
		System.out.println(bb1.name);
		System.out.println(bb1.weight);
		System.out.println(bb1.dan);
		
		System.out.println("-------");
		System.out.println(bb2.name);
		System.out.println(bb2.weight);
		System.out.println(bb2.dan);
		
		System.out.println("-------");
		BoongBread bb3 = bb2;
		bb2 = bb1;		
		System.out.println(bb2.name);
		System.out.println(bb2.weight);
		System.out.println(bb2.dan);
		
		
		
		
		
		
	}

}
