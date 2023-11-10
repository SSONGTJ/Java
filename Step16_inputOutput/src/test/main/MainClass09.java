package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		// 필요한 객체의 참조값을 담을 변수를 미리 만들기
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 파일에서 byte 를 읽어 들일 때 사용하는 객체
			fis = new FileInputStream("c:/Acorn 202310/myFolder/1.jpg");
			// byte 를 파일에 출력할 때 사용하는 객체
			fos = new FileOutputStream("c:\\Acorn 202310\\myFolder\\copied.jpg");
			
			// byte 알갱이를 읽어낼 배열을 미리 준비하기
			byte[] buffer = new byte[1024];
			
			// 반복문 돌면서
			while (true) {
				// byte[] 배열을 전달해서 byte 알갱이를 한번에 1024개씩 읽어들인다.
				int readedCount = fis.read(buffer); // 읽어들인 갯수가 리턴된다.
				System.out.println(readedCount+" byte 를 읽었어");
				if (readedCount == -1) {
					break;
				}
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// null 체크를 하면서 close 하기
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
