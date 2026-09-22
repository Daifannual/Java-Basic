package Pertemuan3;

import java.util.Scanner;

/**
 * GajiKaryawan06
 */
public class GajiKaryawan06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        int totGaji; 
        //total gaji diubah menjadi integer

        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.println("masukkan gaji pokok : ");
        gajiPokok = input.nextInt();

        bonus = 0.05 * gajiPokok;
        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));
        // menambahkan casting (int) 

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);

        input.close();
    }
}