package jobsheet11;

import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa : ");
        int siswa = sc.nextInt();
        System.out.println("Masukkan Jumlah Siswa : ");
        int matkul = sc.nextInt();
        int nilai[][] = new int[siswa][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata-rata: " + totalPersiswa / nilai.length);
        }
        System.out.println("\n=================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPermatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah" + (j + 1) + ": " + totalPermatkul / nilai[0].length);
        }
        sc.close();
    }
}
