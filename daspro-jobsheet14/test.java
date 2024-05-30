import java.util.Scanner;

public class test {

    private static double hitungDiskon(double poinMembership) {
        if (poinMembership < 40000 ) {
            return 0;
        }else{ 
        return poinMembership - (poinMembership*0.1);
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiket = 20000;

        System.out.print("Masukkan total pembelian tiket: ");
        int totalPembelian = scanner.nextInt();
        int hasil = totalPembelian*tiket;

        double poinMembership = hitungDiskon(hasil);

        double diskon = totalPembelian * 0.1;

        System.out.println("harga tiket : Rp.20000");
        System.out.println("total pembayaran sebelum diskon : " + "Rp. " + hasil);
        System.out.println("diskon yang didapatkan : " + diskon);
        System.out.println("total pembayaran setelah diskon : " + "Rp. " + poinMembership);
    }
}