package kotiteht�v�t8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KT4 {
    public static void main(String[] args) {
        // Avataan tiedosto ja luetaan sen sis�lt� String-muuttujaan
        String text = "";
        try {
            File file = new File("uutisteksti.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei l�ydy.");
            e.printStackTrace();
        }

        // Erotellaan sanat v�lily�nneill� ja tallennetaan ne taulukkoon
        String[] words = text.split("\\s+");

        // K�yd��n l�pi kaikki sanat ja tulostetaan ne, joiden pituus on v�hint��n 10
        for (String word : words) {
            if (word.length() >= 10) {
                System.out.println(word);
            }
        }
    }
}

