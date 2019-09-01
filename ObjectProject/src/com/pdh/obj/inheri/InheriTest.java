package com.pdh.obj.inheri;

public class InheriTest {

	public static void main(String[] args) {
		/*
		Person p = new Person();
		p.setName("홍길동");
		p.breath();
		p.eat();
		p.say();
		*/
		Student s = new Student();		
		s.setName("학생");
		s.breath();
		s.eat();
		s.say();
		s.learn();
		
		
		Teacher t = new Teacher();
		t.setName("선생님");
		t.breath();		
		t.eat();
		t.say();
		t.teach();
		
	}

}











