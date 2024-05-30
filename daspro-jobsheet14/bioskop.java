import java.util.Scanner;

public class bioskop {

    private static double hitungDiskon(double poinMembership) {
        if (poinMembership < 10000) {
            return 0;
        }

        return poinMembership * 0.1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total pembelian tiket: ");
        double totalPembelian = scanner.nextDouble();

        double poinMembership = hitungDiskon(totalPembelian);

        double totalPembayaran = totalPembelian - poinMembership;

        System.out.println("Diskon yang diterima: " + poinMembership);
        System.out.println("Total pembayaran setelah diskon: " + totalPembayaran);
    }
}
