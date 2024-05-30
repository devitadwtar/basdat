import java.util.Scanner;

public class NestedLoopKel7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] namaFilm = new int[3][7];
        int[] jmlTerbanyak = new int[3];
        int totalTerjual = 0;
       

        for (int i = 0; i < namaFilm.length; i++) { 
            System.out.println("Film ke " + (i+1));
            int total = 0; 
            for (int j = 0; j < namaFilm[0].length; j++) { 
                System.out.print("hari ke " +(j +1) + " Terjual : "); 
                namaFilm[i][j] = sc.nextInt(); 
                total += namaFilm[i][j];
                totalTerjual += namaFilm[i][j];
            } 
            jmlTerbanyak[i] = total;
            System.out.println("------------------------------------------"); 
           } 
        for (int i = 0; i < namaFilm.length; i++) { 
            System.out.print("Film ke " + (i+1) + ": "); 
            for (int j = 0; j < namaFilm[i].length; j++) { 
                System.out.print(namaFilm[i][j] + " "); 
            } 
            System.out.println(" / jumlah " + jmlTerbanyak[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Jumlah tiket yang laku pada minggu ini " +totalTerjual);
    }
}