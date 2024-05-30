/**
 * Percobaan509
 */
public class Percobaan509 {
    static void Tampil(String str, String... s){
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: "+ s.length);

        for (String value : s) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String args []){
        Tampil("Daspro 2019", "100" , "200");
        Tampil("Teknologi Informasi", "1", "2", "33", "4", "5");
        Tampil("Polinema");
    }
}