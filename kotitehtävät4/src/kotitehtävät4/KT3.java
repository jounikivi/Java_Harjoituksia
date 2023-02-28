package kotitehtävät4;

public class KT3 {
	public static void main(String[] args) {
        int[] taulukko = {4, 12, 0, 8, 0, 9, 6};
        int suurin = taulukko[0];
        int summa = 0;
        int nollat = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            summa += taulukko[i] * taulukko[i];
            if (taulukko[i] == 0) {
                nollat++;
            }
        }
        System.out.println("Taulukon suurin arvo on " + suurin);
        System.out.println("Taulukon alkioiden neliöiden summa on " + summa);
        System.out.println("Taulukossa on " + nollat + " nollaa.");
    }

}
