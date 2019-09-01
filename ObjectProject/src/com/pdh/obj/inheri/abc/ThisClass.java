package com.pdh.obj.inheri.abc;

public class ThisClass {
	/*
		자바로 웹서버 개발 기준!!
		멤버필드변수에 값 넣는 방법 
		- 생성자 통해서
		- 메소드 통해서 (setter)
		
		멤버필드변수에 값 가져오는 방법
		- 메소드 통해서 (getter)
	 */
	
	//멤버필드(변수 or 상수)
	//멤버필드에 private하는 것은 은닉화(캡슐화) > 웹서버 개발 기준
	//1~50
	private int a; 
	private int b;
	private int c;
	
	//기본생성자
	public ThisClass() {}
	
	public ThisClass(int a) {		
		this(a, 0, 0);
	}
	
	public ThisClass(int a, int b) {		
		this(a, b, 0);
	}
	
	public ThisClass(int a, int b, int c) {	
		setA(a);
		setB(b);
		setC(c);		
	}
	
	//멤버메소드	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		if(a>=1 && a<=50) {
			this.a = a;	
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if(b>=1 && b<=50) {
			this.b = b;
		}
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		if(c>=1 && c<=50) {
			this.c = c;
		}
	}
	
	@Override
	public String toString() {
		//return "a : " + a + ", b : " + b + ", c : " + c;
		return String.format("a: %d, b: %d, c:%d", a, b, c);
	}
}















