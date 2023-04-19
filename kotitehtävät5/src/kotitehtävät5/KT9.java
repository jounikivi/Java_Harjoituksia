package kotitehtävät5;

public class KT9 {
    // Metodi, joka tulostaa näytölle kaikki vokaalilla alkavat sanat
    public static void tulostaVokaalialkuiset(String mjono) {
        // Jakaa annetun merkkijonon sanoiksi välilyöntien perusteella
        String[] sanat = mjono.split(" ");
        // Käy läpi jokaisen sanan
        for (String sana : sanat) {
            // Ottaa sanan ensimmäisen kirjaimen pienellä kirjoitettuna
            char ensimmäinenKirjain = sana.toLowerCase().charAt(0);
            // Tarkistaa, onko ensimmäinen kirjain vokaali (a, e, i, o, u tai y)
            if (ensimmäinenKirjain == 'a' || ensimmäinenKirjain == 'e' || 
                ensimmäinenKirjain == 'i' || ensimmäinenKirjain == 'o' || 
                ensimmäinenKirjain == 'u' || ensimmäinenKirjain == 'y') {
                // Tulostaa sanan, jos se alkaa vokaalilla
                System.out.println(sana);
            }
        }
    }
    
    // Main-metodi, joka kutsuu tulostaVokaalialkuiset-metodia
    public static void main(String[] args) {
        // Testimerkkijono
        String mjono = "Aamu alkoi aurinkoisena, mutta iltaan mennessä sää viileni.";
        // Kutsuu tulostaVokaalialkuiset-metodia testimerkkijonolla
        tulostaVokaalialkuiset(mjono);
    }
}
