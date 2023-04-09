package kotitehtävät8;

import java.io.*;

public class KT3 {

    public static void main(String[] args) {
        String tiedostonNimi = "tiedosto.txt";
        String tulostusNimi = "tulostus.txt";
        
        // pyydetään käyttäjältä merkkijono ja kokonaisluku
        java.util.Scanner lukija = new java.util.Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.print("Anna kokonaisluku: ");
        int luku = lukija.nextInt();
        
        // tiedoston kirjoittaminen
        try {
            FileWriter tiedostoKirjoittaja = new FileWriter(tiedostonNimi);
            tiedostoKirjoittaja.write(merkkijono + " " + luku + "\n");
            tiedostoKirjoittaja.write(merkkijono + " " + luku + "\n");
            tiedostoKirjoittaja.write(merkkijono + " " + luku + "\n");
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
                // otetaan merkkijono taulukosta
                String merkkijono2 = tiedot[0];
                // tulostetaan merkkijono ja luku samalle riville välilyönnillä erotettuna
                tulostusKirjoittaja.write(merkkijono2 + " " + luku + "\n");
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



