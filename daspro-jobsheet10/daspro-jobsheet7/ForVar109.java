import java.util.Scanner;

public class ForVar109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        for (int i = 1, j = 10; i < j; j-- ) {
            System.out.printf("%03d -- %03d/n", i, j);
        }
    }
}