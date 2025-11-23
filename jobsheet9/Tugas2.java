package jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pesanan : ");
        int n = sc.nextInt();
        sc.nextLine();
        String namaMakanan[] = new String[n];
        int harga[] = new int[n];
        int total = 0;

        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.print("Masukkan Nama Makanan :");
            namaMakanan[i] = sc.nextLine();
            System.out.print("Masukkan Harga Makanan : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println("========== Nota ==========");
        for (int j = 0; j < namaMakanan.length; j++) {
            System.out.println("Nama makanan : " + namaMakanan[j]);
            System.out.println("Harga makanan : " + harga[j]);
        }
        System.out.println("Total Biaya :" + total);
        sc.close();
    }
}
