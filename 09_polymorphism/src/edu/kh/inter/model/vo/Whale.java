package edu.kh.inter.model.vo;

public class Whale extends TypeMammalia implements WaterLife {

	@Override
	public void breastfeed() {
		System.out.println("고래가 수유를 한다?");
	}

	@Override
	public void eat() {
		System.out.println("고래가 물고기를 잡아 먹는다.");
	}

	@Override
	public void cry() {
		System.out.println("고래가 포효한다.");
	}

	@Override
	public void move() {
		System.out.println("고래가 움직인다.");
	}

	@Override
	public void water() {
		System.out.println("고래는 바다에서 몸체가 아주 큰 편에 속합니다.");
	}

}
