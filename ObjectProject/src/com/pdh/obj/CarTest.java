package com.pdh.obj;

public class CarTest {
	public static void main(String[] args) {
		Car.brand = "쌍용";
		
		Car car1 = new Car();	
		car1.brand = "현대";
		car1.name = "쏘나타";
		
		Car car2 = new Car();
		car2.name = "K5";
		
		Car car3 = new Car();
		car3.name = "아반떼";
		
		System.out.println("car1.name : " + car1.name);
		System.out.println("car1.brand : " + car1.brand);
		car1.brand = "기아";
		
		
		System.out.println("car2.name : " + car2.name);
		System.out.println("car2.brand : " + car2.brand);
		System.out.println("car3.name : " + car3.name);
		System.out.println("car3.brand : " + car3.brand);
		System.out.println("car1.brand : " + car1.brand);

	}
}
