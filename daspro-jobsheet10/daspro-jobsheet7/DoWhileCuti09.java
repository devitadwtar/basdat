import java.util.Scanner;

public class DoWhileCuti09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti= sc09.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t) ");
            konfirmasi = sc09.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari : ");
                jumlahHari= sc09.nextInt();

                if(jumlahHari <= jatahCuti) {
                    jatahCuti-= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
    }
}