import java.util.Scanner;
public class Percobaan609_1 {
    
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
    static int hitungRusuk (int rusuk){
        int PjgRusuk = 12 * rusuk;
        return PjgRusuk;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol, rusukP, rusukL, rusukT, total;

        System.out.println("Masukkan panjang");
        p=input.nextInt();

        System.out.println("Masukkan lebar");
        l=input.nextInt();

        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=hitungLuas(p,l);
        System.out.println("Luas Persegi panjang adalah "+ L);

        vol=hitungVolume(t,p,l);
        System.out.println("Volume balok adalah "+ vol);

        rusukP = 4*p;
        System.out.println("Hasil rusuk tinggi adalah: " + rusukP);
        rusukL = 4*l;
        System.out.println("Hasil rusuk lebar adalah: " + rusukL);
        rusukT = 4*t;
        System.out.println("Hasil rusuk tinggi adalah: " + rusukT);

        total = rusukP + rusukL + rusukT;

        System.out.println("Jadi total panjang rusuk adalah: " + total);

    }
}