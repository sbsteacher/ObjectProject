package com.pdh.obj;

public class StaticClassTest {
	public static void main(String[] args) {
		StaticClass.s_name = "IT아카데미";
		
		//StaticClass.n_name = "asldkfjaslfdj";
		StaticClass sc1 = new StaticClass();
		sc1.nPrintname();
		
		
		StaticClass.sPrintname();
		
		String str = "12121";
		int intValue = Integer.parseInt(str);
		
		
		System.out.println(intValue + 3);
	}

}
