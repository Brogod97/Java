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
		
		if((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60)) {
			System.out.printf("국어 : %d\n"
							+ "수학 : %d\n"
							+ "영어 : %d\n"
							+ "합계 : %d\n"
							+ "평균 : %.1f\n"
							, kor, math, eng, sum, avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 2: result = month + "월은 28일까지 있습니다."; break;
		case 4, 6, 9, 11: result = month + "월은 30일까지 있습니다."; break;
		case 1, 3, 5, 7, 8, 10, 12: result = month + "월은 31일까지 있습니다."; break;	
		default: result = month + "월은 잘못 입력된 달입니다.";
		}
		
		System.out.println(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23) {
			result = "정상체중";
		}else if(bmi < 25) {
			result = "과체중";
		}else if(bmi < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println(result);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midterm = sc.nextDouble() * 0.2;

		System.out.print("기말 고사 점수 : ");
		double finalExam = sc.nextDouble() * 0.3;
		
		System.out.print("과제 점수 : ");
		double assignment = sc.nextDouble() * 0.3;
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();
		
		double sum = midterm + finalExam + assignment + attendance;
		
		System.out.println("================= 결과 =================");
		
		if(attendance < 20 * 0.7) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)attendance + "/20)]");
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n"
							+ "기말 고사 점수(30) : %.1f\n"
							+ "과제 점수 	    (30) : %.1f\n"
							+ "출석 점수 	    (20) : %.1f\n"
							+ "총점 : %.1f\n"
							, midterm, finalExam, assignment, attendance, sum);
			
			if(sum < 70) {
				System.out.println("Fail [점수 미달]");
			}else {
				System.out.println("Pass");
			}
		}
	}
}