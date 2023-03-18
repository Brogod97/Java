package edu.kh.poly.practice.model.vo;

public class Person {
	// Person의 공통된 것들 (Student, Employee)
	protected String name;
	protected int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " / " + age;
	}
	
}
