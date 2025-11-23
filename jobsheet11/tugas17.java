package jobsheet11;

import java.util.Scanner;

public class tugas17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil[][] = new int[10][6];
        int totalR[] = new int[10];
        int totalP[] = new int[6];
        double totalS = 0;
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("Input review survey responden ke- " + (i + 1));
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print("Masukkan Nilai pertanyaan ke- " + (j + 1) + " rentang (1 - 5) : ");
                int nilai = sc.nextInt();
                hasil[i][j] = nilai;
                totalR[i] += hasil[i][j];
            }
            double rataR = totalR[i] / hasil[0].length;
            System.out.println("Nilai rata rata responden ke- " + (i + 1) + "adalah " + rataR);
        }
        System.out.println("====Rata Rata Pertanyaan====");
        System.out.println("Rata - rata setiap Pertanyaan :");
        for (int j = 0; j < hasil[0].length; j++) {
            for (int i = 0; i < hasil.length; i++) {
                totalP[j] += hasil[i][j];
            }
            double rataP = totalP[j] / hasil.length;
            System.out.println("Rata - Rata Pertanyaan Ke-" + (j + 1) + " : " + rataP);
        }
        System.out.println("====Rata Rata Keseluruhan====");
        System.out.println("Rata - rata Keseluruhan :");
        for (int i = 0; i < hasil.length; i++) {
            totalS += totalR[i];
        }
        double rataS = totalS / (hasil.length * hasil[0].length);
        System.out.println("Rata - Rata Keseluruhan : " + rataS);
        sc.close();
    }
}
