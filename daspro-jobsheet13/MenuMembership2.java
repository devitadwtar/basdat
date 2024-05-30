import java.util.Scanner;

public class MenuMembership2 {
    int membershipPoint = 0;
    String memberEmail; // Menyimpan email keanggotaan
    String memberPhone; // Menyimpan nomor telepon keanggotaan
    String memberPIN; // Menyimpan PIN keanggotaan
    boolean isMembershipAktif = false; // Menyimpan status keanggotaan

    public static void main(String[] args) {
        MenuMembership2 menuMembership = new MenuMembership2();
        menuMembership.runMenu();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==================================");
            System.out.println("        Selamat Datang di         ");
            System.out.println("       Program Keanggotaan        ");
            System.out.println("==================================");
            System.out.println("Menu Membership:");
            System.out.println("1. Daftar Membership");
            System.out.println("2. Perpanjang Membership");
            System.out.println("3. Lihat Informasi Membership");
            System.out.println("4. Transaksi (Dapatkan Cashback)");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-4): ");

            System.out.println(" ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    daftarMembership(scanner);
                    break;
                case 2:
                    perpanjangMembership(scanner);
                    break;
                case 3:
                    lihatInformasiMembership();
                    break;
                case 4:
                    lakukanTransaksi(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih. Keluar dari menu membership.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }

    public void daftarMembership(Scanner scanner) {
        System.out.println("Langkah-langkah mendaftar member:");
        System.out.println("1. Masukkan Email.");
        System.out.println("2. Masukkan Nomor Telepon.");
        System.out.println("3. Buat PIN dan Password.");

        System.out.print("\nApakah Anda ingin melanjutkan pendaftaran? (ya/tidak): ");
        String jawaban = scanner.next().toLowerCase();

        if (jawaban.equals("ya")) {
            System.out.print("Masukkan email untuk keanggotaan baru: ");
            memberEmail = scanner.next();

            System.out.print("Masukkan nomor telepon untuk keanggotaan baru: ");
            memberPhone = scanner.next();

            System.out.print("Masukkan PIN untuk keanggotaan baru: ");
            memberPIN = scanner.next();

            isMembershipAktif = true;
            System.out.println("Anda berhasil mendaftar sebagai member dengan data: " + memberEmail + "" + memberPhone + " " + memberPIN);
        } else {
            System.out.println("Anda memilih untuk tidak melanjutkan pendaftaran.");
        }
    }

    public void perpanjangMembership(Scanner scanner) {
        if (isMembershipAktif) {
            System.out.print("Apakah Anda ingin memperpanjang keanggotaan? (ya/tidak): ");
            String jawaban = scanner.next().toLowerCase();

            if (jawaban.equals("ya")) {
                System.out.println("==================================");
                System.out.println("     Proses Perpanjang Membership  ");
                System.out.println("==================================");
                System.out.print("Masukkan email yang telah terdaftar: ");
                String inputEmail = scanner.next();

                System.out.print("Masukkan nomor telepon yang telah terdaftar: ");
                String inputPhone = scanner.next();

                System.out.print("Masukkan PIN yang telah terdaftar: ");
                String inputPIN = scanner.next();

                if (inputEmail.equals(memberEmail) && inputPhone.equals(memberPhone) && inputPIN.equals(memberPIN)) {
                    System.out.println("Anda berhasil memperpanjang keanggotaan.");
                } else {
                    System.out.println("Email, nomor telepon, atau PIN yang dimasukkan tidak sesuai. Pembaharuan keanggotaan dibatalkan.");
                }
            } else if (jawaban.equals("tidak")) {
                System.out.println("Anda memilih untuk tidak memperpanjang keanggotaan.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih ya atau tidak.");
            }
        } else {
            System.out.println("Anda belum mendaftar sebagai member. Silakan daftar terlebih dahulu.");
        }
    }

    public void lihatInformasiMembership() {
        if (isMembershipAktif) {
            System.out.println("------Informasi Membership------");
            System.out.println("1. Membership hanya berlaku satu tahun dan harus diperbarui untuk tetap menjadi member membership.");
            System.out.println("2. Member bisa mendapatkan tiket dan FNB gratis dengan cara menukarkan Point");
            System.out.println("3. Bebas Biaya Tambahan");
            System.out.println("4. Member tidak dipungut biaya tambahan jika ingin tambah ukuran popcorn dan soft drink dari ukuran large menjadi jumbo.");
            System.out.println("5. Member CGV tidak perlu antri melalui website atau aplikasi.");
            System.out.println("6. Member akan mendapat kesempatan untuk menonton film lebih awal dari tanggal penayangan.");
            System.out.println("========================================================================================");
            System.out.println("Status keanggotaan: Aktif");
            System.out.println("Email keanggotaan: " + memberEmail);
            System.out.println("Nomor Telepon keanggotaan: " + memberPhone);
            // PIN tidak ditampilkan untuk alasan keamanan
        } else {
            System.out.println("Anda belum mendaftar sebagai member. Silakan daftar terlebih dahulu.");
        }
    }

    public void lakukanTransaksi(Scanner scanner) {
        if (isMembershipAktif) {
            System.out.println("==================================");
            System.out.println("          Proses Transaksi         ");
            System.out.println("==================================");
            System.out.print("Masukkan total transaksi: ");
            double totalTransaksi = scanner.nextDouble();

            // Anggap saja cashback 20% dari total transaksi
            double cashback = totalTransaksi * 0.20;
            int cashbackPoint = (int) cashback; // Konversi cashback menjadi point

            membershipPoint += cashbackPoint;

            System.out.println("Anda mendapatkan cashback sebesar " + cashbackPoint + " point.");
            System.out.println("Total Point Anda sekarang: " + membershipPoint);
        } else {
            System.out.println("Anda belum mendaftar sebagai member. Silakan daftar terlebih dahulu.");
        }
    }
}