package kotiteht‰v‰9;

public class KT8 {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int[] count = { 0, 0, 0, 0 }; // taulukko, johon tallennetaan jokaisen v‰lialueen lukum‰‰r‰
        for (int i = 0; i < 120; i++) {
            int randomNumber = (int) (random() * (max - min + 1)) + min; // muunnetaan satunnaisluku kokonaisluvuksi v‰lilt‰ 0-100
            int range = getRange(randomNumber);
            count[range]++;
        }

        System.out.println("V‰lit:");
        System.out.println("0-25: " + count[0]);
        System.out.println("26-50: " + count[1]);
        System.out.println("51-75: " + count[2]);
        System.out.println("76-100: " + count[3]);
    }

    private static double random() {
        // palauttaa satunnaisen luvun v‰lilt‰ 0-1
        return Math.random();
    }

    private static int getRange(int number) {
        // palauttaa numeron v‰lialueen indeksin
        if (number >= 0 && number <= 25) {
            return 0;
        } else if (number >= 26 && number <= 50) {
            return 1;
        } else if (number >= 51 && number <= 75) {
            return 2;
        } else {
            return 3;
        }
    }
}

