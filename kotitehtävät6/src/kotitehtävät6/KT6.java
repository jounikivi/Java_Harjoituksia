package kotitehtävät6;

public class KT6 {
	public static int laskeSeuraavatKirjaimet(String jono, char merkki, int lkm, String aakkosto) {
	    int count = 0;
	    for (int i = 0; i < jono.length() - lkm - 1; i++) {
	        if (jono.charAt(i) == merkki) {
	            String seuraavatKirjaimet = jono.substring(i + 1, i + lkm + 1);
	            for (int j = 0; j < seuraavatKirjaimet.length(); j++) {
	                if (seuraavatKirjaimet.charAt(j) == aakkosto.charAt(aakkosto.indexOf(merkki) + lkm)) {
	                    count++;
	                }
	            }
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {
	    String jono = "abckcabcefg";
	    char merkki = 'a';
	    int lkm = 2;
	    String aakkosto = "abcdefghijklmnopqrstuvwxyz";
	    int result = laskeSeuraavatKirjaimet(jono, merkki, lkm, aakkosto);
	    System.out.println(result); // prints 1
	}
}
