// ** JAVA 실행 과정 **
// HelloJava.java : 개발자가 작성한 코드(원시파일)
// -> JAVAC(컴파일러) : 컴파일러(원시파일 -> 기계어 번역)
// -> HelloJava.class : 바이트코드(기계가 알아먹을 수 있음)
// -> JVM(Java Virtual Machine) : 자바 프로그램 실행하는 기계
// -> 실행 결과 출력

package basic;

// Project
// -> Package
//   -> 00.java

public class HelloJava {
	// JAVA 프로그램을 실행하기 위해서는 반드시 => main() 함수 필요
	// 함수 : 특정기능을 반복적으로 실행하기 위해서 묶어놓은 코드
	public static void main(String[] args) {
		// main 옆에 괄호가 붙어있으면 "함수"
		System.out.println("HelloJava");
		System.out.print("수박");
		System.out.println("포도");
		System.out.print("사과");
	}

}
