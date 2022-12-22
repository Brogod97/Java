package com.hw3.model.vo;

import java.util.Objects;

public class Product {

	private String brand;
	private String name;
	private String color;
	private int price;
	
	public Product() {} // 기본 생성자
	
	// 4개의 초기값을 받는 생성자
	public Product(String brand, String name, String color, int price) {
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// Product 클래스의 모든 필드 값들을 합쳐서 문자열 String형으로 반환
	@Override
	public String toString() {
		return "brand=" + brand + ", name=" + name + ", color=" + color + ", price=" + price;
	}
	
	// 전달 받은 obj 객체의 필드 값과 비교할 대상인 현 Product 객체의 필드 값과 비교하여 
	// 모두 같으면 true, 하나라도 다르면 false 리턴
	
	@Override
	public boolean equals(Object obj) {
		Product compare = (Product)obj;
		
		if(this.brand == compare.brand && this.name == compare.name 
						&& this.color == compare.color && this.price == compare.price) {
			return true;
		}else {
			return false;
		}
	}
	
	// 소수를 이용하여 필드 값들의 hashCode 값을 합쳐서 리턴
	@Override
//	public int hashCode() {
//		int priceHash = Integer.valueOf(price).hashCode();
//		
//		return brand.hashCode() + name.hashCode() + color.hashCode() + priceHash;
//	}
	
	public int hashCode() {
		return Objects.hash(brand, color, name, price);
	}

	// this 주소값의 객체가 가진 필드 값을 복사한 새 객체를 생성하고 그 주소를 리턴
	// - 메소드 접근제한자는 public으로 변경
	// - 반환형은 Product로 변경
	// - 예외처리는 삭제
	@Override
	public Product clone() {
		return new Product(brand, name, color, price);
	}
	
}
