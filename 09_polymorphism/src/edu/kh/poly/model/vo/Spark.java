package edu.kh.poly.model.vo;

public class Spark extends Car {

	private double discountOffer; // 할인 혜택

	// 기본 생성자
	public Spark() {} // super 생략 시 컴파일러가 자동 추가

	// 매개변수 생성자
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
}
