package edu.kh.variable.ex1;

public class VariableExample3 {
	public static void main(String[] args) {
		/* 형변환(casting) : 값의 자료형을 변환하는 것(boolean 제외)
		 * 
		 * 형변환이 필요한 이유?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능
		 * 다른 자료형과 연산 시 오류 발생
		 * --> 이런 상황을 해결하기 위해 필요한 기술이 형변환임
		 * 
		 * [자동 / 강제] 형변환 2가지 존재
		 * 
		 * */
		
		// 자동 형변환
		// - 값의 범위가 [큰 자료형]과 값의 범위가 [작은 자료형] 연산 시
		// 작은 자료형 -> 큰 자료형으로 컴파일러에 의해 자동적으로 변환되는 것을 의미
	
		int num1 = 10;
		double num2 = 3.5;
		
		// 원칙적으로는 에러가 발생해야 하지만, 자동형변환 덕분에 에러 X
		System.out.println(num1 + num2);
		
		int i1 = 3;
		double d1 = i1; // double은 실수만 저장될 수 있는 자료형
						// 정수가 대입되는 연산이 수행되면
		System.out.println("i1: " + i1);
		System.out.println("d1: " + d1);
		
		System.out.println(d1 + num2); // double + double
		
		// char 문자형 자료형
		// char 자료형은 문자형이지만 실제 저장하는 값은
		// 0 부터 6만 5천번 사이에 있는 숫자
		char ch = 'V';
		int i3 = ch; // int 변수 = char 값
					//			=> int 자동형변환
		System.out.print("i3 :" + i3);
		
		char ch1 = '각';
		int i4 = ch1;
		
		System.out.print("i4 :" + i4);
		
		
	}
	
	
}
