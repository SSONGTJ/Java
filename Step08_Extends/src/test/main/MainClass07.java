package test.main;

import java.util.Scanner;

import test.mypac.Phone;

/*
 * 		java 에서 사용하는 모든 data 는 Object type 변수나 필드에 담을 수 있다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		//	기본 data type 은 Wrapper Class type 으로 간주되어서 담긴다.
		Object a=10; // Integer
		Object b=true;	//Boolean
		Object c='a';	// Character
		//	모든 참조 data type 은 당연히 Object type도 된다.
		Object d="abcd";
		Object e=new Phone();
		Object f=new Scanner(System.in);
		
		Object[] objs=new Object[5];
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		
		// 지역변수 e에 저장된 참조값을 이용해서 전화를 걸어 보세요.
		Phone calling=(Phone)e;
		calling.Call();
		
		//	objs 배열의 3번방에 있는 참조값을 이용해서 전화를 걸어보세요.
		Phone calling2=(Phone)objs[3];
		calling2.Call();
		
		// 위의 2줄을 조금 더 줄이면
		((Phone)objs[3]).Call();

	}
}
