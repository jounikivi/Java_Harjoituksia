package kotitehtävä9;

public class KT10 {
    public static void main(String[] args) {
    	// Alustetaan muuttuja "tehtaviaYhteensa" kotitehtävien kokonaismäärällä
        int tehtaviaYhteensa = 10;
        // Alustetaan muuttuja "tehtaviaTahansa" tehtyjen kotitehtävien määrällä
        int tehtaviaTahansa = 9;
        // Lasketaan muuttujaan "tehtaviaJaljella" jäljellä olevien tehtävien määrä
        int tehtaviaJaljella = tehtaviaYhteensa - tehtaviaTahansa;
        // Lasketaan muuttujaan "prosentteina" tehtyjen kotitehtävien 
        //määrä prosentteina kokonaismäärästä
        int prosentteina = tehtaviaTahansa * 100 / tehtaviaYhteensa;
        // Tulostetaan konsoliin tieto tehtyjen kotitehtävien 
        //määrästä prosentteina kokonaismäärästä
        System.out.println("Olet tehnyt " + tehtaviaTahansa + " kotitehtävää, joka on " 
        + prosentteina +  "% tehtävien kokonaismäärästä.");
        // Tulostetaan konsoliin tieto jäljellä olevien tehtävien määrästä
        System.out.println("Sinulla on vielä " + tehtaviaJaljella + " kotitehtävää jäljellä.");
    }
}

