package edu.kh.objarray.practice.model.vo;

public class Employee {

	private int id;
	private String name;
	private String department;
	private String position;
	private int salary;
	
	public Employee() {}

	public Employee(int id, String name, String department, String position, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "사번: " + id + ", 이름 :" + name + ", 부서 : " + department + ", 직급 : " + position + ", 급여 : " + salary;
	}
	
	
}
