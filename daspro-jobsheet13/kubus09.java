import java.util.Scanner;

/**
 * kubus09
 */
public class kubus09 {
    static int HitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }
    static int HitungLuasPermukaan (int s){
        int LP = 6*s*s;
        return LP;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int s, vol, LP;

        do {
        System.out.print("Masukkan panjang sisi: ");
        s = input09.nextInt();
        if (s < 0);
        System.out.println("Masukkan sisi lebih dari 0");
         } while (s < 0);

        vol = s * s * s;
        System.out.println("Volume kubus adalah " + vol);

        LP = 6 * s * s;
        System.out.println("Luas permukaan kubus adalah " + LP);
        
        input09.close();
    }
}