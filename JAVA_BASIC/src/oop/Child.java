package oop;

// extends : 클래스 상속
// Java는 다중상속 X
public class Child extends Parent {
	String name = "자식";
	String nick = "김씨";
	
	// @ : 어노테이션
	// @Override : 부모클래스의 함수를 오버라이딩(함수를 재정의) 했다.
	@Override
	public void printName() {
		System.out.println("나는 자식이야 : " + name);
	}
	
	public void printNick() {
		System.out.println(nick);
	}

}