package kotitehtävät3;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in); // luodaan Scanner-olio lukijaa varten
		System.out.println("anna eka luku"); // pyydetään käyttäjältä ensimmäinen luku
		double num1 = lukija.nextInt(); // luetaan käyttäjän syöttämä luku num1-muuttujaan

		System.out.println("anna toka luku"); // pyydetään käyttäjältä toinen luku
		double num2 = lukija.nextInt(); // luetaan käyttäjän syöttämä luku num2-muuttujaan

		System.out.println("laskut"); // tulostetaan merkkijono "laskut"
		
		// tulostetaan laskutoimitukset käyttäen num1 ja num2 muuttujia
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}

