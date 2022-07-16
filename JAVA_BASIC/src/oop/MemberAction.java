package oop;

// 클래스, 함수, 변수
// 클래스 = 설계도면
// 클래스 정의 => 설계도면 작성
// (클래스)객체 생성 => 설계도면 건물 짓는다

// 클래스(설계도면)
// - 변수(전역)
// - 함수
// - 생성자함수

// 클래스에 생성자 함수를 정의하지 않으면 JAVA가 자동으로 만들어 줌
public class MemberAction {
	int age;
	String id;
	String pw;
	String name;
	
	// 생성자 함수
	// - 객체 생성 시 값을 초기화
	public MemberAction() {
		
	}
	
	public void memberInsert() { //회원 가입
		int age = 5;
	}
	
	public void memberSearch() { //회원 검색
		
	}
	
	public void memberDelete() { //회원 탈퇴
		
	}

}
