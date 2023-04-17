package kotiteht‰v‰9;

public class KT9 {
public static void main(String[] args) {
	// M‰‰ritell‰‰n double-tyyppinen taulukko nimelt‰ "prices" ja alustetaan se kolmella hinnalla
	double[] prices = {14.90, 129, 49.90};

	// For-each -silmukka k‰y l‰pi taulukon "prices" jokaisen alkion ja tallentaa sen muuttujaan "price"
	for (double price : prices) {
	    // Tulostetaan "price"-muuttujan arvo konsoliin
	    System.out.println(price);
	}

}
}
