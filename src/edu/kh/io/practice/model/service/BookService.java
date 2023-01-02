package edu.kh.io.practice.model.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.io.practice.model.vo.Book;

public class BookService {
	private Scanner sc = new Scanner(System.in);
	private List<Book> bookList = new ArrayList<Book>();
	
	// 메뉴
	public void displayMenu() { // 예외처리
		int input = 0;
		
		try {
			
			do{
				System.out.println("======= 도서 목록 프로그램 =======");
				System.out.println("메뉴를 선택해주세요");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 조회");
				System.out.println("7. 즐겨찾기 삭제");
				System.out.println("8. 즐겨찾기 내보내기");
				System.out.println("0. 종료");
				System.out.println("메뉴 선택 >>> ");
				input = sc.nextInt();
				sc.nextLine();
				
				switch(input){
				case 1 : System.out.println(createBook()); break;
				case 2 : selectBook(); break;
				case 3 : updateBook(); break;
				case 4 : deleteBook(); break;
				case 5 : addFavorite(); break;
				case 6 : selectFavorite(); break;
				case 7 : deleteFavorite(); break;
				case 8 : exportFile(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); break;
				default : System.out.println("번호를 다시 입력해주세요"); 
				}
			}while(input != 0);
			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.\n프로그램을 종료합니다.");
		}
	}

	// 등록
	// 등록 성공시 성공
	public String createBook() { 
		try {
			System.out.print("도서명을 입력해주세요 : ");
			String title = sc.nextLine();
			
			System.out.print("작가명을 입력해주세요 : ");
			String author = sc.nextLine();
			
			System.out.print("가격을 입력해주세요 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사를 입력해주세요 : ");
			String publisher = sc.nextLine();
			
			int registerNumber = Book.ID++;
			
			bookList.add(new Book(title, author, price, publisher, registerNumber));
			
			return "도서 등록 성공";
			
		}catch (InputMismatchException e) {
			return "잘못 입력하셨습니다.";
		}
	}
	
	// 조회
	
	public void selectBook() {
		System.out.println("======도서 목록 조회======");
		
		if(bookList.isEmpty()) {
			System.out.println("등록된 도서 목록이 없습니다.");
			return;
		}
		
		for (Book book : bookList) {
			System.out.println(book.toString());
		}

	}
	
	// 수정
	public void updateBook() {
		
		try {
			System.out.println("======도서 목록 수정======");
			
			// 등록된 도서 목록이 있는지 체크
			if(bookList.isEmpty()) {
				System.out.println("등록된 도서 목록이 없습니다.");
			}
			
			for(Book book : bookList) {
				System.out.println(book.getRegisterNumber() + " : " + book.toString());
			}
			System.out.println("수정할 도서의 등록번호를 선택해주세요: ");
			System.out.print("명령 입력 >>> ");
			int input = sc.nextInt();
			sc.nextLine();
			
			// 배열 범위를 넘어가는지 체크
			if(input > bookList.size()) {
				System.out.println("선택 범위를 초과하셨습니다.");
			}else {
				System.out.println(input + "번 도서 정보");
				System.out.println(bookList.get(input));
				
				System.out.println("======수정할 내용을 입력해주세요======");
				
				System.out.print("도서명 : ");
				String title = sc.nextLine();
				
				System.out.print("작가 : ");
				String author = sc.nextLine();
				
				System.out.print("가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				
				System.out.print("출판사 : ");
				String publisher = sc.nextLine();
				
				// 등록 번호와 입력 번호가 일치하는 차례에 해당 인덱스에 있는 값을 받아온 값으로 수정
				Book temp = null;
				for (int i = 0; i < bookList.size(); i++) {
					if (bookList.get(i).getRegisterNumber() == input) {
						temp = bookList.set(i, new Book(title, author, price, publisher));
					}
				}
				System.out.println(temp.toString() + " 수정 완료");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			e.printStackTrace();
		}
		
	}
	
	// 삭제
	public void deleteBook() {
		try {
			System.out.println("======도서 목록 삭제======");
			
			// 도서 목록이 없을 경우
			if(bookList.isEmpty()) {
				System.out.println("등록된 도서 목록이 없습니다.");
				return ;
			}
			
			// 도서 목록이 있을 경우
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(i + " : " + bookList.get(i).toString());
			}
			System.out.println("삭제할 도서의 인덱스 번호를 선택해주세요: ");
			int input = sc.nextInt();
			sc.nextLine();
			
			// 인덱스와 일치할 경우 삭제
			System.out.println("정말 삭제 하시겠습니까? (Y/N)");
			char check = sc.next().toUpperCase().charAt(0);
			
			if(check == 'Y') {
				for(int i = 0; i < bookList.size(); i++) {
					Book temp = bookList.remove(i);
					System.out.println(temp + " 삭제 완료");
				}
			}

		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("인덱스 번호를 잘못 입력하셨습니다.");
			e.printStackTrace();
		}
	}
	
	// 파일 생성, FileWriter
	// 즐겨찾기 추가
	public void addFavorite() {
		try {
			System.out.println("======즐겨 찾기 추가======");
			
			// 도서 목록이 없을 경우
			if(bookList.isEmpty()) {
				System.out.println("등록된 도서 목록이 없습니다.");
			}
			
			// 도서 목록이 있을 경우
			int index = 0;
			for(Book book : bookList) {
				System.out.println((index++) + " : " + book.toString());
			}
			System.out.println("\n즐겨찾기 할 도서의 인덱스를 선택해주세요: ");
			int input = sc.nextInt();
			sc.nextLine();
		
			// input에 해당하는 등록번호의 값 가져와 hashSet에 저장
			// Collect.sort
			for(Book book : bookList) {
				if(book.getRegisterNumber() == input) {
					book.setFavorite(true);
					System.out.println("즐겨찾기 추가 완료");
					return;
				}
			}
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("잘못 입력하셨습니다.");
			e.printStackTrace();
		}
	}
	
	// 즐겨찾기 조회
	public void selectFavorite() {
		// 도서 목록이 없을 경우
		if(bookList.isEmpty()) {
			System.out.println("등록된 도서 목록이 없습니다.");
			return;
		}
		
		for (Book book : bookList) {
			while (book.isFavorite() == true) {
				System.out.println(book.toString());
				break;
			}
		}
	}
	
	// 즐겨찾기 삭제
	public String deleteFavorite() {
		
		System.out.println("======즐겨 찾기 삭제======");
		
		// 도서 목록이 없을 경우
		if(bookList.isEmpty()) {
			return "등록된 도서 목록이 없습니다.";
		}
		
		// 도서 목록이 있을 경우
		int index = 0;
		for(Book book : bookList) {
			if(book.isFavorite() == true) {
				System.out.println((index++) + " : " + book.toString());
			}
		}
		System.out.println("\n즐겨찾기에서 삭제 할 도서의 인덱스를 선택해주세요: ");
		int input = sc.nextInt();
		sc.nextLine();

		System.out.println("정말 삭제 하시겠습니까? (Y/N): ");
		char check = sc.next().toUpperCase().charAt(0);
		
		for(Book book : bookList) {
			if(check == 'Y') {
				if(book.getRegisterNumber() == input) {
					book.setFavorite(false);
				}
			}
		}
		
		return "즐겨찾기 삭제 완료";
		
	}
	
	// 즐겨찾기 추출
	// 즐겨찾기 된 파일들만 추출
	public void exportFile() {
		// 도서 목록이 없을 경우
		
		String filePath = "favoriteList.txt";
		BufferedWriter writer = null;
		
		try {
			
			File file = new File(filePath);
			
			if(!file.exists()) { // File 객체 생성
				file.createNewFile(); // 신규 생성
			}
			
			writer = new BufferedWriter(new FileWriter(file));
			
			if(bookList.isEmpty()) {
				System.out.println("등록된 도서 목록이 없습니다.");
			}
			
			String str = "";
			for(Book book : bookList) {
				if(book.isFavorite() == true) {
					str += book.getRegisterNumber() + " " + book.getTitle() + " " 
							+ book.getAuthor() + "\n";
				}
			}
			
			writer.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("내보내기 성공");
	}
	
}
