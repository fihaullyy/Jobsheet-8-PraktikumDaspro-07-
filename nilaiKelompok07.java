import java.util.Scanner;
public class nilaiKelompok07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jmlKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jmlPenilai = sc.nextInt();

        if (jmlKelompok <= 0 || jmlPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKel = 1;
            double rataTertinggi = -1;
            int kelTerbaik = 0;

            while (nomorKel <= jmlKelompok) {
                System.out.println("Kelompok: " + nomorKel);
                double totalNilai = 0;

                for (int j = 1; j <= jmlPenilai; j++) {
                    int nilai;

                    do {
                        System.out.print(" Nilai dari penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;

                }

                double rataNilai = totalNilai / jmlPenilai;
                System.out.println("Kelompok " + nomorKel + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelTerbaik = nomorKel;
                }

                nomorKel++;
            } 
            
            System.out.println("===========================");
            System.out.println("Kelompok terbaik    : " + kelTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
    }
}