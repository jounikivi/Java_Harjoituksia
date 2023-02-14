package kotitehtävät3;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("anna eka luku");
		double num1 = lukija.nextInt();
		
		System.out.println("anna toka luku");
		double num2 = lukija.nextInt();
		
		System.out.println("laskut");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
	}
}
