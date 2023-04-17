package kotitehtävät6;

public class KT6 {
	public static int laskeSeuraavatKirjaimet(String jono, char merkki, int lkm, String aakkosto) {
	    int count = 0;
	    int merkkiIndex = aakkosto.indexOf(merkki);
	    // Jos merkki ei löydy aakkostosta tai lkm on nolla, palautetaan nolla
	    if (merkkiIndex == -1 || lkm == 0) {
	        return 0;
	    }
	    // Käydään läpi jono, mutta vain sen osat, joissa on tarpeeksi merkkejä jäljellä, jotta voidaan 
	    //laskea lkm seuraavaa merkkiä
	    for (int i = 0; i <= jono.length() - lkm - 1; i++) {
	        // Tarkistetaan, onko merkki sama kuin jono -merkkijonon i-indeksissä oleva merkki
	        if (jono.charAt(i) == merkki) {
	            // Otetaan lkm seuraavaa merkkiä talteen seuraavista indekseistä jono -merkkijonossa
	            String seuraavatKirjaimet = jono.substring(i + 1, i + lkm + 1);
	            // Käydään läpi lkm seuraavaa merkkiä ja tarkistetaan, onko niiden 
	            //joukossa haluttu merkki aakkostossa
	            for (int j = 0; j < seuraavatKirjaimet.length(); j++) {
	                char seuraavaMerkki = seuraavatKirjaimet.charAt(j);
	                if (aakkosto.indexOf(seuraavaMerkki) == merkkiIndex + lkm) {
	                    count++;
	                    break; // lopetetaan seuraavien merkkien tarkistus, kun löydetään haluttu merkki
	                }
	            }
	        }
	    }
	    // Palautetaan laskurin arvo
	    return count;
	}

}
