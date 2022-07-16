package basic;

public class JavaFor {

	public static void main(String[] args) {
		// i : index
		//   반복 시작;   반복 종료;   +1씩 증가
		// 1~5 덧셈 누적값 출력
		int total = 0; //누적값을 저장하는 변수
		for (int i = 1; i <= 5; i++) {
			//반복 실행 할 코드
			total += i; //total = total + i;
		}
		System.out.println(total);
	}

}
