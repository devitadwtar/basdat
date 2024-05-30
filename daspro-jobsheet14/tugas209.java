import java.util.Scanner;

public class tugas209 {

    public static int penjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int total = penjumlahan(n);
        System.out.println("Hasil penjumlahan bilangan dari 1 sampai " + n + " adalah " + total);

        System.out.println("Proses penjumlahan:");
        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil += i;
            System.out.print(i + " + ");
        }
        System.out.print("= " + hasil);
    }
}