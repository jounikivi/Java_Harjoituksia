package kotiteht�v�t5;

public class KT9 {
    // Metodi, joka tulostaa n�yt�lle kaikki vokaalilla alkavat sanat
    public static void tulostaVokaalialkuiset(String mjono) {
        // Jakaa annetun merkkijonon sanoiksi v�lily�ntien perusteella
        String[] sanat = mjono.split(" ");
        // K�y l�pi jokaisen sanan
        for (String sana : sanat) {
            // Ottaa sanan ensimm�isen kirjaimen pienell� kirjoitettuna
            char ensimm�inenKirjain = sana.toLowerCase().charAt(0);
            // Tarkistaa, onko ensimm�inen kirjain vokaali (a, e, i, o, u tai y)
            if (ensimm�inenKirjain == 'a' || ensimm�inenKirjain == 'e' || 
                ensimm�inenKirjain == 'i' || ensimm�inenKirjain == 'o' || 
                ensimm�inenKirjain == 'u' || ensimm�inenKirjain == 'y') {
                // Tulostaa sanan, jos se alkaa vokaalilla
                System.out.println(sana);
            }
        }
    }
    
    // Main-metodi, joka kutsuu tulostaVokaalialkuiset-metodia
    public static void main(String[] args) {
        // Testimerkkijono
        String mjono = "Aamu alkoi aurinkoisena, mutta iltaan menness� s�� viileni.";
        // Kutsuu tulostaVokaalialkuiset-metodia testimerkkijonolla
        tulostaVokaalialkuiset(mjono);
    }
}
