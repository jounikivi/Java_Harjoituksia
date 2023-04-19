package kotiteht�v�t5;

import java.util.Scanner;

public class KT4 {
    // Metodi, joka tulostaa annetun merkkijonon jokaisen sanan ensimm�isen kirjaimen
    public static void ekatKirjaimet(String jono) {
        // Erotellaan sanat v�lily�nnin perusteella ja tallennetaan ne taulukkoon
        String[] sanat = jono.split(" ");
        // K�yd��n l�pi taulukon sanat
        for(int i = 0; i < sanat.length; i++) {
            // Tulostetaan jokaisen sanan ensimm�inen kirjain ilman v�lily�nti�
            System.out.print(sanat[i].charAt(0));
        }
        // Tulostetaan rivinvaihto, jotta seuraava tuloste tulee omalle rivilleen
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Luodaan Scanner-olio k�ytt�j�n sy�tteen lukemista varten
        Scanner lukija = new Scanner(System.in);
        // Kysyt��n k�ytt�j�lt� merkkijono
        System.out.print("Sy�t� merkkijono: ");
        String jono = lukija.nextLine();
        // Kutsutaan ekatKirjaimet-metodia ja annetaan sille k�ytt�j�n sy�tt�m� merkkijono parametrina
        ekatKirjaimet(jono);
    }

}
