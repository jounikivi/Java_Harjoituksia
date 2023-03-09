package kotitehtävät5;

import java.util.Scanner;

public class KT1 {
	public static int laskeKirjaimet(String jono, char merkki) {
	    int lkm = 0;
	    for (int i = 0; i < jono.length(); i++) {
	        if (jono.charAt(i) == merkki) {
	            lkm++;
	        }
	    }
	    return lkm;
	}
	public static void main(String[] args) {
	    Scanner lukija = new Scanner(System.in);

	    System.out.print("Syötä merkkijono: ");
	    String jono1 = lukija.nextLine();

	    System.out.print("Syötä merkki: ");
	    char merkki = lukija.nextLine().charAt(0);

	    int lkm = laskeKirjaimet(jono1, merkki);
	    System.out.println("Merkki \"" + merkki + "\" esiintyy merkkijonossa " + lkm + " kertaa.");
	}

}
