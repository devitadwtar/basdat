import java.util.Scanner;

public class BioskopDuaDimensi_2 {

    public static void main(String[] args) {
        
        String[][] jamPenayangan = new String[3][2];

        jamPenayangan[0][0] = "10:00";
        jamPenayangan[0][1] = "12:00";
        jamPenayangan[1][0] = "14:00";
        jamPenayangan[1][1] = "16:00";
        jamPenayangan[2][0] = "18:00";
        jamPenayangan[2][1] = "20:00";

        System.out.println("Pilih jam penayangan bioskop:");
        for (int i = 0; i < jamPenayangan.length; i++) {
            System.out.println("[" + i + "] " + jamPenayangan[i][0] + " - " + jamPenayangan[i][1]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih jam penayangan: ");
        int pilihan = sc.nextInt();

        System.out.println("Anda memilih jam penayangan " + jamPenayangan[pilihan][0] + " - " + jamPenayangan[pilihan][1]);
    }
}