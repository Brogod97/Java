package com.hw4.model.vo;

public class Member {

	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	public Member() {}

	public Member(String userId, String userPwd, String name, int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public String information() {
		return "";
	}
}
