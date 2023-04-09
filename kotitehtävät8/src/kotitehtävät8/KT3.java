package kotiteht�v�t8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KT3 {
    public static void main(String[] args) {
        // Luetaan uutisteksti tiedostosta
        File file = new File("uutisteksti.txt");
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Etsit��n kaikki sanat, joiden pituus on kymmenen tai enemm�n
        String[] words = text.split(" ");
        ArrayList<String> longWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 10) {
                longWords.add(word);
            }
        }

        // Tulostetaan pitk�t sanat n�yt�lle
        System.out.println("Pitk�t sanat:");
        for (String longWord : longWords) {
            System.out.println(longWord);
        }
    }
}


