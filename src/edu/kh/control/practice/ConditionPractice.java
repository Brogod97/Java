package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int number = sc.nextInt();
		
		String result;
		
		if(number < 0) {
			result = "양수만 입력해주세요.";
		}else {
			if(number % 2 == 0) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
		}
		
		System.out.println(result);
	}

	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3;
		
		if((kor >= 40) && (eng >= 40) && (math >= 40) && (avg > 60)) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n",
								kor, math, eng, sum, avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 2, 4, 6, 9, 11: 
				System.out.println(month + "월은 30일까지 있습니다.");
				break;		
			case 1,3,5,7,8,10,12:
				System.out.println(month + "월은 31일까지 있습니다.");
				break;	
			default: 
				System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else if(bmi < 35) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println(bmi);
		System.out.println(result);
	}
}
