package kotitehtävät8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KT4 {
    public static void main(String[] args) {
        // Avataan tiedosto ja luetaan sen sisältö String-muuttujaan
        String text = "";
        try {
            File file = new File("uutisteksti.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löydy.");
            e.printStackTrace();
        }

        // Erotellaan sanat välilyönneillä ja tallennetaan ne taulukkoon
        String[] words = text.split("\\s+");

        // Käydään läpi kaikki sanat ja tulostetaan ne, joiden pituus on vähintään 10
        for (String word : words) {
            if (word.length() >= 10) {
                System.out.println(word);
            }
        }
    }
}

