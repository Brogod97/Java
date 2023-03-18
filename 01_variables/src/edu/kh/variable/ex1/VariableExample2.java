package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		// 메모리에 논리 값 (T, F)을 저장할 공간 1byte를 할당하고
		// 할당된 공간은 booleanData라는 이름으로 부르겠다는 뜻
		boolean booleanData;
		
		// = : 대입 연산자 => 우항의 값을 좌항에 대입
		booleanData = true;
		
		System.out.println("booleanData = " + booleanData);
		
		// 자료형은 byte 변수명 byteNumber, 값 127 대입 
		byte byteNumber = 127;
		/* 
		 * 메모리에 정수값을 할당할 공간 1byte를 할당하고
		 * 할당된 공간을 byteNumber라고 부르겠다.
		 * 선언된 byteNumber 변수에 처음으로 127을 넣음.
		 * --> 초기화 : 처음 변수에 값을 대입
		*/
		
		System.out.println(byteNumber);
		
		short shortNumber = 32767; // 변수 선언 및 초기화
		
		// 정수 자료형의 기본 형 (short, byte는 옛날 코드의 잔재임)
		int intNumber = 2147483647; // 변수 선언 및 초기화
		
		long longNumber = 1234567891238956L; // 변수 선언 및 초기화
		
		
		// 실수형
		float floatNumber = 1.2345F; // long과 마찬가지로 F, f 가능
		
		double doubleNumber = 3.141592; // D를 쓸 순 있는데, 기본형이라 생략
		
		// 문자형 리터럴 표기법: ' '(홑따옴표) -> 문자 하나만 나타낼 때 사용
		char ch = 'A'; // 65
		char ch2 = 66; // B
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 * 컴퓨터에는 문자표가 존재하고 있는데
		 * 숫자에 따라 지정된 문자 모양이 매핑되어있음
		 * 'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장됨
		 * 반대로 생각해보면, 변수에 애초에 66이란 숫자를 저장하는 것이 가능함
		 * */
		System.out.println("ch: " + ch);
		System.out.println("ch2: " + ch2);
		
		// 변수 명명 규칙
		// 1. 대소문자 구분 하고, 길이 제한 없다
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa; // 길이제한 없음
		int Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa; // 대소문자 구문, 위 변수와 다른 변수
		
		// 2. 예약어 사용 불가능
		//float double; 
		
		// 3. 숫자로 시작하면 안된다.
		// int 1abc = 4; // 불가능
		int abc1 = 4; // 가능
		
		// 4. 특수문자는 _ , $ 만 사용 가능하다 (하지만 사용하지 않는 것 권장)
		int $intNumber; // 문제는 없지만 일반적으로 개발자가 이렇게 사용하지 않음
		int int_number; // 동일한 이유, 카멜 표기법으로 표현하여 _ 미사용
						// _는 DB에서 사용
		
		// 5. 카멜표기법
		// -> 변수명 작성시 여러 단어를 이어서 작성하는 경우
		// 띄어쓰지 않고 후속 단어의 첫 글자를 대문자로 작성
		char appleBananaCarrot;
		
		// 6. 변수명은 언어를 가리지 않는다 (하지만 사용하지 않음)
		int 정수;
		
		// -------------------------------------
		
		int number = 10;
		System.out.println("number: " + number);
		number = 20;
		System.out.println("number: " + number);
		
		/* 상수(항상 같은 수)
		 * 변수의 한 종류
		 * 한번 값이 대입되면 다른 값 불가능
		 * 자료형 앞에 final 키워드 작성 (마지막 대입되는 값이라는 뜻)
		 * 
		 * 상수 명명 규칙: 모두 대문자로 표기(컨벤션), 여러 단어 작성시 "_" 사용
		 * 
		 * 상수를 사용하는 경우
		 * 1) 변하면 안되는, 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여할 때
		 * 
		 * */
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.3; // 에러! 대입불가
	}
}
