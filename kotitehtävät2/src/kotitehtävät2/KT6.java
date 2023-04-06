package kotiteht�v�t2;

import java.util.Random;
import java.util.Scanner;

public class KT6 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        int arvaus = 0; // Alustetaan k�ytt�j�n arvaus nollaksi
        while (arvaus != num) { // Jatketaan toistoa niin kauan kunnes k�ytt�j� arvaa oikean luvun
            System.out.print("Arvaa luku v�lilt� 1-100: ");
            // Tarkistetaan, ett� k�ytt�j�n sy�te on kokonaisluku ja v�lill� 1-100
            while (!lukija.hasNextInt()) {
                System.out.println("Sy�tteen t�ytyy olla kokonaisluku!");
                lukija.next();
            }
            arvaus = lukija.nextInt();
            if (arvaus == num) {
                System.out.println("Arvasit oikein!");
            } else if (arvaus < num) {
                System.out.println("Arvattu luku on liian pieni");
            } else {
                System.out.println("Arvattu luku on liian suuri");
            }
        }
        lukija.close();
    }
}
