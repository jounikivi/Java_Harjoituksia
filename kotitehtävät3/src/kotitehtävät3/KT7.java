package kotitehtävät3;

import java.util.Random;
import java.util.Scanner;

public class KT7 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in); // Luo Scanner-olion käyttäjän syötteiden lukemiseen
		Random arpoja = new Random(); // Luo Random-olion satunnaisten numeroiden arpomiseen
		int pelaajanPisteet = 0; // Alusta pelaajan pisteet nollaksi
		int tietokoneenPisteet = 0; // Alusta tietokoneen pisteet nollaksi

		// Toista 10 kierrosta
		for (int i = 1; i <= 10; i++) {
			System.out.println("Kierros " + i);
			System.out.print("Valitse kivi (k), paperi (p) tai sakset (s): ");
			String pelaajanValinta = lukija.nextLine(); // Lue käyttäjän valinta syötteestä

			int tietokoneenValinta = arpoja.nextInt(3); // Arvo satunnainen numero 0, 1 tai 2

			// Tulosta tietokoneen valinta
			switch (tietokoneenValinta) {
			case 0:
				System.out.println("Tietokone valitsi: kivi");
				break;
			case 1:
				System.out.println("Tietokone valitsi: paperi");
				break;
			case 2:
				System.out.println("Tietokone valitsi: sakset");
				break;
			}

			// Päätä kumpi voitti
			if (pelaajanValinta.equals("k") && tietokoneenValinta == 2
					|| pelaajanValinta.equals("p") && tietokoneenValinta == 0
					|| pelaajanValinta.equals("s") && tietokoneenValinta == 1) {
				System.out.println("Voitit!");
				pelaajanPisteet++;
			} else if (pelaajanValinta.equals("k") && tietokoneenValinta == 1
					|| pelaajanValinta.equals("p") && tietokoneenValinta == 2
					|| pelaajanValinta.equals("s") && tietokoneenValinta == 0) {
				System.out.println("Tietokone voitti!");
				tietokoneenPisteet++;
			} else {
				System.out.println("Tasapeli!");
			}
		}

		// Tulosta lopputulokset
		System.out.println("Pelaajan pisteet: " + pelaajanPisteet);
		System.out.println("Tietokoneen pisteet: " + tietokoneenPisteet);
		if (pelaajanPisteet > tietokoneenPisteet) {
			System.out.println("Voitit pelin!");
		} else if (pelaajanPisteet < tietokoneenPisteet) {
			System.out.println("Tietokone voitti pelin!");
		} else {
			System.out.println("Peli päättyi tasapeliin!");
		}
	}
}
