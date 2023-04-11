package kotiteht‰v‰9;

public class KT10 {
    public static void main(String[] args) {
        int tehtaviaYhteensa = 10;
        int tehtaviaTahansa = 8; // Oletetaan t‰ss‰ esimerkiss‰, ett‰ olet tehnyt yhteens‰ 3 kotiteht‰v‰‰ t‰h‰n menness‰.
        int tehtaviaJaljella = tehtaviaYhteensa - tehtaviaTahansa;
        int prosentteina = tehtaviaTahansa * 100 / tehtaviaYhteensa;
        System.out.println("Olet tehnyt " + tehtaviaTahansa + " kotiteht‰v‰‰, joka on " + prosentteina + "% teht‰vien kokonaism‰‰r‰st‰.");
        System.out.println("Sinulla on viel‰ " + tehtaviaJaljella + " kotiteht‰v‰‰ j‰ljell‰.");
    }
}

