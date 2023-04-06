package kotiteht‰v‰t2;

import java.util.Random;
import java.util.Scanner;

public class KT7 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		// Muuttujat seuraaville tiedoille
		int valinta; // k‰ytt‰j‰n valinta
		int arvauskierros = 0; // arvuuttelukierrosten m‰‰r‰
		int parasTulos = 0; // paras arvaustulos
		int huonoinTulos = Integer.MAX_VALUE; // huonoin arvaustulos, alustetaan suurimmaksi mahdolliseksi arvoksi
		
		// Toistetaan arvailua, kunnes k‰ytt‰j‰ valitsee lopetuksen
		do {
			Random random = new Random();
			int numberToGuess = random.nextInt(100) + 1;
			int arvaa;
			int arvaustenLkm = 0; // arvausten lukum‰‰r‰ yhdess‰ arvuuttelukierroksessa
			System.out.println("Arvaa luku v‰lilt‰ 1-100:");
			while (true) {
				arvaa = lukija.nextInt();
				arvaustenLkm++;
				if (arvaa == numberToGuess) {
					System.out.println("Arvasit oikein!");
					break;
				} else if (arvaa < numberToGuess) {
					System.out.println("Arvattu luku on liian pieni");
				} else {
					System.out.println("Arvattu luku on liian suuri");
				}
			}
			
			arvauskierros++;
			System.out.println("Arvauskierros " + arvauskierros + " p‰‰ttyi " + arvaustenLkm + " arvaukseen.");
			if (arvaustenLkm < huonoinTulos) {
				huonoinTulos = arvaustenLkm;
			}
			if (arvaustenLkm > parasTulos) {
				parasTulos = arvaustenLkm;
			}
			
			System.out.println("Valitse toiminto:\n1) Arvaa uusi luku\n2) Lopeta");
			valinta = lukija.nextInt();
		} while (valinta != 2);
		
		// Tulostetaan lopputulokset
		System.out.println("Ohjelman suoritus p‰‰ttyi.");
		System.out.println("Paras tulos oli " + parasTulos + " arvausta.");
		System.out.println("Huonoin tulos oli " + huonoinTulos + " arvausta.");
	}
}
