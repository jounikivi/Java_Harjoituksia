package kotitehtävät2;

import java.util.Scanner;

public class KT2 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    int a = Integer.MAX_VALUE;
	    int num;

	    System.out.println("Syötä lukuja, kunnes syötät kaksi kertaa saman luvun:");
	    num = sc.nextInt();

	    while (num != a) {
	      sum += num;
	      a = num;
	      num = sc.nextInt();
	    }

	    System.out.println("Lukujen summa: " + sum);
	  }
	}
