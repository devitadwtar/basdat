import java.util.Scanner;

public class Pemilihan2Percobaan209 {
    public static void main(String[] args){
        Scanner input09 = new Scanner (System.in);

        System.out.print("Nilai sudut 1 : ");
        float sudut1 = input09.nextFloat();
        System.out.print("Nilai sudut 2 : ");
        float sudut2 = input09.nextFloat();
        System.out.print("Nilai sudut 3 : ");
        float sudut3 = input09.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;
        
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebit adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");
    }
}