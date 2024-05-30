import java.util.Scanner;

public class FungsiNilai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan tugas
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jum_mahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jum_tugas = scanner.nextInt();

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiTugas);
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiTugas);
        tampilkanMahasiswaTertinggi(namaMahasiswa, nilaiTugas);
    }

    // a. fungsi untuk menginputkan nilai data mahasiswa
    public static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            for (int j = 0; j < 7; j++) {
                System.out.printf("Masukkan nilai untuk minggu ke-%d: ", j + 1);
                nilaiTugas[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }
        scanner.close();
    }

    // b. fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu ke 1 - 7
    public static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        System.out.println("\nNilai Mahasiswa:");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int i = 1; i <= 7; i++) {
            System.out.printf(" Minggu %d |", i);
        }
        System.out.println("\n------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %-8d |", nilaiTugas[i][j]);
            }
            System.out.println("\n------------------------------------------------------------------------------------------------");
        }
    }

    // c. fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi dan minggu keberapa
    public static void tampilkanMahasiswaTertinggi(String[] namaMahasiswa, int[][] nilaiTugas) {
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;

        for (int i = 0; i < 7; i++) {
            int nilaiTertinggiMingguIni = Integer.MIN_VALUE;
            for (int j = 0; j < 5; j++) {
                if (nilaiTugas[j][i] > nilaiTertinggiMingguIni) {
                    nilaiTertinggiMingguIni = nilaiTugas[j][i];
                    mahasiswaTertinggi = j;
                    mingguTertinggi = i + 1;
                }
            }
            if (nilaiTertinggiMingguIni > nilaiTertinggi) {
                nilaiTertinggi = nilaiTertinggiMingguIni;
            }
        }

        // d. menampilkan mahasiswa yang memiliki nilai tertinggi dan keterangan minggu ke berapa
        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi] +
                " pada minggu ke-" + mingguTertinggi + " dengan nilai " + nilaiTertinggi);
    }
}