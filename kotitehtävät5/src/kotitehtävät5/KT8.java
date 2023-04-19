package kotiteht�v�t5;

import java.util.Scanner;

public class KT8 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Sy�t� merkkijono: ");
        String mjono = lukija.nextLine();

        // Kutsu kapitalisoi-metodia sy�tetyll� merkkijonolla
        String kapitalisoituMjono = kapitalisoi(mjono);

        // Tulosta alkuper�inen merkkijono ja kapitalisoitu merkkijono
        System.out.println("Alkuper�inen merkkijono: " + mjono);
        System.out.println("Kapitalisoitu merkkijono: " + kapitalisoituMjono);
    }

    // Metodi, joka kapitalisoi jokaisen merkkijonon sanan
    public static String kapitalisoi(String mjono) {
        String[] sanat = mjono.split(" "); // Erotellaan merkkijono sanoihin
        StringBuilder sb = new StringBuilder(); // Luodaan uusi StringBuilder-olio

        // K�yd��n l�pi kaikki sanat
        for (String sana : sanat) {
            if (sana.length() > 0) { // Tarkistetaan, ett� sana ei ole tyhj�
                String ensimm�inenKirjain = sana.substring(0, 1); // Otetaan talteen sanan ensimm�inen kirjain
                String loputKirjaimet = sana.substring(1); // Otetaan talteen sanan muut kirjaimet
             // Lis�t��n kapitalisoitu sana StringBuilderiin
                sb.append(ensimm�inenKirjain.toUpperCase() + loputKirjaimet + " "); 
            }
        }

        return sb.toString().trim(); // Palautetaan kapitalisoitu merkkijono
    }
}
