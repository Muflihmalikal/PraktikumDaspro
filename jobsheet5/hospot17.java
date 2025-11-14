import java.util.Scanner;

public class hospot17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sitem Hospot ---");
        System.out.print("Masukkan Civitas (Mahasiswa/Dosen) : ");
        String civitas = sc.nextLine();
        if (civitas == "satu") {
            System.out.println("Akses Wifi diberikan (dosen)");
        } else if (civitas == "Mahasiswa") {
            System.out.print("Masukkan Jumlah SKS MAhasiswa : ");
            int jmlh_sks = sc.nextInt();
            if (jmlh_sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else if (jmlh_sks < 12) {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            } else {
                System.out.println("Mahasiswa Tidak aktif");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
