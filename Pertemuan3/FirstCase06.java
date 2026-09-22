package Pertemuan3;

import java.util.Scanner;

/**
 * FirstCase06
 */
public class FirstCase06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga,uangMuka,bulanCicil;
        double bunga = 0.02;
        
        System.out.println("Masukkan harga laptop : ");
        harga = input.nextInt();
        System.out.println("Masukkan uang muka : ");
        uangMuka = input.nextInt();
        System.out.println("Berapa bulan kredit : ");
        bulanCicil = input.nextInt();

        int sisa = harga - uangMuka;
        double totalBunga = bunga*sisa;
        double totalCicilan = sisa / bulanCicil;
        double cicilanPerBulan = totalCicilan + totalBunga;

        System.out.println("Cicilan yang harus dibayar setiap bulan : " + cicilanPerBulan);
        
        input.close();
    }
}