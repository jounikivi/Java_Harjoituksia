package kotiteht�v�t2;

import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
	    int alaraja, yl�raja, num, sum;

	    System.out.print("Anna alaraja: ");
	    alaraja = lukija.nextInt();
	    System.out.print("Anna yl�raja: ");
	    yl�raja = lukija.nextInt();

	    while (true) {
	      System.out.print("Anna luku: ");
	      num = lukija.nextInt();
	      if (num >= alaraja && num <= yl�raja) {
	        break;
	      }
	    }

	    if (num - alaraja <= yl�raja - num) {
	      sum = 0;
	      for (int i = 0; i < 3; i++) {
	        System.out.print("Anna negatiivinen luku: ");
	        sum += lukija.nextInt();
	      }
	      System.out.println("Summa: " + sum);
	    }
	  }
	}
