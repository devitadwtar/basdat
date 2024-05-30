import java.util.Scanner;
public class KelompokJobsheet6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilihan_film, hari, menu, PesanMkn, PesanMnm;
        int Harga_Awal, umur_penonton, tanggal, tahun, bulan, makanan, minuman,poin = 0, gratisMinum;
        double Prosentase_Diskon =0.20, Harga_Akhir, Pembayaran,jam_tayang;
        double pembayaran2;
        float  jumlah_yang_dipesan;

        System.out.println("masukkan umur");
        int umur = sc.nextInt();
         if (umur < 13){
            System.out.println("umur"+umur+" belum cukup umur");
        }
        else{System.out.println("umur"+umur+" sudah cukup umur");
        System.out.println("masukkan film yang akan ditonton");
        pilihan_film = sc.next();
        sc.nextLine();
        System.out.println("masukkan hari");
        hari = sc.nextLine();
        System.out.println("masukkan tanggal tayang");
        tanggal = sc.nextInt();
        System.out.println("masukkan bulan");
        bulan = sc.nextInt();
        System.out.println("masukkan tahun");
        tahun = sc.nextInt();
        System.out.println("Masukkan jam tayang");
        jam_tayang = sc.nextDouble();
        System.out.println("masukkan jumlah tiket yang dipesan");
        jumlah_yang_dipesan = sc.nextFloat();
        int seat=0;
        if (seat>50){
            System.out.println("seat penuh");
            }else {
                System.out.println("seat tersedia");
            } 
        System.out.println("Menu");
        menu = sc.nextLine();
        System.out.println("Apakah anda ingin memesann makanan(y/t)");
        PesanMkn = sc.next();
        System.out.println("Pilih makanan");
        makanan = sc.nextInt();
        if (makanan > 10) {
            System.out.println("Anda mendapatkan 1 tiket gratis");
        } else if (makanan > 5) {
            System.out.println("Anda mendapat 10 poin");
        } else {
            System.out.println("Pesan minuman");
        }
        System.out.println("Apakah anda ingin memesan minum(y/t)");
        PesanMnm = sc.next();
        System.out.println("Pilih minuman");
        minuman = sc.nextInt();
        System.out.println("pembayaran");
        pembayaran2 = sc.nextDouble();
        System.out.println("poin");
        poin = sc.nextInt();

        if (poin > 60){
            System.out.println("Anda mendapatkan potongan harga 30%");

        }else if (poin > 30){
            System.out.println("Anda mendapatkan merchandise");
        }
        System.out.println("masukkan Harga Awal Anda");
        Harga_Awal = sc.nextInt();
        System.out.println("masukkan Prosentase_Diskon");
        Prosentase_Diskon = sc.nextDouble();
        System.out.println("Pembayaran");
        pembayaran2 = (jumlah_yang_dipesan * Harga_Awal) - ((jumlah_yang_dipesan * Harga_Awal) * Prosentase_Diskon);
        Harga_Akhir= Harga_Awal-(Harga_Awal*Prosentase_Diskon);
        System.out.println("Harga_akhir adalah " +Harga_Akhir);
        Pembayaran=jumlah_yang_dipesan*Harga_Akhir;
        System.out.println("jumlah yang harus dibayar adalah " +Pembayaran);
        
        
        }
    }
}