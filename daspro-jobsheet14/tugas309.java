import java.util.Scanner;

public class tugas309 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc09.nextInt();

        if (cekPrimaRekursif(n)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }

    public static boolean cekPrimaRekursif(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
