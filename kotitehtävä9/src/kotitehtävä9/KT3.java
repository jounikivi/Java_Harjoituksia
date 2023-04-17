package kotiteht‰v‰9;

public class KT3 {
	public static void main(String[] args) {
	    // Alustetaan muuttuja i arvolla 1
	    int i = 1;
	    // Suoritetaan silmukka v‰hint‰‰n kerran
	    // ja niin kauan kuin i on pienempi tai yht‰suuri kuin 10
	    do {
	        // Alustetaan doublet-muuttuja arvolla 2
	        int doublet = 1 * 2;
	        // Tulostetaan i:n arvo, tekstin "times two equals" ja doublet-muuttujan arvo
	        System.out.println(i + " times two equals " + doublet);
	        // Lis‰t‰‰n i:n arvoa yhdell‰ jokaisella silmukan suorituskerralla
	        i++;
	    } while (i <= 10); // Tarkistetaan ehto, joka m‰‰ritt‰‰, suoritetaanko silmukka uudelleen vai ei
	    // Tulostetaan "End of program"
	    System.out.println("End of program");
	}

}
