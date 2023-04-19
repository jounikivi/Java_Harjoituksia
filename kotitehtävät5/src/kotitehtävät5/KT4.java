package kotitehtävät5;

import java.util.Scanner;

public class KT4 {
    // Metodi, joka tulostaa annetun merkkijonon jokaisen sanan ensimmäisen kirjaimen
    public static void ekatKirjaimet(String jono) {
        // Erotellaan sanat välilyönnin perusteella ja tallennetaan ne taulukkoon
        String[] sanat = jono.split(" ");
        // Käydään läpi taulukon sanat
        for(int i = 0; i < sanat.length; i++) {
            // Tulostetaan jokaisen sanan ensimmäinen kirjain ilman välilyöntiä
            System.out.print(sanat[i].charAt(0));
        }
        // Tulostetaan rivinvaihto, jotta seuraava tuloste tulee omalle rivilleen
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Luodaan Scanner-olio käyttäjän syötteen lukemista varten
        Scanner lukija = new Scanner(System.in);
        // Kysytään käyttäjältä merkkijono
        System.out.print("Syötä merkkijono: ");
        String jono = lukija.nextLine();
        // Kutsutaan ekatKirjaimet-metodia ja annetaan sille käyttäjän syöttämä merkkijono parametrina
        ekatKirjaimet(jono);
    }

}
