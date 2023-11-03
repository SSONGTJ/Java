package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		// 여기서 중괄호는 익명 클래스를 의미한다. 
		// extends Weapon을 상속받은 클래스다.
		// new Weapon() 은 익명클래스의 생성자를 call 하는 표현식
		// class ? extends Weapon{} 익명의 로컬 이너클래스
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("ㄱㄱ");
				
			}
		};
		
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("RRRR??");
				
			}
		});
	}
	
	// Weapon type 의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
