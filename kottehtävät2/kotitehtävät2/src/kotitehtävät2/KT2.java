package kotiteht�v�t2;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    int previous = Integer.MAX_VALUE;
	    int number;

	    System.out.println("Sy�t� lukuja, kunnes sy�t�t kaksi kertaa saman luvun:");
	    number = sc.nextInt();

	    while (number != previous) {
	      sum += number;
	      previous = number;
	      number = sc.nextInt();
	    }

	    System.out.println("Lukujen summa: " + sum);
	  }
	}

