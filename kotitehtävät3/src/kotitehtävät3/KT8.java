package kotiteht‰v‰t3;

import java.util.Scanner;

public class KT8 {
	private int minuutit;
	private int sekunnit;

	// Konstruktori ajastimen luomiseen
	public KT8(int minuutit, int sekunnit) {
		this.minuutit = minuutit;
		this.sekunnit = sekunnit;
	}

	// Palauttaa minuutit
	public int getMinuutit() {
		return minuutit;
	}

	// Palauttaa sekunnit
	public int getSekunnit() {
		return sekunnit;
	}

	// Tulostaa ajan muodossa "3:29"
	public void tulosta() {
		System.out.printf("%d:%02d\n", minuutit, sekunnit);
	}

	// V‰hent‰‰ aikaa annetun sekuntim‰‰r‰n verran ja tarkistaa rajoitukset
	public void vahennaAikaa(int sekuntia) {
		sekuntia = Math.max(0, sekuntia); // Varmistetaan, ett‰ sekuntia ei ole negatiivinen
		int uudetSekunnit = sekunnit + sekuntia;
		int ylimenevatMinuutit = uudetSekunnit / 60;
		int uudetMinuutit = minuutit + ylimenevatMinuutit;

		// Tarkistetaan, onko aika yli 5 minuuttia
		if (uudetMinuutit > 5) {
			uudetMinuutit = 5;
			uudetSekunnit = 0;
		} else {
			uudetSekunnit = uudetSekunnit % 60;
		}
		minuutit = uudetMinuutit;
		sekunnit = uudetSekunnit;
	}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna minuutit: ");
		int minuutit = lukija.nextInt();
		System.out.print("Anna sekunnit: ");
		int sekunnit = lukija.nextInt();

		KT8 ajastin = new KT8(minuutit, sekunnit);

		// P‰ivitet‰‰n aikaa joka sekunti kunnes aika loppuu
		while (ajastin.getMinuutit() > 0 || ajastin.getSekunnit() > 0) {
			ajastin.tulosta();
			ajastin.vahennaAikaa(1);
			try {
				Thread.sleep(1000); // Pys‰ytet‰‰n ohjelma sekunniksi
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ajastin.tulosta();
		System.out.println("Aika loppui!");
	}
}
