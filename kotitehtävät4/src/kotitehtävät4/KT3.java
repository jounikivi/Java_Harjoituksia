package kotitehtävät4;

public class KT3 {
	public static void main(String[] args) {
        // Määritellään taulukko ja alustetaan sen arvot
        int[] taulukko = {4, 12, 0, 8, 0, 9, 6};
        // Alustetaan muuttuja "suurin" ensimmäiseksi arvoksi taulukon ensimmäinen alkio
        int suurin = taulukko[0];
        // Alustetaan muuttuja "summa" nollaksi
        int summa = 0;
        // Alustetaan muuttuja "nollat" nollaksi
        int nollat = 0;
        // Käydään läpi kaikki taulukon alkiot
        for (int i = 0; i < taulukko.length; i++) {
            // Jos taulukon alkio on suurempi kuin tähän asti suurin alkio, päivitetään "suurin" arvo
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            // Lisätään alkioiden neliöiden summaan alkion neliö
            summa += taulukko[i] * taulukko[i];
            // Jos taulukon alkio on nolla, kasvatetaan "nollat" muuttujan arvoa yhdellä
            if (taulukko[i] == 0) {
                nollat++;
            }
        }
        // Tulostetaan suurin taulukon arvo
        System.out.println("Taulukon suurin arvo on " + suurin);
        // Tulostetaan alkioiden neliöiden summa
        System.out.println("Taulukon alkioiden neliöiden summa on " + summa);
        // Tulostetaan nollien määrä taulukossa
        System.out.println("Taulukossa on " + nollat + " nollaa.");
    }
}

