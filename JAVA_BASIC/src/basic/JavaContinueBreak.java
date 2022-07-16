package basic;

public class JavaContinueBreak {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue; //해당 반복 종료 후 다음 반복으로 넘어감
			}
			
			if(i == 9) {
				break; //해당 반복문 종료
			}
			System.out.println(i);
		}

	}

}
