package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		// 인터페이스도 익명 클래스를 활용해서 구현 후에 참조값을 얻어낼 수 있다.
		Remocon r1=new Remocon() {//얘도 이렇게 쓸 수 있음. implements Remocon 으로 알아서 받음.

			@Override
			public void up() {
				System.out.println("올려~");
			}

			@Override
			public void down() {
				System.out.println("내려~");
			}	
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("올리라니까~");
			}
			
			@Override
			public void down() {
				System.out.println("내리라니까~");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.down();
		r.up();
	}
}
