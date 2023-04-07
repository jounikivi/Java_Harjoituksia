package kotiteht�v�t4;

public class KT3 {
	public static void main(String[] args) {
        // M��ritell��n taulukko ja alustetaan sen arvot
        int[] taulukko = {4, 12, 0, 8, 0, 9, 6};
        // Alustetaan muuttuja "suurin" ensimm�iseksi arvoksi taulukon ensimm�inen alkio
        int suurin = taulukko[0];
        // Alustetaan muuttuja "summa" nollaksi
        int summa = 0;
        // Alustetaan muuttuja "nollat" nollaksi
        int nollat = 0;
        // K�yd��n l�pi kaikki taulukon alkiot
        for (int i = 0; i < taulukko.length; i++) {
            // Jos taulukon alkio on suurempi kuin t�h�n asti suurin alkio, p�ivitet��n "suurin" arvo
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
            // Lis�t��n alkioiden neli�iden summaan alkion neli�
            summa += taulukko[i] * taulukko[i];
            // Jos taulukon alkio on nolla, kasvatetaan "nollat" muuttujan arvoa yhdell�
            if (taulukko[i] == 0) {
                nollat++;
            }
        }
        // Tulostetaan suurin taulukon arvo
        System.out.println("Taulukon suurin arvo on " + suurin);
        // Tulostetaan alkioiden neli�iden summa
        System.out.println("Taulukon alkioiden neli�iden summa on " + summa);
        // Tulostetaan nollien m��r� taulukossa
        System.out.println("Taulukossa on " + nollat + " nollaa.");
    }
}

