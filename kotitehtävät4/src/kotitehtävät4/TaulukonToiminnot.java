package kotitehtävät4;

public class TaulukonToiminnot {
    public static void main(String[] args) {
        int[] taulukko = {2, 5, 9, 8, 4, 3, 6, 1, 7};
        int suurin = taulukko[0];
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
        }
        System.out.println("Taulukon suurin arvo on: " + suurin);
        int summa = 0;
        for (int i = 0; i < taulukko.length; i++) {
            summa += taulukko[i] * taulukko[i];
        }
        System.out.println("Taulukon alkioiden neliöiden summa on: " + summa);
        int nollat = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == 0) {
                nollat++;
            }
        }
        System.out.println("Taulukossa on " + nollat + " nollaa.");
        boolean onkoNolla = false;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == 0) {
                onkoNolla = true;
                break;
            }
        }
        if (onkoNolla) {
            System.out.println("Taulukossa on vähintään yksi nolla.");
        } else {
            System.out.println("Taulukossa ei ole yhtään nollaa.");
        }
        boolean onkoDuplikaatti = false;
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = i + 1; j < taulukko.length; j++) {
                if (taulukko[i] == taulukko[j]) {
                    onkoDuplikaatti = true;
                    break;
                }
            }
            if (onkoDuplikaatti) {
                break;
            }
        }
        if (onkoDuplikaatti) {
            System.out.println("Taulukossa on vähintään kaksi samaa arvoa.");
        } else {
            System.out.println("Taulukossa ei ole kahta samaa arvoa.");
        }
    }
}

