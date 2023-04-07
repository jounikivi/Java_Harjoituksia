package kotitehtävät4;

public class KT2 {
    public static void main(String[] args) {
        // Määritellään kokonaislukutaulukko
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};
        
        // Alustetaan suurin- ja summa-muuttujat
        int suurin = taulukko[0];
        int summa = 0;
        
        // Käydään taulukon alkiot läpi for-silmukassa
        for (int i = 0; i < taulukko.length; i++) {
            // Tarkistetaan, onko tämänhetkinen alkio suurin
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            // Lisätään tämänhetkisen alkion neliö summaan
            summa += taulukko[i] * taulukko[i];
        }
        
        // Tulostetaan suurin luku ja alkioiden neliöiden summa
        System.out.println("Taulukon suurin arvo on " + suurin);
        System.out.println("Taulukon alkioiden neliöiden summa on " + summa);
    }
}

