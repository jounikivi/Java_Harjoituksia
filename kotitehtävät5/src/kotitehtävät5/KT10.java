package kotitehtävät5;

public class KT10 {
	public static void main(String[] args) {
        // Alustetaan kaksi merkkijonoa
        String jono1 = "KISSA";
        String jono2 = "KASSI";

        // Kutsutaan voidonsamojaindekseissa-metodia ja annetaan sille jono1 ja jono2 parametreiksi
        voidonsamojaindekseissa(jono1, jono2);
    }

    // Metodi, joka tarkistaa, ovatko kaksi merkkijonoa saman pituisia ja tulostaa ne merkit, jotka ovat samoissa indekseissä
    public static void voidonsamojaindekseissa(String jono1, String jono2) {
        // Tarkistetaan, ovatko merkkijonot yhtä pitkiä. Jos eivät ole, tulostetaan virheilmoitus ja palataan.
        if (jono1.length() != jono2.length()) {
            System.out.println("Merkkijonot eivät ole yhtä pitkiä.");
            return;
        }

        // Alustetaan boolean-muuttuja loydetty, joka tulee merkitsemään, onko samoja merkkejä löytynyt.
        boolean loydetty = false;
        
        // Käydään läpi kaikki merkit merkkijonoissa.
        for (int i = 0; i < jono1.length(); i++) {
            // Jos merkit ovat samassa indeksissä samoja, tulostetaan ne ja merkitään loydetty-muuttuja trueksi.
            if (jono1.charAt(i) == jono2.charAt(i)) {
                System.out.println(jono1.charAt(i) + ":" + i);
                loydetty = true;
            }
        }

        // Jos samoja merkkejä ei löytynyt, tulostetaan virheilmoitus.
        if (!loydetty) {
            System.out.println("Merkkijonoissa ei ole yhteneviä merkkejä samassa indeksissä.");
        }
    }
}
