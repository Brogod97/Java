package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		// main 메소드: 꼭 있어야 실행 가능
		
		// notice ! 문장 끝에 ;(세미콜론) 찍어줘야 문장의 끝이라고 인식함.
		// 명령어 끝에 ; 없으면 에러 밠애 (Syntax Error)
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		// 변수 사용
		double pi = 3.141592653589793;
		int r = 5; // 반지름(radius)
		int h = 20; // 높이(height)
		
		System.out.println("==============="); // 변수 사용 전, 후 구분선
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이 
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
	}
}
