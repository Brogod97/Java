package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 컴파일 에러
		// int a = 99.9; 
		// 개발자가 코드 잘못 쓴 경우
		// 코드로 수정 가능!
		
		int a1 = (int)99.9; // 방법 1 : 강제 형변환으로 자료형 일치시키기
		double a2 = 99.9; 	// 방법 2 : 자료형을 double로 변경
		int a3 = 100;		// 방법 3 : 값을 변경
		
		// 런타임 에러
		while(true) {
			
			// 0 입력 시 종료되도로 함.
			System.out.print("정수 입력(0 입력 시 종료) : ");
			int input = sc.nextInt();
			// 정수 외의 값을 입력 할 시 런타임 에러 발생
			// Exception in thread "main" java.util.InputMismatchException
			
			// 탈출 구문
			if( input == 0 ) {
				break;
			}
		}

		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		// 			주로 if문으로 처리가 가능
		
		int[] arr = new int[3]; // 길이 : 인덱스 0, 1, 2까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// arr[3] = 40;
		// Exception in thread "main" 
		// java.lang.ArrayIndexOutOfBoundsException: (배열 범위 초과 예외)
		// Index 3 out of bounds for length 3
		
		if( 3 >= arr.length ) {
			System.out.println("배열 범위를 초과했습니다.");
		}else {
			arr[3] = 40;
		}
	}

}
