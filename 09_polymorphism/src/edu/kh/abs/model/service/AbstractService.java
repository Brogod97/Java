package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {
	public void ex1() {
		// 포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		// 조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		// 어류
		Shark shark = new Shark();
		
		/*
		dog.eat();
		dog.cry();
		dog.move();
		
		cat.eat();
		cat.cry();
		cat.move();
		*/
		
		// Animal animal = new Animal();
		// 추상 클래스는 인스턴스화 불가능, 타입으로서의 역할은 수행함
		
		TypeMammalia[] mammalia = new TypeMammalia[] { cat, dog, whale };
		TypeBirds[] birds = new TypeBirds[] { chicken, eagle, penguin };
		TypePisces[] pisces = new TypePisces[] { shark };
		
		Animal[] animal = new Animal[] { cat, dog, whale, chicken, eagle, penguin, shark };
	
		for(int i  = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			// 만약 animal 중에 타입이 고양이 일 때
			// 수유를 한다는 ! breastfeed() 출력;
			if(animal[i] instanceof Cat) {
				System.out.println("======고양이는======");
				((Cat)animal[i]).breastfeed();
				// 고양이가 소속되어있는 포유류만 가지고 있던 수유를 하다 메서드
				// Cat 클래스에서 오버라이딩으로 재정의 된 내용이 출력됨
				System.out.println("======이렇습니다.======");
			}else if(animal[i] instanceof Eagle) {
				System.out.println("======독수리는======");
				Eagle eg = (Eagle)animal[i];
				eg.fly(); // TypeBirds에서 일반 메서드로 정의한 내용
				System.out.println("======이렇습니다.======");
			}else if(animal[i] instanceof Shark) {
				System.out.println("======상어는======");
				Shark sk = (Shark)animal[i];
				sk.swimming();
				System.out.println("======이렇습니다.======");
			}
		}
	}
}
