package kotitehtävät5;

public class KT11 {
	public static void onSamojaIndekseissa(String jono1, String jono2) {
	    int pituus = Math.min(jono1.length(), jono2.length());
	    boolean loydetty = false;
	    for (int i = 0; i < pituus; i++) {
	        if (jono1.charAt(i) == jono2.charAt(i)) {
	            System.out.println(jono1.charAt(i) + ":" + i);
	            loydetty = true;
	        }
	    }
	    if (!loydetty) {
	        System.out.println("Ei samoja merkkejä samoissa indekseissä.");
	    }
	}
	public static void main(String[] args) {
	    String jono1 = "kissa";
	    String jono2 = "kassi";
	    onSamojaIndekseissa(jono1, jono2);
	}

}