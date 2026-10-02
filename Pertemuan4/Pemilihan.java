package Pertemuan4;

import java.util.Scanner;

/**
 * PemilihanIf06
 */
public class Pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" 
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
        input.close();
    }
}