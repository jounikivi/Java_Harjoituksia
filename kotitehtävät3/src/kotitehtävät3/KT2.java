package kotiteht�v�t3;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in); // luodaan Scanner-olio lukijaa varten
		System.out.println("anna eka luku"); // pyydet��n k�ytt�j�lt� ensimm�inen luku
		double num1 = lukija.nextInt(); // luetaan k�ytt�j�n sy�tt�m� luku num1-muuttujaan

		System.out.println("anna toka luku"); // pyydet��n k�ytt�j�lt� toinen luku
		double num2 = lukija.nextInt(); // luetaan k�ytt�j�n sy�tt�m� luku num2-muuttujaan

		System.out.println("laskut"); // tulostetaan merkkijono "laskut"
		
		// tulostetaan laskutoimitukset k�ytt�en num1 ja num2 muuttujia
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}

