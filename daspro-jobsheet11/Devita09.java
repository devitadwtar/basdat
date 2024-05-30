import java.util.Scanner;
/**
 * Devita09
 */
public class Devita09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= "); // print nilai yang ingin dimasukkan
        int N = sc09.nextInt(); // input nilai

        for (int i = N - 1; i >= 0; i--) {   
            // Statement pertama
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Statement kedua
            for (int n = 0; n < 2 * i + 1; n++) {
                System.out.print("*"); // membuat perintah untuk mengeprint *
            }
          System.out.println(); // menambahkan baris kosong
        }
    }
}