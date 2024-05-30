import java.util.Scanner;

public class DoWhileCuti09_2 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc09.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc09.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc09.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                }else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi, silahkan ambil cuti sesuai jata sisa. sisa jatah anda adalah: " + jatahCuti);
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}