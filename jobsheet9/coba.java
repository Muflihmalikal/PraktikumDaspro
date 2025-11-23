package jobsheet9;

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array berfungsi sebagai tempat penyimpanan sementara soal e kita belum
        // mengenal database
        // jadi istilah e tempat penyimpanan dengan tipe data yang sama terus nama
        // variabel e sama
        // contoh kita pingin masukkan nama rudi,budi dan andi
        // ini tidak pakai arrray penulisan harus

        // String namasiswa1 = "rudi";
        // String namasiswa2 = "budi";
        // String namasiswa3 = "andi";
        // //itu semua bisa disingkat dengan
        // String namasiswa[] = {"rudi","budi","andi"};
        // //paham kah????

        int array[] = { 4, 6, 3, 7, 3, 5, 2, 1, 8, 9 };
        int smt[] = new int[10];
        int n;
        System.out.println("Masukkan Nilai :");
        n = sc.nextInt();
        // instalasi array yang memiliki kolom sebanyak 10 kolom
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                smt[i] = i;
                System.out.println("nilai yang sama dengan  " + n + " berada dalam array ke  " + smt[i]);
            }
        }
        sc.close();
    }
}
