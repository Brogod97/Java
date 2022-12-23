package edu.kh.poly.model.vo;

public class Car /* extends Object */{
	/* 자동차라면 가지고 있는 것? */
	
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴 개수
	
	public Car() { // 기본 생성자
		super(); // 부모 생성자 (Object)
		// 미작성시 컴파일러가 자동 생성
	}

	// 매개변수 생성자
	// 자동완성 : alt + shift + s -> o
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	// getter / setter
	// 자동완성 : alt + shift + s -> r
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	// Object.toString() 오버라이딩
	@Override // 오버라이딩 했다는 걸 알려주는 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
		// 엔진 / 연료 / 바퀴 개수
	} 
	
	
}
