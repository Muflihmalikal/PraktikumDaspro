import java.util.Scanner;

public class perpustakaan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sitem Perpustakaan ---");
        System.out.print("Apakah Mahasiswa Membawa Kartu? (true/false) : ");
        boolean kartu = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa Sudah Regristrasi Online? (true/false) : ");
        boolean regis = sc.nextBoolean();
        if (kartu || regis == true) {
            System.out.println("Mahasiswa Boleh masuk");
        } else {
            System.out.println("Mahasiswa Dilarang Masuk");
        }
        sc.close();
    }
}
