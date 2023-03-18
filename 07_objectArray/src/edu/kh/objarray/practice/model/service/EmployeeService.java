package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {

	private Employee[] employees = new Employee[3]; // 사원 정보를 저장할 Employee 배열
	private Scanner sc = new Scanner(System.in); 
	
	public void displayMenu() {
		while(true) {
			try {
				
				int sel = 0;
				do {
					System.out.println("=== 직원 관리 프로그램 ===");
					System.out.println("1. 직원 정보 입력(3명)");
					System.out.println("2. 모든 직원 정보 출력");
					System.out.println("3. 특정 직원 정보 출력(이름 검색)");
					System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
					System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
					System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
					System.out.println("0. 종료");
					System.out.print("메뉴 선택 >> ");
					sel = sc.nextInt();
					sc.nextLine();
					
					switch (sel) {
					case 1: initEmployee(); break;
					case 2: System.out.println(allEmployeesInformation()); break;
					case 3: System.out.println(searchEmployee()); break;
					case 4: System.out.println(salaryCheck()); break;
					case 5: System.out.printf("=== 모든 사원 급여 합/연봉 합 ===\n"
											+ "전 직원 급여 합 : %d\n"
											+ "전 직원 연봉 합 : %d\n"
											,allSalaryCheck(), allSalaryCheck() * 12); 
							break;
					case 6: topSalaryEmployee(); break;
					case 0: System.out.println("프로그램 종료."); break;

					default: System.out.println("잘못 입력하셨습니다.");
					}
				}while(sel != 0);
				
				break;
				
			}catch(Exception e) {
				System.out.println("오류가 발생하여 프로그램을 재시작합니다.");
			}
		}
	}
	
	// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
	public void initEmployee() throws Exception{
		// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
		for(int i = 0; i < employees.length; i++) {
			System.out.println("===" + (i+1)+ "번째 사원 정보 입력 ===");
			
			System.out.print("사번 : ");
			int inputId = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			
			System.out.print("부서 : ");
			String inputDepartment = sc.nextLine();
			
			System.out.print("직급 : ");
			String inputPosition = sc.nextLine();
			
			System.out.print("급여 : ");
			int inputSalary = sc.nextInt();
			sc.nextLine();
			
			employees[i] = new Employee(inputId, inputName, inputDepartment, inputPosition, inputSalary);
		}
	}
	
	
	// 모든 직원 정보를 하나의 문자열로 반환
	public String allEmployeesInformation() throws Exception {
		String str = "";
		
		for(Employee i : employees) {
			str += "\n" + i.toString();
		}
		return str;
	}
	
	// 특정 사원 정보 반환 메소드(이름 검색)
	// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
	public String searchEmployee() throws Exception {
		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		
		System.out.print("이름 입력 : ");
		String input = sc.nextLine();
		
		for(Employee i : employees) {
			if(i.getName().equals(input)) {
				return i.toString();
			}
		}
		return "일치하는 이름의 사원이 없습니다.";
	}
	
	// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
	// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
	public String salaryCheck() throws Exception {
		System.out.println("=== 급여/연봉 조회 ===");
		
		System.out.print("사번 입력 : ");
		int input = sc.nextInt();
		
		for(Employee i : employees) {
			if(i.getId() == input) {
				int salary = i.getSalary();
				int annualSalary = i.getSalary() * 12;
				return "급여 : " + salary + " / " + "연봉 : " + annualSalary;
			}
		}
		return "사번이 일치하는 직원 없습니다.";
	}
	
	
	// 모든 사원 급여 합 반환
	public int allSalaryCheck() throws Exception {
		
		int sum = 0;
		for(Employee i : employees) {
			sum += i.getSalary();
		}
		
		return sum;
	}
	
	// 모든 직원중 급여가 가장 높은 직원 출력
	// (동일한 급여인 경우 사번이 낮은 사람이 출력)
	public void topSalaryEmployee() throws Exception {
	
		int compareSalary = employees[0].getSalary();
		int compareId = employees[0].getId();
		int index = 0;
		boolean isSame = true;
		
		for(int i = 0; i < employees.length; i++) { // 인덱스 0의 급여 값과 이후 인덱스의 급여 값 비교
			if(compareSalary < employees[i].getSalary()) {
				compareSalary = employees[i].getSalary(); // 더 큰 금액이 있다면 갱신
				index = i;
				isSame = false; // 더 큰 금액이 있다면 == 값이 다르다면, false
			}
		}
		
		// 가장 큰 급여를 못찾은 경우, 여전히 isSame은 true 이므로, 무조건 실행
		if(isSame == true) {
			for(int i = 0; i < employees.length; i++) {
				if(compareId > employees[i].getId()) {
					index = i;
				}
			}	
		}
		
		// 위를 통과하면서 나온 값이 결국 출력해야 할 대상 
		System.out.println(employees[index].toString());
		
		}
		
	}
	