package jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        System.out.print("Masukkan pilihan menu: ");
        String pilihan = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (pilihan.equalsIgnoreCase(menu[i])) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu " + pilihan + " Tersedia");
        } else {
            System.out.println("Menu tidak tersedia!");
        }
        sc.close();
    }
}
