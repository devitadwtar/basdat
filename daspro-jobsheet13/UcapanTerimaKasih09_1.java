 import java.util.Scanner;

 public class UcapanTerimaKasih09_1 {
    public static String PenerimaUcapan(){
        Scanner sc09 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc09.nextLine();
        sc09.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.print("Thank you for being the best teacher in the world. \n " + 
                "you inspired in me a love for learning and made me feel like I could ask you everything");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.print(tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("Terima Kasih telah membantu kesulitanku. Semoga selalu sehat dan bahagia selalu ><");
    }
}
