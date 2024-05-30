import java.util.Scanner;

public class SistemBooking_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] judulFilm = {"Yowis Ben", "Joker", "Inception", "Pamali", "The Counjuring 2"};
        int [] hargaTiket = {40000, 40000, 40000, 40000, 40000};

        System.out.println("Daftar Film: ");
        for (int i = 0; i < judulFilm.length; i++) {
            System.out.println((i + 1) + ". " + judulFilm[i] + " - Tersedia: " + hargaTiket[i]);
        }

        System.out.print("Pilih nomor film: ");
        int pilihanFilm = input.nextInt();

        if (pilihanFilm > 0 && pilihanFilm <= judulFilm.length) {
            int i = pilihanFilm - 1;
            System.out.println("Anda memilih " + judulFilm[i]);
            System.out.print("Masukkan jumlah tiket yang diinginkan: ");
            int numTickets = input.nextInt();
                double totalHarga = numTickets * hargaTiket[i];
                System.out.println("Total harga: Rp " + totalHarga);
                System.out.println("Terima kasih telah memesan tiket!");
           
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}