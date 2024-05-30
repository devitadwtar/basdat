import java.util.Scanner;
/**
 * Ucapan09
 */
public class Ucapan09 {
    public static String PenerimaUcapan(){
        Scanner sc09 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc09.nextLine();
        sc09.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.print("Thank you\n" +nama+"\nMay the force be with you");
    }
}