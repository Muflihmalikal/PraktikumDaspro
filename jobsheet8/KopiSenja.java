import java.util.Scanner;

public class KopiSenja {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = input.nextInt();

        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.println("\n=== Input Data Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {

            System.out.println("\nCabang " + i);
            System.out.print("  Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = input.nextInt();

            int totalItemCabang = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                System.out.print("    Jumlah item yang dipesan pelanggan " + p + ": ");
                int item = input.nextInt();
                totalItemCabang += item;
            }

            // Ringkasan untuk cabang
            System.out.println("\nRingkasan Cabang " + i + ":");
            System.out.println("  Total pelanggan : " + jumlahPelanggan);
            System.out.println("  Total item terjual : " + totalItemCabang);

            // Akumulasi total semua cabang
            totalPelangganSemua += jumlahPelanggan;
            totalItemSemua += totalItemCabang;
        }

        // Ringkasan keseluruhan
        System.out.println("\n=== RINGKASAN KESELURUHAN ===");
        System.out.println("Total pelanggan semua cabang : " + totalPelangganSemua);
        System.out.println("Total item terjual semua cabang : " + totalItemSemua);

        input.close();
    }
}
