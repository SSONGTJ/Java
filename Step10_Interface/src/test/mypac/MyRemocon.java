package test.mypac;
/*
 *  인터페이스를 implements 하면 인터페이스에 정의 되어 있는 모든 추상 메소드를 오버라이드 해야된다.(강제임 ㅇㅇ)
 */

public class MyRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("채널 업~");
	}

	@Override
	public void down() {
		System.out.println("채널 다운~");
	}

}
