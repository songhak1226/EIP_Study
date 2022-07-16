package oop;

//계산기

public class Calc {
	 /*
	 1.함수 정의 후 2.함수 실행
	 함수 실행을 안하면 아무 동작도 하지 않음
	
	 함수
	 기존코드에서 함수로 갔다가 기존코드 기존코드 => 함수 => (반환값) => 기존코드
	 - 입력값 : (파라미터)
	 - 반환값 : return 값
	 - 입력값, 반환값 둘다 사용 안할 수도 있음
	
	 함수에서 기존코드로 돌아가는 타이밍
	 - 함수가 끝났을 때({}만났을때)
	 - return 코드
	
	 데이터 반환타입이랑 return값이 자료형이 동일
	 데이터를 반환하지 않을 경우에는 void 사용
	 접근제한자 [지정어] 데이터 반환 타입 함수명 (입력값)
	 */
	
	public static int calcPlus(int a, int b) {
		int total = a + b;
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("덧셈 시작");
		int total = calcPlus(2, 5);
		System.out.println("덧셈 결과: " + total);
		System.out.println("덧셈 종료");
	}

}
