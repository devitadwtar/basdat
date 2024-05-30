import java.util.Scanner;
/**
 * percobaan209_1
 */
public class percobaan209_1 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        int bilangan, pangkat, hasil;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc09.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc09.nextInt();
        hasil = (hitungPangkat(bilangan, pangkat));

        System.out.print("Deret perhitungan pangkat: ");
        for(int i = 1; i <= pangkat; i++){
            System.out.print(bilangan+"x" );
        }

        System.out.print("1 = "+ hasil);
    }
}
