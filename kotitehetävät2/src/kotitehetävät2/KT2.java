package kotitehetävät2;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
	    int sum = 0;
	    int a = Integer.MAX_VALUE;
	    int num;

	    System.out.println("Syötä lukuja, kunnes syötät kaksi kertaa saman luvun:");
	    num = lukija.nextInt();

	    while (num != a) {
	      sum += num;
	      a = num;
	      num = lukija.nextInt();
	    }

	    System.out.println("Lukujen summa: " + sum);
	  }
 }
