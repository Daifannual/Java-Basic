package Pertemuan3;
import java.util.Scanner;

/**
 * MenghitungLuasPersegiPanjang06
 */
public class MenghitungLuasPersegiPanjang06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar : ");
        lebar = input.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas persegi adalah " + luas);
        input.close();
    }
}