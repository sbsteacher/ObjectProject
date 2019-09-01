package com.pdh.obj.inheri;

public class Student extends Person {
	
	public Student() {
		super("학생");
	}
	
	public void learn() {
		System.out.println(getName() + " 공부하기");
	}
}
