package kotitehtävä1;

import java.util.Scanner;

public class KT8 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna vuosiluku: ");
		int vuosi = lukija.nextInt();
		
		if((vuosi % 4 == 0 && vuosi % 100 !=0) || vuosi % 400 == 0) {
			System.out.println(vuosi + " On karkausvuosi");
		}
		else {
			System.out.println(vuosi +  " Ei ole karkausvuosi");
		}
		
	}
}
