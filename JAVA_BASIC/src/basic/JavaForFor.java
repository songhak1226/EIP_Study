package basic;

import java.util.Scanner;

public class JavaForFor {

	public static void main(String[] args) {
		//구구단 출력(2단)
		//int dan = 2;
		
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단?");
		dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			int result = dan * i;
			System.out.println(dan + "x" + i + "=" + result );
		}
		System.out.println("출력완료");
	}

}
