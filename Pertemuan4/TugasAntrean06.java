package Pertemuan4;

import java.util.Scanner;

public class TugasAntrean06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kode;

        System.out.println("Masukkan kode layanan : ");
        kode = input.nextInt();

        switch (kode) {
            case 1:
                System.err.println("Legalisir Ijazah");
                System.err.println("Loket A");
                break;
            case 2:
                System.err.println("Surat Keterangan Aktif");
                System.err.println("Loket B");
                break;
            case 3:
                System.err.println("Pembayaran UKT");
                System.err.println("Loket A");
                break;
            case 4:
                System.err.println("Pengajuan cuti akademik");
                System.err.println("Loket A");
                break;
        
            default:
                System.out.println("Kode tidak valid");
                break;
        }
        input.close();
    }
}
