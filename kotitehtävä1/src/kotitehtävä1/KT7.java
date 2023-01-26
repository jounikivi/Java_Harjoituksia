package kotitehtävä1;

import java.util.Scanner;

public class KT7 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna tenttiarvosana");
		int pisteet = lukija.nextInt();
		
		if (pisteet >= 0 && pisteet <= 11) {
			System.out.println("Arvosona: hylätty");
		}
		else if(pisteet >= 12 && pisteet <= 16) {
			System.out.println("Arvosana: 1");
		}
		else if(pisteet >= 17 && pisteet <= 21) {
			System.out.println("Arvosana: 3");
		}
		else if (pisteet >= 22 && pisteet <= 24) {
			System.out.println("Arvosana: 4");
		}
		else {
			System.out.println("Väärä syöte");
		}
	}

}
