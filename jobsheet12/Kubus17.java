package jobsheet12;

import java.util.Scanner;

public class Kubus17 {
    static int volumeKubus(int p) {
        int volume = p * p * p;
        return volume;
    }

    static int luasPermukaan(int p) {
        int luas = (p * p) * 6;
        return luas;
    }

    public static void main(String[] args) {
        System.out.println("Hitung Volume Kubus & Luas Pemukaan Kubus");
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Panjang rusuk: ");
        int p = sc.nextInt();
        int volum = volumeKubus(p);
        System.out.println("Volume kubus adalah " + volum);
        int Lp = luasPermukaan(p);
        System.out.println("Luas permukaan kubus adalah " + Lp);
        sc.close();
    }
}
