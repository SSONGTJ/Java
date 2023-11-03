package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		useCar(new Car());
		
		class MyCar extends Car{
			@Override
			public void drive() {
				System.out.println("졸라 빨리 달려요!");
			}
		}
		
		useCar(new MyCar());
		
		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("졸라 빨리 달려요!");
			}
		});
		
		
	}
	// Car type 을 매개 변수에 전달 받는 static 메소드
	public static void useCar(Car car) {
		car.drive();
		car.drive();
	}
}
