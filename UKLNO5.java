import java.util.Scanner;

public class UKLNO5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Jumlah Siswa");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n==============================");
        System.out.println("Total Nilai : " + totalNilai);
        System.out.println("Rata-Rata Nilai : " + rataRata);

        input.close();
    
    }
}
