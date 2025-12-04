package jobsheet12;

import java.util.Scanner;

public class NilaiMahasiswa17 {
    public static void isianArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan Nilai siswa ke- " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void tampilkanArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    // static double hitTot(int[] arr) {
    // double total = 0;
    // for (int i = 0; i < arr.length; i++) {
    // total += arr[i];
    // }
    // return total;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa : ");
        int n = sc.nextInt();
        int nilai[] = new int[n];
        isianArray(nilai, sc);
        tampilkanArray(nilai);
        // double totalnilai = hitTot(nilai);
        int totalnilai = hitTot(nilai);
        System.out.println("Total seluruh nilai mahasiswa adalah " + totalnilai);
    }
}
