package kotitehtävä1;

import java.util.Scanner;

public class KT3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Anna ensimmäinen luku: ");
        a = sc.nextInt();
        System.out.print("Anna toinen luku: ");
        b = sc.nextInt();

        System.out.print("Haluatko tulostaa suuremman vai pienemmän luvun (s/p)? ");
        String valinta = sc.next();
        if (valinta.equals("s")) {
          if (a > b) {
              System.out.println("Suurempi luku on " + a);
          }else{
              System.out.println("Suurempi luku on " + b);
          }
        } else if (valinta.equals("p")) {
          if (a < b) {
              System.out.println("Pienempi luku on " + a);
          }else{
              System.out.println("Pienempi luku on " + b);
          }
        } 
	}
}