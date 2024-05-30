import java.util.Scanner;
public class Kelompok2dimensi {
    public static void main(String[] args) {
        
        String[][] film = {
            {"yowis ben" , "20.00"},
            {"Counjuring", "18.00"},
            {"Doraemon" , "16.00"},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan film yang anda inginkan: ");
        String judulFilm = scanner.nextLine();

        
        boolean filmTersedia = false;
        for (int i = 0; i < film.length; i++) {
            if (film[i][0].equalsIgnoreCase(judulFilm)) {
                filmTersedia = true;
                System.out.println("Film yang anda pilih");
                System.out.println("Judul Film: " +film[i][0]);
                System.out.println("Jam Tayang: " +film[i][1]);
                
                break;
            }
        }

        if (!filmTersedia) {
            System.out.println("Film tersedia");
        }

        scanner.close();
    }
}




