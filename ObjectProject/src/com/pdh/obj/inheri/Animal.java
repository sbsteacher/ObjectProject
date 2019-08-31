package com.pdh.obj.inheri;

public class Animal extends Object {
	
	char[] aaa = {'A', 'n', 'i', 'm', 'a', 'l'};
	
	@Override
	public String toString() {
		String str = "";
		for(int i=0; i<aaa.length; i++) {
			str += aaa[i];
		}
		str += "\n";
		return str;
	}
}
