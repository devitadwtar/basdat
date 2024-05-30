import java.util.Scanner;

public class fungsikel {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        pesanTiket();
    }

    private static void displayMetodePembayaran() {
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Kartu Kredit");
        System.out.println("2. Transfer Bank");
        System.out.println("3. Dana");
        System.out.println("4. Shoope pay");
        System.out.println("5. Link aja");
        System.out.println("6. Ovo");
    }

    private static void pesanTiket() {
        System.out.println("Proses pemesanan tiket...");
        // Proses pemesanan tiket...

        // Setelah pemesanan berhasil, tampilkan pilihan metode pembayaran
        displayMetodePembayaran();

        int metodePembayaran = getMetodePembayaran();

        if (!isValidMetodePembayaran(metodePembayaran)) {
            System.out.println("Nomor metode pembayaran tidak valid. Silakan coba lagi.");
            pesanTiket(); // Rekursif: Memanggil kembali fungsi jika nomor metode pembayaran tidak valid
        } else {
            // Lanjutkan dengan proses pembayaran sesuai metode yang dipilih
            processPembayaran(metodePembayaran);
        }
    }

    private static int getMetodePembayaran() {
        System.out.print("Masukkan nomor metode pembayaran: ");
        return scanner.nextInt();
    }

    private static boolean isValidMetodePembayaran(int metode) {
        return metode >= 1 && metode <= 6;
    }

    private static void processPembayaran(int metode) {
        switch (metode) {
            case 1:
                System.out.println("Anda memilih pembayaran dengan Kartu Kredit.");
                break;
            case 2:
                System.out.println("Anda memilih pembayaran dengan Transfer Bank.");
                break;
            case 3:
                System.out.println("Anda memilih pembayaran dengan Dana.");
                break;
            case 4:
                System.out.println("Anda memilih pembayaran dengan Shoope Pay");
                break;
            case 5:
                System.out.println("Anda memilih pembayaran dengan Link aja");
                break;
            case 6:
                System.out.println("Anda memilih pembayaran dengan Ovo");
                break;
        }

        // Proses pembayaran...
        System.out.println("Selanjutnya >>");
    }
}
