import java.util.Scanner;

/**
 * Percobaan609
 */
public class Percobaan609 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input09.nextInt();
        System.out.println("Masukkan lebar");
        l = input09.nextInt();
        System.out.println("Masukkan tinggi");
        t = input09.nextInt();

        L = p*l;
        System.out.println("luas persegi panjang adalah " + L);

        vol = p*l*t;
        System.out.println("Volume balok adalah " + vol);
    }
}
