package com.pdh.obj;

public class OverLoadingClass {
	static int sum(int... num) {
		int result = 0;
		for(int i=0; i<num.length; i++) {
			result += num[i];
		}
		return result;
	}
	
	
	
	
	
	
}
