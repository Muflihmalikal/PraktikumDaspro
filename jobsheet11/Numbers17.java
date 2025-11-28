package jobsheet11;

import java.util.Arrays;

public class Numbers17 {
    public static void main(String[] args) {
        String[][] myNumbers = new String[3][];
        myNumbers[0] = new String[5];
        myNumbers[1] = new String[3];
        myNumbers[2] = new String[1];
        myNumbers[0][1] = "Muflih";
        myNumbers[0][3] = "Dewi";
        myNumbers[0][4] = "Anin";
        // System.out.prStringln(myNumbers[0]);
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
