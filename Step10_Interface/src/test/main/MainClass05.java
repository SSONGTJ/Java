package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		//
		Calc add1 = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				return num1+num2;
			}
		};
		double result1=add1.execute(60,5); //65
		
		// 매개변수의 type은 선언할 필요가 없다. 매개 변수의 갯수만 맞으면 됨
		Calc add2=(num1,num2)->{
			return num1*num2;
		};
		double result2=add2.execute(398, 10);
		
		// 중괄호 안에서 따로 실행 할 code 가 없다면 중괄호 생략, return 예약어 생략 후 리턴할 값만 명시하면 된다.
		Calc add3=(num1,num2)->num1/num2;	//한줄짜리 함수모양 => ()-> 블라블라 // 이걸 람다식이라고 함
		double result3=add3.execute(38938,10);
		
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		Calc mul=(a,b)->a*b;
		
		double result4=add.execute(199, 309);
		double result5=sub.execute(39384, 34);
		double result6=mul.execute(58, 9);
		
	}
}
