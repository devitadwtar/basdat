import java.util.Scanner;
public class SistemBooking_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String [] namapemesan= new String[100];
        String [] kodeseat = new String[100];

        System.out.print("Masukkan Jumlah pesanan : ");
        int jumlah = sc.nextInt();
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nama pemesan : ");
            sc.nextLine();
            namapemesan[i] = sc.nextLine();
            System.out.print("Masukkan Kode seat : ");
            kodeseat[i] = sc.next();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama pemesan : " + 
            namapemesan[i] + ", Kode seat: " + kodeseat[i]);
        }

        
    
    }
}