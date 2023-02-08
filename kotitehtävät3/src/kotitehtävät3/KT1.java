package kotitehtävät3;

import java.util.Scanner;

public class KT1 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int num1 = lueLuku(lukija, "anna eka luku");
		int num2 = lueLuku(lukija, "anna toka luku");
		int sum = laskeSumma (num1, num2);
		boolean p = onParillinen(sum);
		if(p) {
			System.out.println("lukujen summa " + sum + " on parrillinen ");
		}
		else {
			System.out.println("lukujen summa " + sum + " on pariton ");
		}
	}
	public static int lueLuku(Scanner sc, String prompt) {
		System.out.print(prompt);
	    return sc.nextInt();
	}
	
	public static int laskeSumma(int num1, int num2) {
		return num1 + num2;
	}
	public static boolean onParillinen(int num) {
		return num % 2 == 0;
	}
}
