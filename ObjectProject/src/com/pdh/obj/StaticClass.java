package com.pdh.obj;

public class StaticClass {
	static String s_name; //클래스 변수
	String n_name; //인스턴스 변수
	
	static void sPrintname() { //클래스 메소드
		System.out.println(s_name + " 입니다.");
		//System.out.println(n_name + " 입니다.");
	}
	
	String sum(int a, int b) {
		return n_name + (a + b);
	}	
	
	void nPrintname() { //인스턴스 메소드
		System.out.println(s_name + " 입니다.");
		System.out.println(n_name + " 입니다.");
	}
	
}
