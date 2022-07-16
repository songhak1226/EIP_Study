package basic;

public class JavaMethod {
	// 함수 : 반복적으로 사용하는 코드
	// 카멜케이스, ()붙어있으면 함수
	
	//접근제한자 [지정어] 데이터반환타입 함수명(매개변수)
	public static void printName(String name) { // 1.함수정의(선언)
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("111");
		printName("체리"); // 2.함수호출
		System.out.println("222");
	}

}
