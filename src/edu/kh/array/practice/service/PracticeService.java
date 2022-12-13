package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1(){
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2(){
		int[] arr = new int[9];
		
		for(int i = arr.length; i > 0; i--) {
			arr[i - 1] = i;
			System.out.print(arr[i - 1] + " ");
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		
		int input;
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + ": ");
			input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.print("검색할 값: ");
		int search = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.println("인덱스: " + i);
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] strArray = new char[str.length()];

		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char search = sc.nextLine().charAt(0);
		
		int count = 0;
		
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == search) {
				count++;
			}
		}
		
		System.out.print(str + "에 " + search + "가 존재하는 위치(인덱스) : ");
		
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == search) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(search + " 개수 : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int value = sc.nextInt();
			arr[i] = value;
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr.clone()[i]);
		}
				
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		char[] arr = new char[id.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = id.charAt(i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i < 8) {
				System.out.print(arr[i]);
			}else {
				System.out.print("*");
			}
		}
	}

//	public void practice8(){
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수 : ");
//		int input = sc.nextInt();
//		
//		int[] arr = new int[input];
//		
//		if(input % 2 == 0 || input < 3) {
//			System.out.println("다시 입력하세요");
//		}else {
////		배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
////		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//			for(int i = 0; i < arr.length; i++) {
//				arr[i] = i + 1;
//				if(i > input / 2) {
//					arr[i] = ;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}
	
	public void practice9(){
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10  + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10(){
		int[] arr = new int[10];
		
		int max = 0;
		int min = 10;
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10  + 1);
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);

			arr[i] = random;

			for (int x = 0; x < i; x++) {
				if (random == arr[x]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random() * 45 + 1);

			lotto[i] = random;

			for (int x = 0; x < i; x++) {
				if (random == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

	public void practice13(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr)); // 확인
		
		System.out.print("문자열에 있는 문자 : ");
		
	}
}
