import java.util.Scanner;

public class tugas1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Perhitungan Kuadrat=====");
        System.out.print("Masukkan Nilai N = ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int kuadrat = i * i;
            total += kuadrat;

            System.out.print("n = " + i + " jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j * j);
                if (j < i)
                    System.out.print(" + ");
            }

            System.out.println(" = " + total);
        }
        sc.close();

    }
}
