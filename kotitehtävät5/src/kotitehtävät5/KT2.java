package kotiteht�v�t5;

import java.util.Scanner;

public class KT2 {
	 public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // K�ytt�j�lt� pyydet��n ensimm�inen merkkijono ja tallennetaan se muuttujaan jono1
        System.out.print("Sy�t� ensimm�inen merkkijono: ");
        String jono1 = lukija.nextLine();

        // K�ytt�j�lt� pyydet��n toinen merkkijono ja tallennetaan se muuttujaan jono2
        System.out.print("Sy�t� toinen merkkijono: ");
        String jono2 = lukija.nextLine();

        // Kutsutaan tulostaPidempi()-metodia ja annetaan sille parametreina k�ytt�j�n sy�tt�m�t merkkijonot
        tulostaPidempi(jono1, jono2);
    }

    // Metodi tulostaPidempi() tulostaa pidemm�n merkkijonon
    public static void tulostaPidempi(String jono1, String jono2) {
        if (jono1.length() >= jono2.length()) {
            // Jos jono1 on pidempi, se tulostetaan n�yt�lle
            System.out.println(jono1);
        } else {
            // Muussa tapauksessa jono2 on pidempi, joten se tulostetaan n�yt�lle
            System.out.println(jono2);
        }
    }
}

