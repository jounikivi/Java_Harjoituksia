package kotiteht�v�t4;

public class KT1 {
    public static void main(String[] args) {
        // Luodaan taulukko ja alustetaan se arvoilla
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};
        
        // Alustetaan muuttuja suurin ensimm�iseksi taulukon alkioksi
        int suurin = taulukko[0];
        
        // K�yd��n l�pi taulukon alkiot ja verrataan niit� suurimpaan l�ydettyyn lukuun
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                // Jos taulukon alkio on suurempi kuin suurin l�ydetty luku, niin tallennetaan se suurimmaksi luvuksi
                suurin = taulukko[i];
            }
        }
        
        // Tulostetaan suurin l�ydetty luku
        System.out.println("Taulukon suurin arvo on " + suurin);
    }
}


