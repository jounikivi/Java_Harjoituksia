package kotiteht�v�t4;

import java.util.Scanner;

public class KT7 {
	 public static void main(String[] args) {
	      
	        int[] taulukko = {1, 3, 5, 7, 8, 9, 11, 13, 15, 17, 19};

	        Scanner lukija = new Scanner(System.in);
	        System.out.print("Sy�t� etsitt�v� luku: ");
	        int etsittava = lukija.nextInt();

	        if (etsiArvo(taulukko, etsittava)) {
	            System.out.println("L�ytyi!");
	        } else {
	            System.out.println("Ei l�ytynyt!");
	        }
	    }
	    public static boolean etsiArvo(int[] taulukko, int etsittava) {
	     
	        boolean loytyi = false;
	        for (int i = 0; i < taulukko.length && !loytyi; i++) {
	            if (taulukko[i] == etsittava) {
	                loytyi = true;
	            } else if (taulukko[i] > etsittava) {
	               
	                break;
	            }
	        }

	        return loytyi;
	    }
	
}
