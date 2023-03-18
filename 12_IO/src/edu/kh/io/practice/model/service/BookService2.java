package edu.kh.io.practice.model.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BookService2 {
	Scanner sc = new Scanner(System.in);
	
	public static int ID = 0;
	
	// Map형태를 받는 List
	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	List<Map<String, Object>> favList = new ArrayList<Map<String, Object>>();
	
	// 메뉴
	public void displayMenu() {
		System.out.println("======= 도서 목록 프로그램 =======");
		
		int input = 0;
		try {
			
			do {
				System.out.println("****** 메뉴를 선택해주세요 ******");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 즐겨찾기 내보내기");
				System.out.println("0. 프로그램 종료");
				System.out.print("명령 입력 >>> ");
				input = sc.nextInt();
				sc.nextLine();
				
				switch(input) {
				case 1 : System.out.println(createBook());; break;
				case 2 : selectBook(); break;
				case 3 : updateBook(); break;
				case 4 : System.out.println(deleteBook()); break;
				case 5 : System.out.println(createFavorite()); break;
				case 6 : System.out.println(deleteFavorite()); break;
				case 7 : selectFavorite(); break;
				case 8 : exportFavorite(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); break;
				}
			} while (input != 0);
			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			e.printStackTrace();
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("범위를 잘못 입력하셨습니다.");
			e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println("에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	// 도서 등록
	public String createBook() throws InputMismatchException {
		System.out.println("****** 도서 등록 ******");
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();

		Map<String, Object> map = new HashMap<String, Object>();
		
		// 등록 번호는 static으로 자동으로 1씩 증가해서 대입
		int registerNumber = BookService2.ID++;
		
		map.put("registerNumber", registerNumber);
		map.put("title", title);
		map.put("author", author);
		map.put("price", price);
		map.put("publisher", publisher);
		
		if(list.add(map)) {
			return "도서 등록 성공!";
		}else {
			return "도서 등록 실패";
		}
	}
	
	// 금액 1,000 단위 콤마 추가
	public String comma(int price) {
		DecimalFormat df = new DecimalFormat("###,###");
		String value_str = df.format(price);
		return value_str;
	}
	
	// 도서 조회
	public void selectBook() {
		System.out.println("****** 도서 조회 ******");
		
		if(list.isEmpty()) { // 비었으면 true
			System.out.println("도서 목록이 존재하지 않습니다");
			return;
		}
		
		for(Map<String, Object> map : list) {
			System.out.println(map.get("title") + " " + map.get("author") + " " + comma((int)map.get("price")) + "원 " + map.get("publisher"));
		} 
		
	}
	
	// 도서 수정
	public void updateBook() throws InputMismatchException {
		System.out.println("****** 도서 수정 ******");
		
		int index = 0;
		for(Map<String, Object> map : list) {
			System.out.println((index++)+ " - " + map.get("title") + " " + map.get("author") + " " + map.get("price") + " " + map.get("publisher"));
		}
		
		System.out.println("\n수정할 도서의 인덱스 번호를 입력해주세요 : ");
		index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n====== 수정할 정보 입력 ======");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("title", title);
		map.put("author", author);
		map.put("price", price);
		map.put("publisher", publisher);
		
		list.set(index, map);
	}
	
	// 도서 삭제
	public String deleteBook() throws InputMismatchException, IndexOutOfBoundsException {
		System.out.println("****** 도서 삭제 ******");
		
		int index = 0;
		for(Map<String, Object> map : list) {
			System.out.println((index++)+ " - " + map.get("title") + " " + map.get("author") + " " + map.get("price") + " " + map.get("publisher"));
		}
		
		System.out.println("\n삭제할 도서의 인덱스 번호를 입력해주세요 : ");
		index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n정말 삭제하시겠습니까? (Y/N) : ");
		char confirm = sc.nextLine().toUpperCase().charAt(0);
		
		if(confirm == 'Y') {
			list.remove(index);
			return "삭제 완료";
		}else {
			return "삭제 실패";
		}
		
	}
	
	// 즐겨찾기 추가
	public String createFavorite() {
		System.out.println("****** 즐겨찾기 추가 ******");
		
		if(list.isEmpty()) {
			return "도서 목록이 존재하지 않습니다";
		}
		
		int index = 0;
		for(Map<String, Object> map : list) {
			System.out.println((index++)+ " - " + map.get("title") + " " + map.get("author") + " " + map.get("price") + " " + map.get("publisher"));
		}
		
		System.out.println("\n즐겨찾기에 추가 할 도서의 인덱스 번호를 입력해주세요 : ");
		index = sc.nextInt();
		
		// 중복 체크
		for(Map<String, Object> map : favList) {
			if(index == (int)map.get("registerNumber")) {
				return "이미 즐겨찾기에 저장 되어 있습니다";
			}
		}
		
		if(favList.add(list.get(index))) {
			favList.sort(Comparator.comparing((Map<String, Object> map) -> (Integer) map.get("registerNumber")));
			return "즐겨찾기 저장 성공";
		}else {
			return "즐겨찾기 저장 실패";
		}
	}
	
	// 즐겨찾기 삭제
	public String deleteFavorite() {
		System.out.println("****** 즐겨찾기 삭제 ******");
		
		if(favList.isEmpty()) {
			return "즐겨찾기가 존재하지 않습니다";
		}
		
		int index = 0;
		for(Map<String, Object> map : favList) {
			System.out.println((index++)+ " - " + map.get("title") + " " + map.get("author") + " " + map.get("price") + " " + map.get("publisher"));
		}
		
		System.out.println("\n즐겨찾기에 삭제 할 도서의 인덱스 번호를 입력해주세요 : ");
		index = sc.nextInt();
		sc.nextLine();
		
		favList.remove(index);
		return "즐겨찾기 삭제 성공";
	}

	// 즐겨찾기 조회
	public void selectFavorite() {
		System.out.println("****** 즐겨찾기 조회 ******");
		
		if(favList.isEmpty()) {
			System.out.println("즐겨찾기가 존재하지 않습니다");
		}
		
		int index = 0;
		for(Map<String, Object> map : favList) {
			System.out.println((index++)+ " - " + map.get("title") + " " + map.get("author") + " " + map.get("price") + " " + map.get("publisher"));
		}
	}
	
	// 즐겨찾기 내보내기
	public void exportFavorite() {
		System.out.println("===== 즐겨찾기 목록 =====");
		
		String filePath = "favoriteList.txt";
		BufferedWriter writer = null;
		
		try {
			File file = new File(filePath);
			
			if(!file.exists()) { // File 객체 생성
				file.createNewFile(); // 신규 생성
			}
			
			writer = new BufferedWriter(new FileWriter(file));
			
			String str = "";
			
			for(Map<String, Object> favList : favList) {
				str += favList.get("registerNumber")+ " " + favList.get("title") + " " + favList.get("author") + "\n";
			}
			
			writer.write(str);
			
			System.out.println("내보내기 성공");
			
		} catch (IOException e) {
			System.out.println("내보내기 실패");
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
