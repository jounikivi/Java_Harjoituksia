package kotitehtävät5;

public class KT3 {
	
	// Metodi, joka palauttaa annetun merkkijonon merkit käänteisessä järjestyksessä
	public static String takaperin(String jono) {
	    String reversed = ""; // Alustetaan uusi merkkijono, johon käänteinen järjestys tallennetaan
	    
	    // Käydään läpi annetun merkkijonon merkit käänteisessä järjestyksessä
	    for (int i = jono.length() - 1; i >= 0; i--) {
	        reversed += jono.charAt(i); // Lisätään jokainen merkki uuteen merkkijonoon
	    }
	    
	    return reversed; // Palautetaan uusi merkkijono, joka sisältää annetun merkkijonon merkit käänteisessä järjestyksessä
	}
	
	public static void main(String[] args) {
	    String esimerkki = "Tämä on esimerkki";
	    String kaannetty = takaperin(esimerkki); // Kutsutaan takaperin() -metodia antamalla sille esimerkki merkkijono
	    
	    System.out.println("Alkuperäinen merkkijono: " + esimerkki); // Tulostetaan alkuperäinen merkkijono
	    System.out.println("Käännetty merkkijono: " + kaannetty); // Tulostetaan käännetty merkkijono
	}
}
