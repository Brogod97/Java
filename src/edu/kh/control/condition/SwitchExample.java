package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	/*
	 * switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 * [작성법]
	 * switch(식) {
	 * 	case 결과값1 : 수행코드 1; break;
	 * 	case 결과값2 : 수행코드 2; break;
	 * 	case 결과값3 : 수행코드 3; break;
	 * 	...
	 * 	default : case를 모두 만족하지 않을 경우 수행하는 코드 (== else)
	 * }
	 * */
	
	public void ex1() {
		// 키보드로 정수를 입력 받아
		// 1이면 "빨강색"
		// 2이면 "주황색"
		// 3이면 "노란색"
		// 4이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		String result;
		
//		// if문으로 작성하는 경우
//		if(input == 1) {
//			result = "빨강";
//		} else if(input == 2) {
//			result = "주황";
//		} else if(input == 3) {
//			result = "노랑";
//		} else if(input == 4) {
//			result = "초록";
//		} else {
//			result = "흰색";
//		}
//		
//		System.out.println(result);
		
		// switch문으로 작성하는 경우
		switch(input) {
		
		case 1: result = "빨강"; break;
		case 2: result = "주황"; break;
		case 3: result = "노랑"; break;
		case 4: result = "초록"; break;
		default: result = "흰색";
		}
		
		System.out.println(result);
		
	}
	
	public void ex2() {
		// 달(month)를 입력받아 해당 달에 맞는 계절 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.print("달 입력: ");
		int month = sc.nextInt();	
		
		String season;
		
		switch(month) {
		case 3: case 4: case 5: season = "봄"; break;
		case 6: case 7: case 8: season = "여름"; break;
		case 9: case 10: case 11: season = "가을"; break;
		case 12: case 1: case 2: season = "겨울"; break;
		default: season = "해당하는 계절 없음";
		}	
				
		System.out.println(season);
	}

	public void ex3() {
		// 연산자 (+ - * / %)
		// -> 연산자는 String
		// 정수 1: 5
		// 정수 2: 10
		// 연산자 : *
		// 계산 결과 : 5 * 10 = 50
		// 0으로 나눌 경우 "0으로 나눌 수 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String operator = sc.next();
		
		switch(operator) {
		case "+": System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		break;
		
		case "-": System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		break;
		
		case "*": System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		break;
		
		case "/": 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else {
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			}
			break;	
		
		case "%": System.out.printf("%d % %d = %d\n", num1, num2, num1 % num2);
		}
		
	}
}
