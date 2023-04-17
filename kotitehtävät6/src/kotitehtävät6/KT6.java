package kotiteht�v�t6;

public class KT6 {
	public static int laskeSeuraavatKirjaimet(String jono, char merkki, int lkm, String aakkosto) {
	    int count = 0;
	    int merkkiIndex = aakkosto.indexOf(merkki);
	    // Jos merkki ei l�ydy aakkostosta tai lkm on nolla, palautetaan nolla
	    if (merkkiIndex == -1 || lkm == 0) {
	        return 0;
	    }
	    // K�yd��n l�pi jono, mutta vain sen osat, joissa on tarpeeksi merkkej� j�ljell�, jotta voidaan 
	    //laskea lkm seuraavaa merkki�
	    for (int i = 0; i <= jono.length() - lkm - 1; i++) {
	        // Tarkistetaan, onko merkki sama kuin jono -merkkijonon i-indeksiss� oleva merkki
	        if (jono.charAt(i) == merkki) {
	            // Otetaan lkm seuraavaa merkki� talteen seuraavista indekseist� jono -merkkijonossa
	            String seuraavatKirjaimet = jono.substring(i + 1, i + lkm + 1);
	            // K�yd��n l�pi lkm seuraavaa merkki� ja tarkistetaan, onko niiden 
	            //joukossa haluttu merkki aakkostossa
	            for (int j = 0; j < seuraavatKirjaimet.length(); j++) {
	                char seuraavaMerkki = seuraavatKirjaimet.charAt(j);
	                if (aakkosto.indexOf(seuraavaMerkki) == merkkiIndex + lkm) {
	                    count++;
	                    break; // lopetetaan seuraavien merkkien tarkistus, kun l�ydet��n haluttu merkki
	                }
	            }
	        }
	    }
	    // Palautetaan laskurin arvo
	    return count;
	}

}
