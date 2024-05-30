import java.util.Scanner;
public class LinearSearch09_1 {
    public static void main(String[] args){
        Scanner input09 =new Scanner(System.in);
        int[] arrayInt = new int[8];
        int key = 0;
        int jmlElemen;
        int hasil =0;

        System.out.print("masukkan jumlah elemen array: ");
        jmlElemen = input09.nextInt();

        for (int i =0; i < arrayInt.length; i++){
            System.out.print("masukkan elemen array ke-"+(i)+" :");
            arrayInt[i]= input09.nextInt();

        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = input09.nextInt();
        for (int i =0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil =i;
                System.out.print(" key dalam array pada posisi indeks ke- "+hasil);
                break;
            }
        }
    }
}