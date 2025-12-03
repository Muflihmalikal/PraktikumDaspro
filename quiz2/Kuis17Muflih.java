package quiz2;

public class Kuis17Muflih {
    public static void main(String[] args) {
        int parkir17[][] = new int[5][3];
        String Kendaraan17[] = { "Mobil", "Sepeda Motor", "Sepeda", "Truk", "Bus" };
        String Area17[] = { "Outdoor", "Basement", "VIP" };
        parkir17[0][0] = 6;
        parkir17[0][1] = 8;
        parkir17[0][2] = 3;
        parkir17[1][0] = 12;
        parkir17[1][1] = 10;
        parkir17[1][2] = 2;
        parkir17[2][0] = 4;
        parkir17[2][1] = 6;
        parkir17[2][2] = 1;
        parkir17[3][0] = 2;
        parkir17[3][1] = 3;
        parkir17[3][2] = 1;
        parkir17[4][0] = 1;
        parkir17[4][1] = 2;
        parkir17[4][2] = 1;
        int totalM17 = 0;// Muflih ini untuk total Maal ya jangan lupa

        // for (int i = 0; i < parkir17.length; i++) {
        // System.out.println(Arrays.toString(parkir17[i]));
        // }
        for (int i = 0; i < parkir17[0].length; i++) {
            System.out.println("Banyaknya yang parkir di area " + Area17[i] + " Adalah :");
            int total17 = 0;
            for (int j = 0; j < parkir17.length; j++) {
                System.out.printf("%s \t\t: %s\n", Kendaraan17[j], parkir17[j][i]);
                // System.out.println(Kendaraan17[j] + " : " + parkir17[j][i]);
                total17 += parkir17[j][i];
            }
            System.out.println("Total Kendaraan di area Parkir " + Area17[i] + " :" + total17);
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < Kendaraan17.length; i++) {
            int totalK17 = 0, totalH17 = 0;
            for (int j = 0; j < Area17.length; j++) {
                totalK17 += parkir17[i][j];
            }
            if (Kendaraan17[i].equalsIgnoreCase("Sepeda")) {
                totalH17 = totalK17 * 5000;
            } else if (Kendaraan17[i].equalsIgnoreCase("Sepeda Motor")) {
                totalH17 = totalK17 * 5000;
            } else {
                totalH17 = totalK17 * 10000;
            }
            totalM17 += totalH17;
            System.out.println("Total kendaran " + Kendaraan17[i] + " Adalah " + totalK17);
            // System.out.println(totalH17);
        }
        System.out.println("Total pendapatan Mall Perhari = " + totalM17);
    }
}
