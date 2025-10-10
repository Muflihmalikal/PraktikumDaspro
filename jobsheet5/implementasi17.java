import java.util.Scanner;

public class implementasi17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Operasi Ganjil Genap ---");
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("ANgaka Tersebut Genap");
        } else {
            System.out.println("Angka Tersebut Ganjil");
        }
        sc.close();
    }
}
