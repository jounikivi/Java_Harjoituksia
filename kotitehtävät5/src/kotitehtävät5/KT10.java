package kotiteht�v�t5;

public class KT10 {
	public static void main(String[] args) {
        // Alustetaan kaksi merkkijonoa
        String jono1 = "KISSA";
        String jono2 = "KASSI";

        // Kutsutaan voidonsamojaindekseissa-metodia ja annetaan sille jono1 ja jono2 parametreiksi
        voidonsamojaindekseissa(jono1, jono2);
    }

    // Metodi, joka tarkistaa, ovatko kaksi merkkijonoa saman pituisia ja tulostaa ne merkit, jotka ovat samoissa indekseiss�
    public static void voidonsamojaindekseissa(String jono1, String jono2) {
        // Tarkistetaan, ovatko merkkijonot yht� pitki�. Jos eiv�t ole, tulostetaan virheilmoitus ja palataan.
        if (jono1.length() != jono2.length()) {
            System.out.println("Merkkijonot eiv�t ole yht� pitki�.");
            return;
        }

        // Alustetaan boolean-muuttuja loydetty, joka tulee merkitsem��n, onko samoja merkkej� l�ytynyt.
        boolean loydetty = false;
        
        // K�yd��n l�pi kaikki merkit merkkijonoissa.
        for (int i = 0; i < jono1.length(); i++) {
            // Jos merkit ovat samassa indeksiss� samoja, tulostetaan ne ja merkit��n loydetty-muuttuja trueksi.
            if (jono1.charAt(i) == jono2.charAt(i)) {
                System.out.println(jono1.charAt(i) + ":" + i);
                loydetty = true;
            }
        }

        // Jos samoja merkkej� ei l�ytynyt, tulostetaan virheilmoitus.
        if (!loydetty) {
            System.out.println("Merkkijonoissa ei ole yhtenevi� merkkej� samassa indeksiss�.");
        }
    }
}
