import java.util.Scanner;

public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah Lunas? (true/false): ");
        boolean uktlunas = in.nextBoolean();
        if (uktlunas) {
            System.out.println("Pembayaran UKT terferifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        }
    }
}
