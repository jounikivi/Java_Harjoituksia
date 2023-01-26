package kotiteht‰v‰1;

import java.util.Scanner;

public class KT9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Anna vuosiluku: ");
	        int year = scanner.nextInt();
	        System.out.print("Anna kuukausi (1-12): ");
	        int month = scanner.nextInt();

	        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	        int daysInMonth;
	        if (month == 2) {
	            if (isLeap) {
	                daysInMonth = 29;
	            } else {
	                daysInMonth = 28;
	            }
	        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
	            daysInMonth = 30;
	        } else {
	            daysInMonth = 31;
	        }
	        
	        if (isLeap) {
	            System.out.println(year + " on karkausvuosi.");
	        } else {
	            System.out.println(year + " ei ole karkausvuosi.");
	        }
	        System.out.println("Kuukaudessa on " + daysInMonth + " p‰iv‰‰.");
	    }
	}

