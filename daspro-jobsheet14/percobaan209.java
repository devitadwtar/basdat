import java.util.Scanner;
/**
 * percobaan209
 */
public class percobaan209 {

    static int hitungPangkat(int x, int y){
        if (y== 0) {
            return(1);
        } else {
            return ( x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc09 = new Scanner (System.in);
        int bilangan, pangkat; 

    System.out.print("Bilangan yang dihitung: ");
    bilangan = sc09.nextInt();
    System.out.print("Pangkat: ");
    pangkat = sc09.nextInt();

    System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
