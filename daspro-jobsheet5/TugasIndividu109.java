import java.util.Scanner;

public class TugasIndividu109 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int jarak;

        System.out.println("Masukkan jarak: ");
        jarak = sc.nextInt();
        if (jarak <=5){
        System.out.println("pakai melee weapon");
        } else if (jarak > 5){
        System.out.println("Pakai ranged weapon");
        }
    }
}