package jobsheet11;

import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        do {
            System.out.println("Pilih menu");
            System.out.println("Menu 1 : Input data penonton");
            System.out.println("Menu 2 : Tampilkan daftar penonton");
            System.out.println("Menu 3 : Exit");
            System.out.print("Masukkan Angka Menu (1-3) :");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan Baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris > penonton.length || baris < 0 || kolom > penonton[0].length || kolom < 0) {
                            System.out.println("Kursi Tidak Tersedia !!!");
                            continue;
                        }
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi Sudah Terisi !");
                            continue;
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                        }
                        System.out.print("Input pennonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                penonton[i][j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(",", penonton[i]));
                    }

                default:
                    break;
            }
        } while (menu != 3);
        sc.close();
    }
}
