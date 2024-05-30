import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner (System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String [4][2];
        while (true) {
            System.out.print("Masukan nama: ");
            nama = sc09.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc09.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc09.nextInt();
            sc09.nextLine();

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc09.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}