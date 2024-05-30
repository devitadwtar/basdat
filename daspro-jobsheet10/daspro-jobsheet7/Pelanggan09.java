import java.util.Scanner;

public class Pelanggan09 {
    public static void main(String[] args) {
        Scanner sc09= new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc09.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelangga baru (Y/T)? ");
            jawab = sc09.nextLine().charAt(0);
       } while (jawab == 'Y' || jawab == 'Y');

        System.out.printf("Jumlah pelanggan yang Anda masukkan = " + jml);
    }
}
