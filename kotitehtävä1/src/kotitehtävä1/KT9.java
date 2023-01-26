package kotiteht‰v‰1;

import java.util.Scanner;

public class KT9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Anna vuosiluku: ");
	        int vuosi = scanner.nextInt();
	        System.out.print("Anna kuukausi (1-12): ");
	        int kk = scanner.nextInt();

	        boolean boo = (vuosi % 4 == 0 && vuosi % 100 != 0) || vuosi % 400 == 0;
	        int pv;
	        if (kk == 2) {
	            if (boo) {
	                pv = 29;
	            } else {
	                pv = 28;
	            }
	        } else if (kk == 4 || kk == 6 || kk == 9 || kk == 11) {
	            pv = 30;
	        } else {
	            pv = 31;
	        }
	        
	        if (boo) {
	            System.out.println(vuosi + " on karkausvuosi.");
	        } else {
	            System.out.println(vuosi + " ei ole karkausvuosi.");
	        }
	        System.out.println("Kuukaudessa on " + pv + " p‰iv‰‰.");
	    }
	}

