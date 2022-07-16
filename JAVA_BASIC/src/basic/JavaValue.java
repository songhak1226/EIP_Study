package basic;

// 변수 : "하나의 값"을 저장하는 메모리 공간

public class JavaValue {

	public static void main(String[] args) {
		// 변수 선언 및 초기화
		// 변수 선언 : 변수 생성 int num;
		// 변수 초기화 : 변수에 값을 할당 num = 4;
		
		// ** 자료형 **
		// - 기본 자료형 - 변수에 값을 저장
		// byte, short, int, long : 정수형 숫자 : 3, 6, 5
		// float, double : 실수형 숫자 : 3.14, 2.5
		// boolean : 참(true), 거짓(false)
		// char : 문자 1개 : "a", "b"
		// - 객체 자료형 - 변수에 값이 위치한 주소값을 저장
		// String : 문자열 : "asdf"
		// Array : 배열 : int arr[3]
		// Class
		
		int number;
		number = 5;
		
		int num = 4;
		char a = 'a';
		String c = "idol";
		
		System.out.println(num);
		System.out.println(a);
		System.out.println(c);
	}

}
