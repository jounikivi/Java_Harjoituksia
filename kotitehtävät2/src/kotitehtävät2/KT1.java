package kotitehtävät2;

import java.util.Scanner;

public class KT1 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sum = 0;
        int num;
        int count = 0;

        System.out.println("Anna lukuja -1 lopettaa");
        while (lukija.hasNextInt()) { // tarkistaa, että käyttäjän syöttämä luku on kokonaisluku
            num = lukija.nextInt();
            if (num == -1) {
                break; // lopetetaan lukujen pyytäminen, jos käyttäjä syöttää -1
            }
            sum += num;
            count++;
        }

        if (count > 0) { // tarkistaa, että käyttäjä syötti vähintään yhden luvun
            double average = (double) sum / count;
            System.out.println("Summa: " + sum);
            System.out.println("Keskiarvo: " + average);
        } else {
            System.out.println("Et syöttänyt yhtään lukua.");
        }
    }
}
