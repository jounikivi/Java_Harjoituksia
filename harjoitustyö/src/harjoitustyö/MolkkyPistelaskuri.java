package harjoitustyö;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

/**
 * Tämä luokka toteuttaa Mölkky-pistelaskurin käyttöliittymän.
 */
public class MolkkyPistelaskuri extends JFrame {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Integer> pelaajat = new HashMap<String, Integer>();
	private String[] pelaajaNimet;
	private int nykyinenPelaajaIndex = 0;
	private JLabel pelaajaLabel;
	private JLabel pisteetLabel;
	private JTextField pisteetTextField;
	private JButton lisaaPisteetButton;
	private JTable taulukko;

    // ...

    /**
     * Luo uuden Mölkky-pistelaskurin käyttöliittymän.
     */
    public MolkkyPistelaskuri() {
        // ...
    }

    /**
     * Lisää annetun määrän pisteitä nykyiselle pelaajalle.
     * @throws NumberFormatException jos pisteetTextField ei sisällä kokonaislukua.
     */
    private void lisaaPisteet() throws NumberFormatException {
        // ...
    }

    /**
     * Ohjelman aloitusmetodi.
     * @param args komentorivin parametrit
     */
    public static void main(String[] args) {
        new MolkkyPistelaskuri();
    }
}
public class MolkkyPistelaskuri extends JFrame {

    /** Pelaajien nimet ja pisteet. */
    private HashMap<String, Integer> pelaajat = new HashMap<String, Integer>();

    /** Nykyisen pelaajan indeksi pelaajaNimet-taulukossa. */
    private int nykyinenPelaajaIndex = 0;

    /**
     * Luo uuden Mölkky-pistelaskurin käyttöliittymän.
     */
    public MolkkyPistelaskuri() {
        // ...
    }

    /**
     * Lisää annetun määrän pisteitä nykyiselle pelaajalle.
     * @throws NumberFormatException jos pisteetTextField ei sisällä kokonaislukua.
     */
    private void lisaaPisteet() throws NumberFormatException {
        // ...
    }

    /**
     * Ohjelman aloitusmetodi.
     * @param args komentorivin parametrit
     */
    public static void main(String[] args) {
        new MolkkyPistelaskuri();
    }
}



       

