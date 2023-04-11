package kotitehtävä9;

import java.util.Scanner; // tuodaan Scanner-luokka käyttöön

public class KT6 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in); // luodaan uusi Scanner-olio
        System.out.print("Syötä nimesi: "); // tulostetaan pyyntö syöttää nimi
        String nimi = lukija.nextLine(); // luetaan käyttäjän syöttämä nimi
        
        // tarkistetaan käyttäjän syöttämä nimi if-lauseen avulla
        if (nimi.equals("Matti")) { // jos nimi on "Matti"
            System.out.println("Hei Matti!"); // tulostetaan "Hei Matti!"
        } else if (nimi.equals("Maija")) { // jos nimi on "Maija"
            System.out.println("Hei Maija!"); // tulostetaan "Hei Maija!"
        } else { // muussa tapauksessa
            System.out.println("Hei tuntematon henkilö!"); // tulostetaan "Hei tuntematon henkilö!"
        }
    }
}