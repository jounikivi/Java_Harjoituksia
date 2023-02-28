package kotitehtävät4;

public class KT4 {
	public static void main(String[] args) {
        int[] taulukko = {4, 12, 0, 8, 0, 9, 6};
        int suurin = taulukko[0];
        int summa = 0;
        int nollat = 0;
        boolean samatArvot = false;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            summa += taulukko[i] * taulukko[i];
            if (taulukko[i] == 0) {
                nollat++;
            }
            for (int j = i + 1; j < taulukko.length; j++) {
                if (taulukko[i] == taulukko[j]) {
                    samatArvot = true;
                }
            }
        }
        System.out.println("Taulukon suurin arvo on " + suurin);
        System.out.println("Taulukon alkioiden neliöiden summa on " + summa);
        System.out.println("Taulukossa on " + nollat + " nollaa.");
        if (samatArvot) {
            System.out.println("Taulukossa esiintyy vähintään kaksi samaa arvoa.");
        } else {
            System.out.println("Taulukossa ei esiinny kahta samaa arvoa.");
        }
    }
}

