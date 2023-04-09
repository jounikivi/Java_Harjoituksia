package kotitehtävät8;

import java.io.*;

public class KT1 {

    public static void main(String[] args) {
        String tiedostonNimi = "tiedosto.txt";
        String etunimi = "Matti";
        int luku = 3;

        try {
            FileWriter tiedostoKirjoittaja = new FileWriter(tiedostonNimi);
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.close();
            System.out.println("Tiedoston kirjoitus onnistui.");
        } catch (IOException e) {
            System.out.println("Tiedoston kirjoittaminen epäonnistui: " + e.getMessage());
        }
    }
}

