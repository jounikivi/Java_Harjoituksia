package kotitehtävät4;

public class KT2 {
	public static void main(String[] args) {
        // Määritellään kokonaislukutaulukko
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};
        int suurin = taulukko[0];
        int summa = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            summa += taulukko[i] * taulukko[i];
        }
        System.out.println("Taulukon suurin arvo on " + suurin);
        System.out.println("Taulukon alkioiden neliöiden summa on " + summa);
    }
}

