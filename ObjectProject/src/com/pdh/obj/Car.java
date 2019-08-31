package com.pdh.obj;

public class Car {
	public static String brand;
	public String name; //차이름
	public String color;
	public int cc;
	public int doorCnt; //도어 갯수
	
	public void drive() {
		System.out.println(this.name + " 달린다");
	}
	
	public void stop() {
		System.out.println(this.name + " 정지한다");
	}
}
