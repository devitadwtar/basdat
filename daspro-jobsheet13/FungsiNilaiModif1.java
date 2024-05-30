import java.util.Scanner;

public class FungsiNilaiModif1 {
    static Scanner scanner = new Scanner(System.in);
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    public static void inputJumlahMahasiswaDanTugas() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        
        scanner.nextLine(); 
    }

    public static void inputNilaiMahasiswa() {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.println("Masukkan nilai untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }

            scanner.nextLine(); 
        }
    }

    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai seluruh mahasiswa dari minggu 1 hingga 7:");
        System.out.println("=============================================================================================");
        System.out.printf("|| %-10s ||", "Mahasiswa");
        for (int i = 0; i < nilaiMahasiswa[0].length; i++) {
            System.out.printf(" Minggu %d||", i + 1);
        }
        System.out.println();
        System.out.println("=============================================================================================");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("|| %-10s ||", namaMahasiswa[i]);
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf(" %-7d ||", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
        System.out.println("=============================================================================================");
    }

    public static int cariHariNilaiTerendah(){
        int[] totalNilai = new int[nilaiMahasiswa[0].length];
        for (int i = 1; i < totalNilai.length; i++){
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai[j] += nilaiMahasiswa[i][j];
            }
        }

        int hariTerendah = 0;
        int nilaiTerendah = totalNilai[0];
        for (int i = 1; i < totalNilai.length; i++){
            if (totalNilai[i] < nilaiTerendah) {
                nilaiTerendah = totalNilai[i];
                hariTerendah = i;
            }
        }
        return hariTerendah + 1;
    }

    public static void tampilkanMahasiswaNilaiTerendah(){
        int mahasiswaTerendah = 0;
        int nilaiTerendah = 100;

        for (int i = 0; i < nilaiMahasiswa.length; i++){
            for (int j = 0; j < nilaiMahasiswa[0].length; j++){
                if (nilaiMahasiswa[i][j] < nilaiTerendah){
                    nilaiTerendah = nilaiMahasiswa[i][j];
                    mahasiswaTerendah = j+1;
                }
        }
    }
     System.out.println("Nilai terendah adalah : "+ nilaiTerendah +" pada minggu ke- "+mahasiswaTerendah);
    }

    public static int cariHariNilaiTertinggi() {
        int[] totalNilai = new int[nilaiMahasiswa[0].length];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai[j] += nilaiMahasiswa[i][j];
            }
        }

        int hariTertinggi = 0;
        int nilaiTertinggi = totalNilai[0];
        for (int i = 1; i < totalNilai.length; i++) {
            if (totalNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = totalNilai[i];
                hariTertinggi = i;
            }
        }
        return hariTertinggi + 1;
    }

    public static void tampilkanMahasiswaNilaiTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi] +" dengan nilai total " + nilaiTertinggi+"\n");
    }

    public static void main(String[] args) {
        inputJumlahMahasiswaDanTugas();
        inputNilaiMahasiswa();
        tampilkanNilaiMahasiswa();

        int hariTertinggi = cariHariNilaiTertinggi();
        System.out.println("Minggu ke- " + hariTertinggi + " memiliki nilai tertinggi dibandingkan minggu lain dari keseluruhan mahasiswa");

        tampilkanMahasiswaNilaiTertinggi();

        int hariTerendah = cariHariNilaiTerendah();
        System.out.println("Minggu ke- "+ hariTerendah + " memiliki nilai terendah dibandingkan yang lain");
        tampilkanMahasiswaNilaiTerendah();
    }
}