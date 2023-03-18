package edu.kh.abs.model.vo;

public abstract class Animal {
	// abstract가 붙는 순간, 객체화(인스턴스화)가 안되는 클래스!
	// 단, 타입으로서의 의미는 그대로!
	
	public abstract void eat();	// 추상 메서드
	// 먹기라는 메서드 있지만, 어떻게 동작할 지 정의하지 않아야 한다.
	// + 추상 메서드가 있다면, 클래스는 반드시 추상 클래스여야 함.
	
	public abstract void cry();
	public abstract void move();
}
