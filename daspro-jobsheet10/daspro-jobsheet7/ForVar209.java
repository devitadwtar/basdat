import java.util.Scanner;

public class ForVar209 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        for (; !berhenti;) {
            System.out.print("Masukkan bilangan: ");
            bil = sc09.nextInt();
            System.out.println("Bilangan yang Anda masukkan: " + bil);
            if (bil == 0) {
                berhenti= true;
            }
        }
        System.out.println("Program berakhir");
    }
}