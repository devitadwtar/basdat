import java.util.Scanner;

public class PemilihanPercobaan109_1{
    public static void main(String[] args){

        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan nilai; ");
        int Nilai = input09.nextInt();

        if (Nilai < 75) {
            System.out.println("Anda harus remidi");
        }
        else {
            System.out.println("Anda lulus");
        }   
    }
}