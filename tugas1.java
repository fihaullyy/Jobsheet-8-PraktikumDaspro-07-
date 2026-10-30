import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan n = ");
        int n = sc.nextInt();
        int totalAngka = 0;
        int jumlah = 0;
        
        for (int i = 1; i <= n; i++) {
            int angka = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                jumlah++;
                angka++;
            }
            totalAngka = jumlah;
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
}