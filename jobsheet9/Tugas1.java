package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double rata;

        System.out.print("Masukkan Jumlah Nilai : ");
        int n = sc.nextInt();
        int bil[] = new int[n];

        int tinggi = 0, rendah = 0;

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa :");
            bil[i] = sc.nextInt();
            total += bil[i];
            if (i == 0) {
                tinggi = bil[i];
                rendah = bil[i];
            } else {
                if (bil[i] > tinggi) {
                    tinggi = bil[i];
                }
                if (bil[i] < rendah) {
                    rendah = bil[i];
                }
            }
        }

        rata = (double) total / bil.length;
        System.out.println("====================");
        System.out.println("Nilai Rata Rata Mahasiswa : " + rata);
        System.out.println("Nilai Tertinggi Mahasiswa : " + tinggi);
        System.out.println("Nilai Terendah  Mahasiswa : " + rendah);
        System.out.println("Semua nilai Mahasiswa");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("Nilai Mahasiswa : " + bil[i]);
        }
        sc.close();
    }
}
