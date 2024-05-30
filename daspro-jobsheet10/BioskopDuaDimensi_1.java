import java.util.Scanner;
public class BioskopDuaDimensi_1 {
    public static void main(String[] args){
        String[][] studio = new String[5][2];

        studio[0][0] = "yowes ben   ";
        studio[0][1] = "studio 1";
        studio[1][0] = "joker      ";
        studio[1][1] = "studio 2";
        studio[2][0] = "doraemon    ";
        studio[2][1] = "studio 3";
        studio[3][0] = "one piece   ";
        studio[3][1] = "studio 4";
        studio[4][0] = "mumun      ";
        studio[4][1] = "studio 5";

        System.out.printf("%s \t %s\n", studio[0][0], studio[0][1]);
        System.out.printf("%s \t %s\n", studio[1][0], studio[1][1]);
        System.out.printf("%s \t %s\n", studio[2][0], studio[2][1]);
        System.out.printf("%s \t %s\n", studio[3][0], studio[3][1]);
        System.out.printf("%s \t %s\n", studio[4][0], studio[4][1]);
    }
}