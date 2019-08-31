package com.pdh.obj;

public class ConstructorClass {
	private int num;
	private String name;
			
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num > 140 || num < 0) {
			return;
		}
		
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() < 1) {
			return;
		}
		this.name = name;
	}

	final String BRAND;
	
	public ConstructorClass() { 
		BRAND = "쉐보레";
	}
	
	public ConstructorClass(String brand) {
		this.BRAND = brand;
	}
	
	public ConstructorClass(String brand, String name, int num) {
		this.BRAND = brand;		
		setName(name);
		setNum(num);
	}
	
	public void printNameNum() {
		System.out.println("num : " + this.num + ", name : " + this.name);
	}
}
