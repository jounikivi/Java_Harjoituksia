package kotitehtävät6;

public class KT3 {
	 public static void main(String[] args) {
		 checkAge(18); 
		 checkAge(25); 
		 checkAge(0); 
		 checkAge(-1); 
		 checkAge(120); 
	    }

	    public static void checkAge(int age) {
	        if (age >= 0 && age < 18) {
	            System.out.println("Olet alaikäinen");
	        } else if (age >= 18 && age <= 119) {
	            System.out.println("Olet aikuinen");
	        } else {
	            System.out.println("Virheellinen ikä");
	        }
	    }
	}

