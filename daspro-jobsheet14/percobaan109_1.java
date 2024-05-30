public class percobaan109_1 {

    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Faktorial dari 5 adalah " + faktorial(5));
    }
}
