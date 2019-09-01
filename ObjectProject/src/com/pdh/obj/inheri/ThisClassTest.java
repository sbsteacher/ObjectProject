package com.pdh.obj.inheri;

import com.pdh.obj.inheri.abc.ThisClass;

public class ThisClassTest {
	public static void main(String[] args) {
		
		//Ctrl + Shift + O : 클래스 임포트
		ThisClass tc = new ThisClass();
		ThisClass tc2 = new ThisClass(60);
		ThisClass tc3 = new ThisClass(70, 100);
		ThisClass tc4 = new ThisClass(40, 50, 60);
		
		tc.setA(80);
		
		String str = tc.toString();
		
		System.out.println(tc);
		
		System.out.println(tc2);
		System.out.println(tc3);
		System.out.println(tc4);

	}
}
