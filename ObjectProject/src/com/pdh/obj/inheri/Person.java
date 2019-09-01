package com.pdh.obj.inheri;

public class Person extends Object {	
	private String name;
		
	public Person(String name) {		
		this.name = name;
		System.out.println("Created Person");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void breath() {
		System.out.println(this.name + " 숨쉬기");
	}
	
	public void eat() {
		System.out.println(this.name + " 밥먹기");
	}
	
	public void say() {
		System.out.println(this.name + " 말하기");
	}	
}
