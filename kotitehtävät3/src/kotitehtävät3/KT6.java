package kotitehtävät3;

import java.util.Scanner;

public class KT6 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        boolean jatka = true;
        
        while (jatka) {
            System.out.println("Valitse kivi, paperi tai sakset (k/p/s):");
            String pelaajanValinta = lukija.nextLine();
            
            String tietokoneenValinta = arvoTietokoneenValinta();
            System.out.println("Tietokone valitsi " + tietokoneenValinta);
            
            String tulos = pelaa(pelaajanValinta, tietokoneenValinta);
            System.out.println(tulos);
            
            System.out.println("Haluatko jatkaa pelia? (k/e)");
            String vastaus = lukija.nextLine();
            if (vastaus.equals("e")) {
                jatka = false;
            }
        }
    }
    
    public static String arvoTietokoneenValinta() {
        int arvottuLuku = (int) (Math.random() * 3);
        if (arvottuLuku == 0) {
            return "kivi";
        } else if (arvottuLuku == 1) {
            return "paperi";
        } else {
            return "sakset";
        }
    }
    
    public static String pelaa(String pelaajanValinta, String tietokoneenValinta) {
        if (pelaajanValinta.equals(tietokoneenValinta)) {
            return "Tasapeli!";
        } else if (pelaajanValinta.equals("k") && tietokoneenValinta.equals("s") || 
                   pelaajanValinta.equals("p") && tietokoneenValinta.equals("k") ||
                   pelaajanValinta.equals("s") && tietokoneenValinta.equals("p")) {
            return "Voitit!";
        } else {
            return "Havisit!";
        }
}
}
