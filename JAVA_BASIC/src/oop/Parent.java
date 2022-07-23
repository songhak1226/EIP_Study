package oop;

// 상속(extends)
// class단위 : 부모 클래스로부터 자식이 상속
//			  상속받은 자식 클래스는 부모클래스의 기능을 사용(자신한테 없어도)
//			  기능 : 변수, 함수

// 클래스 : 속성 + 행위
// Parent parent = new Parent(); //객체 생성
// parent : 인스턴스 (Class 도면으로부터 구현 된 결과물)
// Ex) parent.name, parent.age, parent.printName(), parent.printAge()
// . : 참조 연산자

public class Parent {
	// 속성(변수)
	String name = "부모";
	int age = 50;
	
	// 행위(함수)
	public void printName() {
		System.out.println(name);
	}
	public void printAge() {
		System.out.println(age);
	}
}
