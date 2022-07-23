package oop;

public class ex0723_3 {

	public static void main(String[] args) {
		int[] a = new int[8];
		int n = 11;
		int i = a.length - 1;
		while (n != 0) {
			a[i] = n % 2;
			n /= 2; // <- n = n / 2
			i--;
		}
		for (int j = 0; j < a.length; j++)
			System.out.printf("%d", a[j]);
	}

}