package kotiteht‰v‰t3;

import java.util.Scanner;

public class KT6 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		// pelin tila
		boolean jatka = true;

		while (jatka) {
			// pelaajan valinta
			System.out.println("Valitse kivi, paperi tai sakset (k/p/s):");
			String pelaajanValinta = lukija.nextLine();

			// tietokoneen valinta
			String tietokoneenValinta = arvoTietokoneenValinta();
			System.out.println("Tietokone valitsi " + tietokoneenValinta);

			// tarkistetaan pelitulos ja tulostetaan viesti
			String tulos = pelaa(pelaajanValinta, tietokoneenValinta);
			System.out.println(tulos);

			// kysyt‰‰n, haluaako pelaaja jatkaa peli‰
			System.out.println("Haluatko jatkaa pelia? (k/e)");
			String vastaus = lukija.nextLine();
			if (vastaus.equals("e")) {
				jatka = false;
				System.out.println("Kiitos pelaamisesta!");
			}
		}
	}

	// arvotaan tietokoneen valinta
	public static String arvoTietokoneenValinta() {
		int arvottuLuku = (int) (Math.random() * 3);
		String[] vaihtoehdot = {"kivi", "paperi", "sakset"};
		return vaihtoehdot[arvottuLuku];
	}

	// tarkistetaan pelitulos
	public static String pelaa(String pelaajanValinta, String tietokoneenValinta) {
		if (pelaajanValinta.equals(tietokoneenValinta)) {
			return "Tasapeli!";
		} else if ((pelaajanValinta.equals("k") && tietokoneenValinta.equals("s"))
				|| (pelaajanValinta.equals("p") && tietokoneenValinta.equals("k"))
				|| (pelaajanValinta.equals("s") && tietokoneenValinta.equals("p"))) {
			return "Voitit!";
		} else {
			return "Havisit!";
		}
	}
}
