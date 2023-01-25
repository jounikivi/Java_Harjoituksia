package kotitehtävä1;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("anna eka luku");
		int num1 = lukija.nextInt();
		System.out.println("anna toka luku");
		int num2 = lukija.nextInt();
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("isoin luku " + max);
	}
}
