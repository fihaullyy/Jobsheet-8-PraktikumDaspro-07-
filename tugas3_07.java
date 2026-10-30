import java.util.Scanner;
public class tugas3_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah toko: ");
        int nomorToko = sc.nextInt();

        if (nomorToko < 1) {
            System.out.println("Jumlah toko minimal 1");
        } else {
            int totSeluruhBarang = 0;
            int jmlBarang;
            int terbanyak = -1;
            int totBarang = 0;
            int nomorPelanggan = 0;
            
            for (int i = 1; i <= nomorToko; i++) {
                // System.out.println();
                System.out.println("Toko " + i );
                do {
                    System.out.print("Jumlah Pelanggan toko " + i + ": ");
                    nomorPelanggan = sc.nextInt();
                    if (nomorPelanggan < 0) {
                        System.out.println("Pelanggan harus > 0. Inputkan ulang!");
                    }
                } while (nomorPelanggan < 0);
                
                for (int j = 1; j <= nomorPelanggan; j++) {
                    System.out.print("Pelanggan: " + j + ", total barang: ");
                    jmlBarang = sc.nextInt();
                    // System.out.println();
                    totBarang += jmlBarang;
                }
                totSeluruhBarang += totBarang;
                System.out.print("Toko " + i);
            }
            System.out.println(" - " + "pelanggan: " + nomorPelanggan + ", total barang: " + totBarang);
            System.out.println("Total barang seluruh toko: " + totSeluruhBarang);
        }
    }
}