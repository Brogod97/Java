package edu.kh.io.practice.model.vo;

import java.text.DecimalFormat;

public class Book {
	// 필드
	// 도서 제목, 작가, 금액, 출판사
	
	// 도서등록번호 -> static으로 공통관리
	public static int ID = 0;
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	private int registerNumber;
	private boolean isFavorite;
	
	// 생성자
	public Book() {
		this.isFavorite = false;
	};
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.isFavorite = false;
	}
	
	public Book(String title, String author, int price, String publisher, int registerNumber) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.registerNumber = registerNumber;
		this.isFavorite = false;
	}

	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	public boolean isFavorite() {
		return isFavorite;
	}

	public void setFavorite(boolean isFavorite) {
		this.isFavorite = isFavorite;
	}

	// 가격 천단위 콤마 출력
	public String comma(int price) {
		DecimalFormat df = new DecimalFormat("###,###");
		String value_str = df.format(price);
		return value_str;
	}
	
	// toString 오버라이딩 -> 띄어쓰기 개행
		@Override
	public String toString() {
		return title + "  " + author + "  " + comma(price) + "원  " + publisher;
	}
}
