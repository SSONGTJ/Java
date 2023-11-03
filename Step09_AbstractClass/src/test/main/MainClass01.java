package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상클래스 단독으로 객체 생성 불가
		//Weapon w1 = new Weapon();
		
		// Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type 의 참조값 얻어내기
		Weapon w1 = new MyWeapon();
		// 메소드 호출
		w1.prepare();
		w1.attack();
	}
}
