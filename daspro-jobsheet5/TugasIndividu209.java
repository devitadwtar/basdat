import java.util.Scanner;

public class TugasIndividu209 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int username = 121212;
        int password = 1200;
        System.out.println("masukkan username dan password");
        System.out.print("username      : ");
        
        int user= input.nextInt();
        System.out.print("password      : ");

        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Berhasil login");
        } else{
            System.out.println("username atau password salah");
        }

    }
}