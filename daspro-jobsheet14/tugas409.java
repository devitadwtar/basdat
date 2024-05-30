/**
 * tugas409
 */
public class tugas409 {
      public static int hitungMarmut(int bulan) {
            if (bulan <= 2) {
                return 1; 
            } else {
                return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
            }
        }
        public static void main(String[] args) {
            int bulan = 12;
            int jumlahMarmut = hitungMarmut(bulan);
            System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + jumlahMarmut);
        }
    }
    