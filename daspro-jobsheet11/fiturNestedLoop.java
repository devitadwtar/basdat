import java.util.Scanner;

public class fiturNestedLoop {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int baris = 5; 
                int kolom = 8; 
                int pilihBaris, kursi; 
                boolean[][] tersedia = new boolean[baris][kolom];
        
                //bagian nested loop untuk ketersediaan seat
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        tersedia[i][j] = true;
                    }
                }

                // Menampilkan peta seat
            while (true) {
                System.out.println("PETA SEAT :");
                for (int i = 0; i < baris; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < kolom; j++) {
                        if (tersedia[i][j]) {
                            System.out.print("O "); 
                        } else {
                            System.out.print("X "); 
                        }
                    }
                    System.out.println(); 
                }
                System.out.print("Nomor kursi yang ingin Anda pesan (baris 1 - " + baris + "): ");
                    pilihBaris = sc.nextInt();
                System.out.print("pilih kursi (kolom 1 - " + kolom + "): ");
                    kursi = sc.nextInt();

                    if (pilihBaris >= 1 && pilihBaris <= baris && kursi >= 1 && kursi <= kolom) {
                        if (tersedia[pilihBaris - 1][kursi - 1]) {
                            tersedia[pilihBaris - 1][kursi - 1] = false;
                            System.out.println("seat berhasil dipilih!");
                        } else {
                            System.out.println("Maaf, seat tersebut sudah dipesan. Silakan pilih seat lain.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");   

                    }
                    System.out.print("Ingin melanjutkan memilih seat? (y/t): ");
                    String pilih = sc.next();
        
                    if (pilih.equalsIgnoreCase("t")) {
                        break;
                    }
                }
        
                sc.close();
        }
    }
    