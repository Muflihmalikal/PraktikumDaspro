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
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        String pesan = uktlunas ? "Pembayaran UKT terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA" : "Pembayaran UKT belum terverifikasi\nSilahkan lakukan pembayaran terlebih dahulu";

        System.out.println("\n=== Versi Ternary Operator ===");
        System.out.println(pesan);
        in.close();
    }
}
