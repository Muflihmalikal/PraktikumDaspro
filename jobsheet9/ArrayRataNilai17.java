package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa :");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];
        int lulus = 0, totalL = 0, T = 0;
        double total = 0;
        double rata2L, rata2T;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                totalL += nilaiMhs[i];
            } else {
                T += 1;
                total += nilaiMhs[i];
            }
        }
        rata2L = totalL / lulus;
        rata2T = total / T;
        System.out.println("Rata Rata Nilai lulus = " + rata2L);
        System.out.println("Rata Rata Nilai Tidak lulus = " + rata2T);
        sc.close();
    }
}
