import java.util.Scanner;
/**
 * percobaan309
 */
public class percobaan309 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0){
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc09 = new Scanner (System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc09.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc09.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
