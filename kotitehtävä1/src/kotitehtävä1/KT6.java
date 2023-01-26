package kotiteht‰v‰1;

import java.util.Scanner;

public class KT6 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna luku 1-3 v‰list‰");
		int num = lukija.nextInt();
		
		if(num ==1) {
			System.out.println("yksi");
		}
		else if(num ==2) {
			System.out.println("kaksi");
		}
		else if(num ==3 ) {
			System.out.println("kolme");
		} else {
			System.out.println("V‰‰r‰ luku");
		}
		
		
	}
}
