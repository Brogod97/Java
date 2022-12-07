package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("값을 입력하시오: ");
		
//		int input1 = sc.nextInt(); 
//		System.out.println(input1);
		
//		System.out.print("실수 값을 입력하시오: ");
//		
//		double input2 = sc.nextDouble();
//		System.out.print(input2);
		
		System.out.print("입력1: ");
		String input3 = sc.next(); // 다음 입력된 '한 단어'를 읽어옴
		System.out.println(input3);
		
		System.out.print("입력2: ");
		String input4 = sc.nextLine();
		
		System.out.println(input4); 
		
		
		

	}
	
}
