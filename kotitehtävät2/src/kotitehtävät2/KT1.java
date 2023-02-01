package kotitehtävät2;

import java.util.Scanner;

public class KT1 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int sum = 0;
		int num;
		
		System.out.println("Anna lukuja -1 lopettaa");
		num = lukija.nextInt();
		
		while (num != -1) {
			sum += num;
			num = lukija.nextInt();
		}
		
		System.out.println("Summa: " + sum);
	}
	
}
