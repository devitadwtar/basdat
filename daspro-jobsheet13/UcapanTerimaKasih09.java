import java.util.Scanner;
/**
 * UcapanTerimaKasih09
 */
public class UcapanTerimaKasih09 {

    public static String PenerimaUcapan(){
        Scanner sc09 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc09.nextLine();
        sc09.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world. \n " + 
        "you inspired in me a love for learning and made me feel like I could ask you everything");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}