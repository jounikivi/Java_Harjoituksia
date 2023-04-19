package kotiteht‰v‰t5;

public class KT3 {
	
	// Metodi, joka palauttaa annetun merkkijonon merkit k‰‰nteisess‰ j‰rjestyksess‰
	public static String takaperin(String jono) {
	    String reversed = ""; // Alustetaan uusi merkkijono, johon k‰‰nteinen j‰rjestys tallennetaan
	    
	    // K‰yd‰‰n l‰pi annetun merkkijonon merkit k‰‰nteisess‰ j‰rjestyksess‰
	    for (int i = jono.length() - 1; i >= 0; i--) {
	        reversed += jono.charAt(i); // Lis‰t‰‰n jokainen merkki uuteen merkkijonoon
	    }
	    
	    return reversed; // Palautetaan uusi merkkijono, joka sis‰lt‰‰ annetun merkkijonon merkit k‰‰nteisess‰ j‰rjestyksess‰
	}
	
	public static void main(String[] args) {
	    String esimerkki = "T‰m‰ on esimerkki";
	    String kaannetty = takaperin(esimerkki); // Kutsutaan takaperin() -metodia antamalla sille esimerkki merkkijono
	    
	    System.out.println("Alkuper‰inen merkkijono: " + esimerkki); // Tulostetaan alkuper‰inen merkkijono
	    System.out.println("K‰‰nnetty merkkijono: " + kaannetty); // Tulostetaan k‰‰nnetty merkkijono
	}
}
