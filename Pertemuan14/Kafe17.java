package Pertemuan14;

import java.util.Scanner;

public class Kafe17 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda dapatkan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda dapatkan diskon 50%");
        } else {
            System.out.println("Kode Invalid");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga17(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
        } else {
            System.out.println("Kode Invalid");
        }
        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipean: ");
        int banyakItem = sc.nextInt();
        System.out.println("Masukkan Kode Promo: ");
        String kodePromo = sc.nextLine();
        int totalHarga = hitungTotalHarga17(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pemesanan anda: Rp" + totalHarga);
        sc.close();
    }
}
