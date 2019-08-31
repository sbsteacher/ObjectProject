package com.pdh.obj.inheri;

public class Teacher extends Person {
	
	public Teacher() {	
		super("홍길동");
		System.out.println("Created Teacher");
	}
	
	public void teach() {
		System.out.println(getName() + " 가르치기");
	}
	
	@Override
	public void breath() {
		System.out.println(getName() + " 명상하며 숨쉬기");
	}
}
