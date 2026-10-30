import java.util.Scanner;
public class tugas3_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah toko: ");
        int jmlToko = sc.nextInt();

        if (jmlToko < 1) {
            System.out.println("Jumlah Toko minimal 1.");
        } else {
            int barangTerbanyak = -1;
            int nomorToko = 1;
            int totSemua = 0;
            int jmlPelanggan = 0;
            int tokoBTerbnyk = 0;
            String pesan = "";

            for (int i = 1; i <= jmlToko; i++) {
                do {
                    System.out.print("Jumlah Pelanggan Toko " + i + ": ");
                    jmlPelanggan = sc.nextInt();
                    if (jmlPelanggan < 0) {
                        System.out.println("Jumlah Pelanggan harus >= 0");
                    }
                } while (jmlPelanggan < 0);
                
                int totBarang = 0;
                int jmlBarangPPel = 0;
                for (int j = 1; j <= jmlPelanggan; j++) {
                    do {
                        System.out.print("\tTotal Barang P" + j + ": ");
                        jmlBarangPPel = sc.nextInt();
                        if (jmlBarangPPel < 0) {
                            System.out.println("Jumlah Barang harus >= 0");
                        }
                    } while (jmlBarangPPel < 0);
                    totBarang += jmlBarangPPel;
                }
                pesan += "Toko " + i + " - " + "pelanggan: " + jmlPelanggan + ", total barang: " + totBarang + "\n";

                totSemua += totBarang;
                
                if (totBarang > barangTerbanyak) {
                    barangTerbanyak = totBarang;
                    tokoBTerbnyk = nomorToko;
                } 
                
                nomorToko++;
            }
            System.out.println();
            System.out.print(pesan);
            System.out.println("Total barang seluruh toko: " + totSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoBTerbnyk);
        }
    }
}
