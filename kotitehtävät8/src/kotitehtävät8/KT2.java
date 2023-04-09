package kotitehtävät8;

import java.io.*;

public class KT2 {

    public static void main(String[] args) {
        String etunimi = "Jouni";
        int kokonaisluku = 5;
        
        try {
            FileWriter tiedosto = new FileWriter("tiedosto.txt");
            BufferedWriter out = new BufferedWriter(tiedosto);
            for (int i = 0; i < 3; i++) {
                out.write(etunimi + " " + kokonaisluku);
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Virhe tiedoston kirjoittamisessa: " + e.getMessage());
        }
        
        try {
            FileWriter tiedosto = new FileWriter("tulos.txt");
            BufferedWriter out = new BufferedWriter(tiedosto);
            FileReader tiedosto2 = new FileReader("tiedosto.txt");
            BufferedReader in = new BufferedReader(tiedosto2);
            String rivi;
            while ((rivi = in.readLine()) != null) {
                out.write(rivi);
                out.newLine();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Virhe tiedoston lukemisessa/kirjoittamisessa: " + e.getMessage());
        }
    }
}
