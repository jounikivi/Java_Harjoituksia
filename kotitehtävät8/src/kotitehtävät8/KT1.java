package kotiteht�v�t8;

import java.io.*;

public class KT1 {

    public static void main(String[] args) {
        String tiedostonNimi = "tiedosto.txt";
        String etunimi = "Jouni";
        int luku = 3;

        // tiedoston kirjoittaminen
        try {
            FileWriter tiedostoKirjoittaja = new FileWriter(tiedostonNimi);
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.write(etunimi + " " + luku + "\n");
            tiedostoKirjoittaja.close();
            System.out.println("Tiedoston kirjoitus onnistui.");
        } catch (IOException e) {
            System.out.println("Tiedoston kirjoittaminen ep�onnistui: " + e.getMessage());
        }

        // tiedoston lukeminen ja tulostaminen
        try {
            FileReader tiedostoLukija = new FileReader(tiedostonNimi);
            BufferedReader puskuroituLukija = new BufferedReader(tiedostoLukija);

            String rivi;
            while ((rivi = puskuroituLukija.readLine()) != null) {
                // pilkotaan rivi v�lily�nnin kohdalta ja tallennetaan tiedot taulukkoon
                String[] tiedot = rivi.split(" ");
                // otetaan etunimi taulukosta
                String etunimi2 = tiedot[0];
                // otetaan luku taulukosta ja muunnetaan se kokonaisluvuksi
                int luku2 = Integer.parseInt(tiedot[1]);
                // tulostetaan etunimi ja luku samalle riville v�lily�nnill� erotettuna
                System.out.println(etunimi2 + " " + luku2);
            }

            puskuroituLukija.close();
            tiedostoLukija.close();
        } catch (IOException e) {
            System.out.println("Tiedoston lukeminen ep�onnistui: " + e.getMessage());
        }
    }
}



