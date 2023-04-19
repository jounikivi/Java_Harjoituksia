package kotitehtävät5;

import java.util.Scanner;

public class KT2 {
	 public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Käyttäjältä pyydetään ensimmäinen merkkijono ja tallennetaan se muuttujaan jono1
        System.out.print("Syötä ensimmäinen merkkijono: ");
        String jono1 = lukija.nextLine();

        // Käyttäjältä pyydetään toinen merkkijono ja tallennetaan se muuttujaan jono2
        System.out.print("Syötä toinen merkkijono: ");
        String jono2 = lukija.nextLine();

        // Kutsutaan tulostaPidempi()-metodia ja annetaan sille parametreina käyttäjän syöttämät merkkijonot
        tulostaPidempi(jono1, jono2);
    }

    // Metodi tulostaPidempi() tulostaa pidemmän merkkijonon
    public static void tulostaPidempi(String jono1, String jono2) {
        if (jono1.length() >= jono2.length()) {
            // Jos jono1 on pidempi, se tulostetaan näytölle
            System.out.println(jono1);
        } else {
            // Muussa tapauksessa jono2 on pidempi, joten se tulostetaan näytölle
            System.out.println(jono2);
        }
    }
}

