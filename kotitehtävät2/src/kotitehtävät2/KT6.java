package kotitehtävät2;

import java.util.Random;
import java.util.Scanner;

public class KT6 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner lukija = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        int arvaus = 0; // Alustetaan käyttäjän arvaus nollaksi
        while (arvaus != num) { // Jatketaan toistoa niin kauan kunnes käyttäjä arvaa oikean luvun
            System.out.print("Arvaa luku väliltä 1-100: ");
            // Tarkistetaan, että käyttäjän syöte on kokonaisluku ja välillä 1-100
            while (!lukija.hasNextInt()) {
                System.out.println("Syötteen täytyy olla kokonaisluku!");
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
