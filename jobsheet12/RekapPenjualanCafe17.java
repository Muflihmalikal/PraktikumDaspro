package jobsheet12;

import java.util.Scanner;

public class RekapPenjualanCafe17 {
    public static void inputdata(int[][] arr, String[] menu, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan data " + menu[i] + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Hari Ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanArray(int[][] arr, String[] menu) {
        System.out.printf("------------------------------------------------------------%n");
        System.out.printf("                    Rekap Penjualan Kafe                    %n");
        System.out.printf("------------------------------------------------------------%n");
        System.out.printf("| %-14s |", "Hari Ke-");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.printf("| %2s |", i + 1);
        }
        System.out.println();
        System.out.printf("------------------------------------------------------------%n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("| %-15s|", menu[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("| %2s |", arr[i][j]);
            }
            System.out.println();
            System.out.printf("------------------------------------------------------------%n");
        }
    }

    public static void penjualanTertinggi(int[][] arr, String[] m) {
        int tertinggi = 0;
        int cari = 0;
        int[] total = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int totl = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totl += arr[i][j];
            }
            total[i] = totl;
            if (i == 0) {
                tertinggi = total[i];
            } else {
                if (total[i] > tertinggi) {
                    tertinggi = total[i];
                }
            }
        }
        for (int i = 0; i < total.length; i++) {
            if (tertinggi == total[i]) {
                cari = i;
                break;
            }
        }
        if (cari == 0) {
            System.out.println("Menu tidak ditemukan");
        } else {
            System.out.println("Menu dengan total penjualan tertinggi adalah " + m[cari]);
            System.out.println("Dengan total penjualan  " + total[cari]);
        }
    }

    public static void rata2(int[][] arr, String[] menu) {
        double[] total = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double totl = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totl += arr[i][j];
            }
            total[i] = totl / arr[0].length;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Rata Rata penjualan dari " + menu[i] + " Adalah " + total[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = new int[5][7];
        String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
        inputdata(data, menu, sc);
        tampilkanArray(data, menu);
        penjualanTertinggi(data, menu);
        rata2(data, menu);
    }
}
