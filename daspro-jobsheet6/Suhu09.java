import java.util.Scanner;

public class Suhu09 {
    public static void main(String[] args) {
    int suhu;
    String hujan;
    Scanner sc = new Scanner(System.in);
    System.out.print("Berapa suhu sekarang? ");
    suhu = sc.nextInt();
    if (suhu > 27) {
        System.out.println("Memakai dress");
    } else {
        System.out.println("Memakai celana panjang");
    }
    System.out.print("Apakah sekarang hujan (y atau t)? ");
    hujan = sc.next();
      if (hujan.equals("y")) {
        System.out.println("Membawa payung");
        } else {
        System.out.println("Memakai sunscreen");
    }
  }
}