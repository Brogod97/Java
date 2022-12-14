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

	public void practice8(){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input % 2 == 0 || input < 3) {
				System.out.println("다시 입력하세요");
			}else {
				int[] arr = new int[input];
				
				int num = 0;
				
				for(int i = 0; i < arr.length; i++) {
					if(i <= arr.length / 2) {
						arr[i] = ++num;
					}else {
						arr[i] = --num;
					}
					
					if((i+1) == arr.length) {
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
			}
			break;
		}
	}
	
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
		
		char[] chArr = new char[input.length()];
		
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = input.charAt(i);
		}
		
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < chArr.length; i++) {
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(i == 0) {
					System.out.print(chArr[i]);
				}else {
					System.out.print(", " + chArr[i]);
				}
			}
		}
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);

			if (ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();

				String[] newArr = new String[arr.length + addSize];

				for (int i = 0; i < newArr.length; i++) {
					if (i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
			} else if (ch == 'n' || ch == 'N') {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
