package kotitehtävät2;

import java.util.Random;
import java.util.Scanner;

public class KT6 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner lukija = new Scanner(System.in);
		int num = r.nextInt(100) + 1;
		int arvaus;
		while(true) {
			System.out.print("Arvaa luku väliltä 1-100: ");
		      arvaus = lukija.nextInt();
		      if (arvaus == num) {
		        System.out.println("Arvasit oikein!");
		        break;
		      } else if (arvaus < num) {
		        System.out.println("Arvattu luku on liian pieni");
		      } else {
		        System.out.println("Arvattu luku on liian suuri");
		      }
		    }
		  }
		}
