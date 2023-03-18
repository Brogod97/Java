package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		// System.out.println(): 한 줄 출력(출력 후 줄바꿈 수행 == 개행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		// System.out.print(): 단순 출력 (출력 후 줄바꿈 X)
		System.out.print("테스트3");
		System.out.print("테스트4");
		System.out.println(); // 단순 개행
		
		// System.out.printf(): 출력될 문자열 형식을 패턴으로 지정하는 출력 구문
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15 로 출력할 경우
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		// 길고 오타 가능성 높음
		
		// System.out.println("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2 );
		System.out.println("안녕");
		// printf도 print와 같이 개행이 되지 않기 때문에
		// \n과 같은 개행문자(escape)를 사용하여 다음줄로 개행 가능
		
		
		int iNum3 = 2;
		System.out.printf("%d + %d * %d / %d = %d\n",iNum1, iNum1, iNum2, iNum3, iNum1 + iNum1 * iNum2 / iNum3 );
		
		int iNum4 = 3;
		System.out.printf("%5d\n", iNum4);
		System.out.printf("%-5d\n", iNum4);
		
		// 소수점 자리 제어
		System.out.printf("%f\n", 2.5); // 2.500000
		System.out.printf("%.2f\n", 2.5); // 2.500 (소수점 둘째자리 까지만 표시)
		System.out.printf("%.0f\n", 2.5); // 소수점 아래 표시 X
		
		System.out.println("\\");
		System.out.println("a\tb\tc\td\t");
		
		System.out.println("'");
		System.out.println("\'");
		
		System.out.println("\"");
		
		// 유니코드 이스케이프
		// 65 == 'A'
		System.out.println("\u0041");
	
	}
	
}
