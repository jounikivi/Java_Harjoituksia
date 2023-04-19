package kotitehtävät5;

public class KT10 {
	public static void voidonsamojaindekseissa(String jono1, String jono2) {
	    if (jono1.length() != jono2.length()) {
	        System.out.println("Merkkijonojen pituudet eivät ole samat.");
	        return;
	    }

	    boolean foundMatch = false;
	    for (int i = 0; i < jono1.length(); i++) {
	        if (jono1.charAt(i) == jono2.charAt(i)) {
	            System.out.printf("%c:%d ", jono1.charAt(i), i);
	            foundMatch = true;
	        }
	    }

	    if (!foundMatch) {
	        System.out.println("Ei löytynyt yhtään samaa merkkiä samoissa indekseissä.");
	    }
	}

}
