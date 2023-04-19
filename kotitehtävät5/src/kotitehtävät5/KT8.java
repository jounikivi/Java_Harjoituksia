package kotitehtävät5;

import java.util.Scanner;

public class KT8 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä merkkijono: ");
        String mjono = lukija.nextLine();

        // Kutsu kapitalisoi-metodia syötetyllä merkkijonolla
        String kapitalisoituMjono = kapitalisoi(mjono);

        // Tulosta alkuperäinen merkkijono ja kapitalisoitu merkkijono
        System.out.println("Alkuperäinen merkkijono: " + mjono);
        System.out.println("Kapitalisoitu merkkijono: " + kapitalisoituMjono);
    }

    // Metodi, joka kapitalisoi jokaisen merkkijonon sanan
    public static String kapitalisoi(String mjono) {
        String[] sanat = mjono.split(" "); // Erotellaan merkkijono sanoihin
        StringBuilder sb = new StringBuilder(); // Luodaan uusi StringBuilder-olio

        // Käydään läpi kaikki sanat
        for (String sana : sanat) {
            if (sana.length() > 0) { // Tarkistetaan, että sana ei ole tyhjä
                String ensimmäinenKirjain = sana.substring(0, 1); // Otetaan talteen sanan ensimmäinen kirjain
                String loputKirjaimet = sana.substring(1); // Otetaan talteen sanan muut kirjaimet
             // Lisätään kapitalisoitu sana StringBuilderiin
                sb.append(ensimmäinenKirjain.toUpperCase() + loputKirjaimet + " "); 
            }
        }

        return sb.toString().trim(); // Palautetaan kapitalisoitu merkkijono
    }
}
