package com.pdh.obj;

public class ConstructorClassTest {

	public static void main(String[] args) {
		ConstructorClass cc1 = new ConstructorClass("현대");
		cc1.setName("홍길동");
		cc1.setNum(23);
		
		ConstructorClass cc2 = new ConstructorClass("기아", "장보고", 20);
		ConstructorClass cc3 = new ConstructorClass("쌍용");
		ConstructorClass cc4 = new ConstructorClass();
		System.out.println(cc1.BRAND);
		System.out.println(cc2.BRAND);
		System.out.println(cc3.BRAND);
		System.out.println(cc4.BRAND);

	}

}
