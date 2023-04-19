package kotiteht‰v‰t5;

import java.util.Scanner;

public class KT1 {
	// Metodi, joka laskee kuinka monta kertaa merkki esiintyy annetussa merkkijonossa
	public static int laskeKirjaimet(String jono, char merkki) {
	    int lkm = 0;
	    // K‰yd‰‰n merkkijono l‰pi merkki kerrallaan
	    for (int i = 0; i < jono.length(); i++) {
	        // Jos merkki esiintyy, kasvatetaan laskuria
	        if (jono.charAt(i) == merkki) {
	            lkm++;
	        }
	    }
	    // Palautetaan merkin esiintymien lukum‰‰r‰
	    return lkm;
	}
	
	public static void main(String[] args) {
	    Scanner lukija = new Scanner(System.in);

	    System.out.print("Syˆt‰ merkkijono: ");
	    String jono1 = lukija.nextLine();

	    System.out.print("Syˆt‰ merkki: ");
	    char merkki = lukija.nextLine().charAt(0);

	    // Kutsutaan laskeKirjaimet-metodia ja tallennetaan palautettu arvo muuttujaan lkm
	    int lkm = laskeKirjaimet(jono1, merkki);
	    
	    // Tulostetaan merkin esiintymien lukum‰‰r‰ k‰ytt‰en merkkijonojen yhdist‰mist‰
	    System.out.println("Merkki \"" + merkki + "\" esiintyy merkkijonossa " + lkm + " kertaa.");
	}

}
