package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i != input) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println("= " + sum);
		
	}
	
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int smallNum = num1 < num2 ? num1 : num2 ;
		int bigNum = num1 > num2 ? num1 : num2 ;
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = smallNum; i <= bigNum; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		for(int i = dan; i <= dan; i++) {
			System.out.println("===== " + i + "단 =====");
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		}
	}
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				
				for(int su = 1; su <= 9; su++) {
					System.out.println(i + " * " + su + " = " + (i * su));
				}
			}
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int space  = 0; space < (input - i); space++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice10(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int i = 1; i <= input; i++){
			for( int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= input; i++){
			for( int j = i; j <= (input - 1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int space  = 0; space < (input - i); space++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for(int j = 1; j <= (i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice12(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			if(i == 1 || i == input) {
				for(int j = 1; j <= input; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j = 1; j <= input; j++) {
					if(j == 1 || j == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public void practice13(){
	    Scanner sc = new Scanner(System.in);
		
		  System.out.print("자연수 하나를 입력하세요 : ");
		  int input = sc.nextInt();

	    int count = 0;

	    for(int i = 1; i <= input; i++){
	      if(i % 2 == 0 || i % 3 == 0){
	        System.out.print(i + " ");
	      }
	      if(i % 2 == 0 && i % 3 == 0){
	        count += 1;
	      }
	    }
	    System.out.println();
	    System.out.println("count : " + count);
	  }
}
