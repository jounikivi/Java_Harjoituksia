package kotiteht�v�9;

import java.util.Scanner; // tuodaan Scanner-luokka k�ytt��n

public class KT6 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in); // luodaan uusi Scanner-olio
        System.out.print("Sy�t� nimesi: "); // tulostetaan pyynt� sy�tt�� nimi
        String nimi = lukija.nextLine(); // luetaan k�ytt�j�n sy�tt�m� nimi
        
        // tarkistetaan k�ytt�j�n sy�tt�m� nimi if-lauseen avulla
        if (nimi.equals("Matti")) { // jos nimi on "Matti"
            System.out.println("Hei Matti!"); // tulostetaan "Hei Matti!"
        } else if (nimi.equals("Maija")) { // jos nimi on "Maija"
            System.out.println("Hei Maija!"); // tulostetaan "Hei Maija!"
        } else { // muussa tapauksessa
            System.out.println("Hei tuntematon henkil�!"); // tulostetaan "Hei tuntematon henkil�!"
        }
    }
}