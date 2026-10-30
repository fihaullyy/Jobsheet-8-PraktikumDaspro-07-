import java.util.Scanner;
public class tugas2_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                int perkalian = i * j;
                System.out.print(perkalian + "   ");
                jumlah += perkalian;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}