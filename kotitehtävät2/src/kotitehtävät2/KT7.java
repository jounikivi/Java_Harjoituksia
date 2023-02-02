package kotitehtävät2;

import java.util.Random;
import java.util.Scanner;

public class KT7 {
	public static void main(String[] args) {
		
	Scanner lukija = new Scanner(System.in);
    int valinta;
    do {
      Random random = new Random();
      int numberToGuess = random.nextInt(100) + 1;
      int arvaa;
      System.out.println("Arvaa luku väliltä 1-100:");
      while (true) {
        arvaa = lukija.nextInt();
        if (arvaa == numberToGuess) {
          System.out.println("Arvasit oikein!");
          break;
        } else if (arvaa < numberToGuess) {
          System.out.println("Arvattu luku on liian pieni");
        } else {
          System.out.println("Arvattu luku on liian suuri");
        }
      }
      System.out.println("Valitse toiminto:\n1) Arvaa uusi luku\n2) Lopeta");
      valinta = lukija.nextInt();
    } while (valinta != 2);
    System.out.println("Ohjelman suoritus päättyi.");
  }
}

