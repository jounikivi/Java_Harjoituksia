package kotitehtävät7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KT3 {
public static void main(String[] args) {
        
        String tiedostonNimi = "testitiedosto.txt";
        String teksti = "Tämä on testiteksti.";
        
        kirjoitaTiedostoon(tiedostonNimi, teksti);
        lueTiedostosta(tiedostonNimi);
    }
    
    public static void kirjoitaTiedostoon(String tiedostonNimi, String teksti) {
        
        try {
            FileWriter kirjoitin = new FileWriter(tiedostonNimi);
            kirjoitin.write(teksti);
            kirjoitin.close();
            System.out.println("Tiedostoon kirjoittaminen onnistui.");
        } catch (IOException e) {
            System.out.println("Tiedostoon kirjoittaminen epäonnistui.");
            e.printStackTrace();
        }
    }
    
    public static void lueTiedostosta(String tiedostonNimi) {
        
        try {
            FileReader lukija = new FileReader(tiedostonNimi);
            int merkki;
            while ((merkki = lukija.read()) != -1) {
                System.out.print((char)merkki);
            }
            lukija.close();
            System.out.println("\nTiedoston lukeminen onnistui.");
        } catch (IOException e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
            e.printStackTrace();
        }
    }
}

