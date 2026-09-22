package Pertemuan4;

import java.util.Scanner;

public class PemilahanBilangan06 {
    /**
     * InnerPemilahanBilangan06
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka" + angka + "termasuk bilangan genap");
        } else {
            System.out.println("Angka" + angka + "termasuk bilangan ganjil");
        }

        input.close();
    }
}
