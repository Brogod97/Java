package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro;
	
	Scanner sc = new Scanner(System.in);
	public static int count = 0;
	
	{
		pro = new Product[10]; 
	}
	
	public void mainMenu() {
		int inputNum = 0;
		do {
			System.out.println("\n********프로그램 실행********");
			
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("명령 입력 >>> ");
			inputNum = sc.nextInt();
			
			switch(inputNum) {
			case 1 : productInput(); break; 
			case 2 : productPrint(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}while(inputNum != 0);
	}
	
	public void productInput() {
		System.out.println("********제품 정보 추가********");
		
//		// 배열에 남은 공간이 없을 경우
//		if(pro[9] != null) {
//			System.out.println("제품 정보 저장 실패 (저장 공간 부족)");
//			return;
//		}
		
		// 객체에 넣을 값 입력받기
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		// pro 배열을 순회하며 비어있는 곳에 입력받은 정보를 통해 새 제품 저장
		for(int i = 0; i < pro.length; i++) {
			// pro의 i번째가 null이다 == pro[i]가 비어있다
			// 입력받은 값들을 이용해 새 객체를 생성하고 객체 배열에 저장
			if(pro[count] == null) {
				pro[count] = new Product(pId, pName, price, tax);
				
				break;
			}
		}
		System.out.println("제품 정보 저장 성공");
	}
	
	public void productPrint() {
		System.out.println("\n********제품 전체 조회********");
		// pro[i]에 저장된 객체가 있을 경우 해당 객체의 정보 조회
		// 반복, 조건
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] != null) { // == 비어있지 않다
				System.out.println("\n도서 정보 " + (i+1));
				
				System.out.println(pro[i].information());
			}
		}
	}
}
