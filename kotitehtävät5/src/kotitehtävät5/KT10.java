package kotitehtävät5;

public class KT10 {
	public static void tulostaVokaalialkuiset(String mjono) {
	    String[] sanat = mjono.split(" ");
	    for (String sana : sanat) {
	        char ensimmäinenKirjain = sana.toLowerCase().charAt(0);
	        if (ensimmäinenKirjain == 'a' || ensimmäinenKirjain == 'e' || 
	            ensimmäinenKirjain == 'i' || ensimmäinenKirjain == 'o' || 
	            ensimmäinenKirjain == 'u' || ensimmäinenKirjain == 'y') {
	            System.out.println(sana);
	        }
	    }
	}
	public static void main(String[] args) {
	    String mjono = "Aamu alkoi aurinkoisena, mutta iltaan mennessä sää viileni.";
	    tulostaVokaalialkuiset(mjono);
	}

}
