package com.pdh.obj;

public class OverLoadingClassTest {

	public static void main(String[] args) {
		int result = OverLoadingClass.sum(1);
		System.out.println("result : " + result);
		
		result = OverLoadingClass.sum(1, 4);
		System.out.println("result : " + result);
		
		result = OverLoadingClass.sum(10, 23, 44);
		System.out.println("result : " + result);
		
		result = OverLoadingClass.sum(10,20,30,40,50,60,70,20,222);
		System.out.println("result : " + result);
		
		
	}

}
