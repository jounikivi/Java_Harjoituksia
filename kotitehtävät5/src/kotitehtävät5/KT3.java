package kotiteht‰v‰t5;

public class KT3 {
	public static String takaperin(String jono) {
	    String reversed = "";
	    for (int i = jono.length() - 1; i >= 0; i--) {
	        reversed += jono.charAt(i);
	    }
	    return reversed;
	}
	
	public static void main(String[] args) {
	    String esimerkki = "T‰m‰ on esimerkki";
	    String kaannetty = takaperin(esimerkki);
	    System.out.println("Alkuper‰inen merkkijono: " + esimerkki);
	    System.out.println("K‰‰nnetty merkkijono: " + kaannetty);
	}
}
