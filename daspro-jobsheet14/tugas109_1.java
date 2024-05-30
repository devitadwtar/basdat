public class tugas109_1 {

    public static void tampilDeretRekursif(int n) {
        if (n >= 0) {
            System.out.println(n);
            tampilDeretRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        tampilDeretRekursif(n);
    }
}
