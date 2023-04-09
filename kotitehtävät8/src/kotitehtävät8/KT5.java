package kotitehtävät8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KT5 {
    public static void main(String[] args) {
        // Luetaan uutisteksti tiedostosta
        File file = new File("uutisteksti.txt");
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.nextLine() + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Etsitään kaikki sanat, joissa on yhdysviiva
        String[] words = text.split(" ");
        ArrayList<String> hyphenatedWords = new ArrayList<>();
        for (String word : words) {
            if (word.contains("-")) {
                hyphenatedWords.add(word);
            }
        }

        // Tulostetaan yhdysviivaiset sanat näytölle
        System.out.println("Yhdysviivaiset sanat:");
        for (String hyphenatedWord : hyphenatedWords) {
            System.out.println(hyphenatedWord);
        }
    }
}