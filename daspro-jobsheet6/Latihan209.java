import java.util.Scanner;

public class Latihan209 {
public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);
        String jenisBuku;
        int jumlahBuku, bayar, hargaBayar;
        double ProsentaseDiskon, ProsentaseDiskon1, jmlhDiskon, total;

        System.out.println("Masukkan jenis Buku yang anda beli : ");
        jenisBuku = input09.nextLine();
        System.out.println("Masukkan jumlah buku yang anda beli : ");
        jumlahBuku = input09.nextInt();
        System.out.println("Masukkan harga buku yang anda beli : ");
        bayar = input09.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku <2)
                ProsentaseDiskon = 0.1;
            else if (jumlahBuku >2)
                ProsentaseDiskon = 0.12;
            else 
               ProsentaseDiskon = 0;
            total = jumlahBuku*bayar;
            jmlhDiskon = total*ProsentaseDiskon;
            hargaBayar = (int) (total - jmlhDiskon);
            ProsentaseDiskon1 = ProsentaseDiskon * bayar * jumlahBuku;
            System.out.println("Jumlah diskon persen : " + ProsentaseDiskon);
            System.out.println("Jumlah diskon rupiah : " + ProsentaseDiskon1);
            System.out.println("Harga yang harus anda bayar : " + hargaBayar);
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            if (jumlahBuku <3)
                ProsentaseDiskon = 0.07;
            else if (jumlahBuku >3)
                ProsentaseDiskon = 0.09;
            else if (jumlahBuku ==3)
                ProsentaseDiskon = 0.08;
            else 
                ProsentaseDiskon = 0;
            total = jumlahBuku*bayar;
            jmlhDiskon = total*ProsentaseDiskon;
            hargaBayar = (int) (total - jmlhDiskon);
            ProsentaseDiskon1 = ProsentaseDiskon * bayar * jumlahBuku;
            System.out.println("Jumlah diskon persen : " + ProsentaseDiskon);
            System.out.println("Jumlah diskon rupiah : " + ProsentaseDiskon1);
            System.out.println("Harga yang harus anda bayar : " + hargaBayar);
        } else {
            if (jumlahBuku >3)
                ProsentaseDiskon = 0.05;
            else
                ProsentaseDiskon = 0;
            total = jumlahBuku*bayar;
            jmlhDiskon = total*ProsentaseDiskon;
            hargaBayar = (int) (total - jmlhDiskon);
            ProsentaseDiskon1 = ProsentaseDiskon * bayar * jumlahBuku;
            System.out.println("Jumlah diskon persen : " + ProsentaseDiskon);
            System.out.println("Jumlah diskon rupiah : " + ProsentaseDiskon1);
            System.out.println("Harga yang harus anda bayar : " + hargaBayar);
        }
}
}