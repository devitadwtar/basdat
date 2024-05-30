import java.util.Scanner;
public class ArrHitungNilai09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);

        int [] nilai = new int [5];
        double rata2;
        int jmlNilai = 0;
        int max,min;
        double total = 0;
        
        System.out.println("===Selamat datang di data nilai mahasiswa===");
        System.out.println(" ");
        System.out.print("Masukkan Banyaknya Nilai : ");
        jmlNilai = input09.nextInt();

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i] = input09.nextInt();
            total += nilai[i];
        }

        max = nilai[0];
        min = nilai[0];
        for (int i = 0; i < jmlNilai; i++){
            if(nilai[i] > max){
            max = nilai[i];
            } else if (nilai[i] < min) {
            min = nilai[i];
            }
        }

        rata2 = total / jmlNilai;
        System.out.println("Rata-rata nilai adalah : " + rata2);
        System.out.println("Nilai tertinggi adalah : " + max);
        System.out.println("Nilai terendah adalah : " + min);
        System.out.println(" ");
        System.out.println("Terima kasih, semangat mengajar!!");
        
    }
}