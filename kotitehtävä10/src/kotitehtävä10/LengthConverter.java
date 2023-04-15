package kotiteht‰v‰10;

/**
 * Muuntaa pituuden jalkoiksi ja tuumiksi ja takaisin p‰in.
 */
public class LengthConverter {

    /**
     * Muuntaa senttimetrit jalkoiksi ja tuumiksi.
     *
     * @param cm pituus senttimetrein‰
     * @return pituus jalkoina ja tuumina muodossa "ft in"
     */
    public static String convertToFeetAndInches(double cm) {
        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;
        return feet + " ft " + inches + " in";
    }

    /**
     * Muuntaa jalkojen ja tuumien pituuden senttimetreiksi.
     *
     * @param feet jalkojen m‰‰r‰
     * @param inches tuumien m‰‰r‰
     * @return pituus senttimetrein‰
     */
    public static double convertToCentimeters(int feet, double inches) {
        double totalInches = feet * 12 + inches;
        return totalInches * 2.54;
    }
}

