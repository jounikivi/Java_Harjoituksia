package kotitehtävät8;

import java.io.*;

public class KT2 {

    public static void main(String[] args) {
        String tiedostonNimi = "tiedosto.txt";
        String tulostusNimi = "tulostus.txt";
        String etunimi = "Jouni";
        int luku = 5;

        // tiedoston kirjoittaminen
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

        // tiedoston lukeminen ja tulostaminen
        try {
            FileReader tiedostoLukija = new FileReader(tiedostonNimi);
            BufferedReader puskuroituLukija = new BufferedReader(tiedostoLukija);
            
            FileWriter tulostusKirjoittaja = new FileWriter(tulostusNimi);
            
            String rivi;
            while ((rivi = puskuroituLukija.readLine()) != null) {
                // pilkotaan rivi välilyönnin kohdalta ja tallennetaan tiedot taulukkoon
                String[] tiedot = rivi.split(" ");
                // otetaan etunimi taulukosta
                String etunimi2 = tiedot[0];
                // tulostetaan etunimi ja luku samalle riville välilyönnillä erotettuna
                tulostusKirjoittaja.write(etunimi2 + " " + luku + "\n");
            }
            
            tulostusKirjoittaja.close();
            puskuroituLukija.close();
            tiedostoLukija.close();
            System.out.println("Tiedoston lukeminen ja tulostaminen onnistui.");
        } catch (IOException e) {
            System.out.println("Tiedoston käsittely epäonnistui: " + e.getMessage());
        }
    }
}

