package kotitehtävät4;

public class SuurinArvo {
    public static void main(String[] args) {
        
        int[] taulukko = {4, 12, 7, 8, 3, 9, 6};

        
        int suurin = taulukko[0];

        
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
        }

        System.out.println("Taulukon suurin arvo on " + suurin);
    }
}

