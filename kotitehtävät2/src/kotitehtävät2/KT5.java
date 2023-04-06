package kotiteht‰v‰t2;

import java.util.Scanner;

public class KT5 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int alaraja, yl‰raja, num, sum = 0;

        // Kysyt‰‰n k‰ytt‰j‰lt‰ alaraja ja yl‰raja lukualueelle
        System.out.print("Anna alaraja: ");
        alaraja = lukija.nextInt();
        System.out.print("Anna yl‰raja: ");
        yl‰raja = lukija.nextInt();

        // Pyydet‰‰n k‰ytt‰j‰lt‰ luku, kunnes se on lukualueen sis‰ll‰
        do {
            System.out.print("Anna luku (" + alaraja + ".." + yl‰raja + "): ");
            num = lukija.nextInt();
        } while (num < alaraja || num > yl‰raja);

        // Jos k‰ytt‰j‰n antama luku on l‰hemp‰n‰ alarajaa, pyydet‰‰n k‰ytt‰j‰lt‰ kolme negatiivista 
        // lukua
        // ja lasketaan niiden summa
        if (num - alaraja <= yl‰raja - num) {
            for (int i = 0; i < 3; i++) {
                int luku;
                do {
                    System.out.print("Anna negatiivinen luku: ");
                    luku = lukija.nextInt();
                } while (luku >= 0);

                sum += luku;
            }
            System.out.println("Negatiivisten lukujen summa: " + sum);
        }
    }
}

