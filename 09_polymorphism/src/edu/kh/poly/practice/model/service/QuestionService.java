package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class QuestionService implements QuestionInterface {
	Scanner sc = new Scanner(System.in);
	
	Person[] pArr = new Person[10]; // 임의 지정 크기
	
	{
		pArr[0] = new Student("김철수", 15, 3, 2);
		pArr[1] = new Student("김영희", 20, 2, 5);
		pArr[2] = new Employee("주호민", 45, "수자앤펄");
		pArr[3] = new Employee("침착맨", 40, "침투부");
	}
	
	@Override
	public void displayMenu() {
		int inputMenu = 0;
		
		do {
			System.out.println("=========== Menu ===========");
			System.out.print("원하시는 메뉴를 선택해주세요."
					+ "\n1. 모든 요소 출력"
					+ "\n2. 학생 정보만 출력"
					+ "\n3. 직원 정보만 출력"
					+ "\n4. 정보 찾기(이름)"
					+ "\n5. 모든 사람의 이름 출력"
					+ "\n6. 모든 사람의 나이 (합/최고/최저) 출력"
					+ "\n7. 입력 인덱스 삭제"
					+ "\n8. 학생 or 직원등록"
					+ "\n0. 프로그램 종료"
					+ "\n명령 입력 >>> ");
			inputMenu = sc.nextInt();
			sc.nextLine();
			
			switch(inputMenu) {
			case 1 : selectAll(); break;
			case 2 : selectStudent(); break;
			case 3 : selectEmployee(); break;
			case 4 : System.out.println( searchName().toString() ); break;
			case 5 : System.out.println(printName()); break;
			case 6 : printAge(); break;
			case 7 : System.out.println(deletePerson().toString() + " 정보가 삭제되었습니다."); break;
			case 8 : insertPerson(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			}
		}while(inputMenu != 0);
	}
	
	@Override
	public void insertPerson() {
		System.out.println("======학생 or 직원등록======");
		
		System.out.print("어떤 타입을 생성하시겠습니까?"
					+ "\n1. 학생"
					+ "\n2. 직원"
					+ "\n명령 입력 >>> ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(inputNum != 1 && inputNum != 2) {
			System.out.println("잘못 입력하셨습니다.");
			displayMenu();
			return;
		}
		
		System.out.println("*****정보를 입력해주세요.*****");
		System.out.print("이름: ");
		String inputName = sc.nextLine();
		System.out.print("나이: ");
		int inputAge = sc.nextInt();
		sc.nextLine();
		
		if(inputNum == 1) {
			System.out.print("학년: ");
			int inputGrade = sc.nextInt();
			sc.nextLine();
			System.out.print("반: ");
			int inputClassRoom = sc.nextInt();
			
			for(int i = 0; i < pArr.length; i++) {
				if(pArr[i] == null) {
					pArr[i] = new Student(inputName, inputAge, inputGrade, inputClassRoom);
					break;
				}
			}
		}else if(inputNum == 2) {
			System.out.println("회사: ");
			String inputCompany = sc.nextLine();
			
			for(int i = 0; i < pArr.length; i++) {
				if(pArr[i] == null) {
					pArr[i] = new Employee(inputName, inputAge, inputCompany);
					break;
				}
			}
		}
	}
	
	@Override
	public void selectAll() {
		System.out.println("======모든 요소 출력======");
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[0] == null) { // pArr[0] 이 null이라는 건, 나머지 10개도 null이라는 것
				System.out.println("배열요소에 저장된 정보가 없습니다.");
				break;
			}
			
			if(pArr[i] == null) {
				break;
			}
			
			System.out.println(pArr[i].toString()); // Person - toString 임의로 오버라이딩
		}
	}
	
	@Override
	public void selectStudent() {
		System.out.println("======학생 정보만 출력======");
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Student) {
				System.out.println(pArr[i].toString());
			}
		}
	}
	
	@Override
	public void selectEmployee() {
		System.out.println("======직원 정보만 출력======");
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Employee) {
				System.out.println(pArr[i].toString());
			}
		}
	}
	
	@Override
	public Person searchName() {
		System.out.println("======정보 찾기(이름)======");
		
		System.out.print("검색할 이름을 입력해주세요 : ");
		String inputName = sc.nextLine();
		
		int index = 0;
		for(int i = 0; i < pArr.length; i++) {
			if( pArr[i].getName().equals(inputName) ) {
				break;
			}
			index++;
		}
		return pArr[index];
		
	}
	
	@Override
	public String printName() { // 미완성, 미해결
		System.out.println("======모든 사람의 이름 출력======");
		
		String str = ""; // 초기화
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] != null) {
				str += pArr[i].getName() + ", "; // 마지막 콤마 어떻게 출력 안하지?
			}
		}
		
		return str;
	}
	@Override
	public void printAge() {
		System.out.println("======모든 사람의 나이 (합/최고/최저) 출력======");
		
		int ageSum = 0;
		int maxNum = 0; // 기준
		int minNum = 100; // 기준
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] != null) {
				ageSum += pArr[i].getAge();
				
				if(maxNum < pArr[i].getAge()) {
					maxNum = pArr[i].getAge();
				}
				
				if(minNum > pArr[i].getAge()) {
					minNum = pArr[i].getAge();
				}
			}
		}
		
		System.out.println("모든 사람의 나이 합 : " + ageSum);
		System.out.println("최고 연령 : " + maxNum);
		System.out.println("최저 연령 : " + minNum);
	}
	
	@Override
	public Person deletePerson() { // 미완성, 미해결
		System.out.println("======입력 인덱스 삭제======");
		
		System.out.print("삭제할 인덱스를 입력해주세요 : ");
		int index = sc.nextInt();
		
		Person[] newArr = new Person[pArr.length];
		Person deletedPerson = null;
		
		// 반복이 index번째의 배열일 경우 빼고, 그 외에는 새로운 배열에 저장
		for(int i = 0; i < pArr.length; i++) {
			// i가 0일 때
			// pArr[0]을 삭제하고, 그 뒤부터 newArr[0]부터 저장
			if(index == 0) {
				deletedPerson = pArr[i];
				i--;
			}else {
				newArr[i] = pArr[i];
			}
			
			// i가 0 이상일 때
			// newArr[0]부터 저장하는데, index 번째가 오면 스킵하고, i--
			if(index >= 1) {
				if(i == index) {
					deletedPerson = pArr[i];
					continue;
				}
				
				newArr[i] = pArr[i];
			}
		}
		
		pArr = newArr;
		
		// 삭제한 인덱스의 배열 요소 반환
		return deletedPerson; 
	}
	@Override
	public void addPerson() {
		Person[] newArr = new Person[pArr.length + 1];
				
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] != null) {
				newArr[i] = pArr[i];
			}else {
				newArr[i] = null;
			}
		}
		
		pArr = newArr;
		System.out.println("현재 배열의 크기 : " + pArr.length);
	}
}
