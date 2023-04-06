package kotiteht�v�t2;

import java.util.Scanner;

public class KT1 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sum = 0;
        int num;
        int count = 0;

        System.out.println("Anna lukuja -1 lopettaa");
        while (lukija.hasNextInt()) { // tarkistaa, ett� k�ytt�j�n sy�tt�m� luku on kokonaisluku
            num = lukija.nextInt();
            if (num == -1) {
                break; // lopetetaan lukujen pyyt�minen, jos k�ytt�j� sy�tt�� -1
            }
            sum += num;
            count++;
        }

        if (count > 0) { // tarkistaa, ett� k�ytt�j� sy�tti v�hint��n yhden luvun
            double average = (double) sum / count;
            System.out.println("Summa: " + sum);
            System.out.println("Keskiarvo: " + average);
        } else {
            System.out.println("Et sy�tt�nyt yht��n lukua.");
        }
    }
}
