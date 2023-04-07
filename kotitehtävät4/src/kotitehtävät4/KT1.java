package kotitehtävät4;

public class KT1 {
    public static void main(String[] args) {
        // Luodaan taulukko ja alustetaan se arvoilla
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};
        
        // Alustetaan muuttuja suurin ensimmäiseksi taulukon alkioksi
        int suurin = taulukko[0];
        
        // Käydään läpi taulukon alkiot ja verrataan niitä suurimpaan löydettyyn lukuun
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                // Jos taulukon alkio on suurempi kuin suurin löydetty luku, niin tallennetaan se suurimmaksi luvuksi
                suurin = taulukko[i];
            }
        }
        
        // Tulostetaan suurin löydetty luku
        System.out.println("Taulukon suurin arvo on " + suurin);
    }
}


