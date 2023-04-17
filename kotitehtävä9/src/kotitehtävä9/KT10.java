package kotiteht‰v‰9;

public class KT10 {
    public static void main(String[] args) {
    	// Alustetaan muuttuja "tehtaviaYhteensa" kotiteht‰vien kokonaism‰‰r‰ll‰
        int tehtaviaYhteensa = 10;
        // Alustetaan muuttuja "tehtaviaTahansa" tehtyjen kotiteht‰vien m‰‰r‰ll‰
        int tehtaviaTahansa = 9;
        // Lasketaan muuttujaan "tehtaviaJaljella" j‰ljell‰ olevien teht‰vien m‰‰r‰
        int tehtaviaJaljella = tehtaviaYhteensa - tehtaviaTahansa;
        // Lasketaan muuttujaan "prosentteina" tehtyjen kotiteht‰vien 
        //m‰‰r‰ prosentteina kokonaism‰‰r‰st‰
        int prosentteina = tehtaviaTahansa * 100 / tehtaviaYhteensa;
        // Tulostetaan konsoliin tieto tehtyjen kotiteht‰vien 
        //m‰‰r‰st‰ prosentteina kokonaism‰‰r‰st‰
        System.out.println("Olet tehnyt " + tehtaviaTahansa + " kotiteht‰v‰‰, joka on " 
        + prosentteina +  "% teht‰vien kokonaism‰‰r‰st‰.");
        // Tulostetaan konsoliin tieto j‰ljell‰ olevien teht‰vien m‰‰r‰st‰
        System.out.println("Sinulla on viel‰ " + tehtaviaJaljella + " kotiteht‰v‰‰ j‰ljell‰.");
    }
}

