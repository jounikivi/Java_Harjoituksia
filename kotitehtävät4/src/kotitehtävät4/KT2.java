package kotiteht�v�t4;

public class KT2 {
    public static void main(String[] args) {
        // M��ritell��n kokonaislukutaulukko
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};
        
        // Alustetaan suurin- ja summa-muuttujat
        int suurin = taulukko[0];
        int summa = 0;
        
        // K�yd��n taulukon alkiot l�pi for-silmukassa
        for (int i = 0; i < taulukko.length; i++) {
            // Tarkistetaan, onko t�m�nhetkinen alkio suurin
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            // Lis�t��n t�m�nhetkisen alkion neli� summaan
            summa += taulukko[i] * taulukko[i];
        }
        
        // Tulostetaan suurin luku ja alkioiden neli�iden summa
        System.out.println("Taulukon suurin arvo on " + suurin);
        System.out.println("Taulukon alkioiden neli�iden summa on " + summa);
    }
}

