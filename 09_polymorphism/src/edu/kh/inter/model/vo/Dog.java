package edu.kh.inter.model.vo;

public class Dog extends TypeMammalia {
	
	@Override
	public void breastfeed() {
		System.out.println("강아지가 수유를 한다.");
	}
	
	@Override
	public void eat() {
		System.out.println("강아지가 밥을 먹는다.");
	}
	
	@Override
	public void cry() {
		System.out.println("강아지가 짖는다.");
	}
	
	@Override
	public void move() {
		System.out.println("강아지가 움직인다.");
	}

	
}
