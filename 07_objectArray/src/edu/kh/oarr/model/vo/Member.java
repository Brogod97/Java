package edu.kh.oarr.model.vo;

public class Member {
	// 필드(== 멤버 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	// 생성자
	// 생성자 규칙
	// 1. 클래스명과 일치 할 것
	// 2. 반환형이 없음
	public Member() {}
	
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	// 메소드
	// getter / setter
	// alt + shift + s + r => select all => Generate
	
	/* 다 접근 가능하도록 public
	 * String 자료형으로 돌려보내겠다.
	 * 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 memberId라고만 써도 ok
	 * */
	public String getMemberId() {
		return memberId;
	}
	
	
	/* setter는 말 그대로 세팅하는 것
	 * 무엇을 세팅할 지 전달받아올 무언가가 필요함 ==> 매개변수
	 * setter는 '보통' 반환 값은 없음 => void
	 * */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가는
		// return 구문이 작성되어야 함
		// 단 void일 경우 생략 가능함
		// -> 생략 시 컴파일러가 자동 추가 => return;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
