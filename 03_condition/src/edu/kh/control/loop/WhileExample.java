package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/* while문
	 * - 별도의 초기, 증감식이 존재하지 않고
	 *   반복 종료 조건을 자유롭게 설정하는 반복문
	 *   
	 * ** 확실히 언제 반복이 끝날지는 모르지만
	 * 	  언젠가 반복 조건이 false가 되는 경우 반복을 종료함
	 *
	 * [작성법]
	 * while( 조건식 ) {
	 * 		조건식이 true일 동안 반복 수행될 구문
	 * }
	 * 
	 * */
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input != 9) { // input이 9가 아닐 때 반복
			System.out.println("========키오스크=========");
			System.out.println("========메뉴선택=========");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1: System.out.println("떡볶이 주문 완료"); break;
			case 2: System.out.println("김밥 주문 완료"); break;
			case 3: System.out.println("쫄면 주문 완료"); break;
			case 9: System.out.println("키오스크를 종료합니다!"); break;
			default: System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}

	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
			// -> 0이 입력되지 않으면 계속 반복
		
		// 개인 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		
//		int sum = 0;
//		
//		while(input != 0) {
//			System.out.print("정수 입력 : ");
//			input = sc.nextInt();
//			
//			sum += input;
//		}
//		
//		System.out.println(sum);
		
		// 강사님 작성
		Scanner sc = new Scanner(System.in);
		int input = -1; // 처음부터 조건을 true로 만들고 시작
		int sum = 0;
		
		while( input != 0) {
			System.out.print("정수 입력: "); // 반복문 내부에서 중복 작성할 필요 없음
			input = sc.nextInt();
			
			sum += input;
		}
		System.out.println("합계: " + sum);
	}
	
	public void ex3() {
		// 1부터 입력한 값의 합
		// 단, 0을 초과한 숫자 입력
		// => 0 이하의 숫자를 입력할 시 "1 이상의 숫자를 입력해주세요" 문구 출력
		// EX) 입력값 : 5
		// => 1 + 2 + 3 + 4 + 5 = 출력해야하는 값
		// ex) 입력값: 10
		// => 1 + 2 + 3 ... + 10 = 출력해야하는 값
	
//		// 작성 답압
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력값 : ");
//		int input = sc.nextInt();
//		int x = 1;
//		int sum = 0;
//		
//		if(input <= 0) {
//			System.out.println("1 이상의 숫자를 입력해주세요");
//		}else {
//			while(x <= input) {
//				System.out.print(x != input ? x + " + " : x);
//				sum += x;
//				x++;
//			}
//			System.out.print(" = " + sum);
//		}
		
		// 강사님 답안
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int input = sc.nextInt();
		int sum = 0;
		
		if(input > 0) {
			int i = 1;
			
			while(i <= input) {
				sum += i;
				i++;
			}
			System.out.println("1부터" + input + "까지의 합은 " + sum + "입니다.");
			
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		// do ~ while은 최소 한번은 수행함
		
		do {
			System.out.print("정수: ");
			input = sc.nextInt();
			
			sum += input;
		} while(input != 0);
		
		System.out.println("합계: " + sum);
	}

}
