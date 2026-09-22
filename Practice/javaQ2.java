// Skenario:
// Kamu sedang membuat program untuk mesin kasir otomatis. Saat pelanggan mendapat kembalian, mesin harus menghitung berapa lembar uang Rp 50.000, Rp 10.000, dan sisa recehannya agar efisien (memberikan pecahan terbesar lebih dulu).
// Catatan: Asumsikan pelanggan selalu membayar dengan uang pas atau lebih, jadi tidak ada kembalian minus. Dan kita hanya fokus memecah kembalian ke 50rb dan 10rb saja.
// Algoritma yang diminta:
// Minta user menginput Total Belanja (bilangan bulat).
// Minta user menginput Uang Bayar (bilangan bulat).
// Hitung Kembalian (Uang Bayar - Total Belanja). Cetak kembalian ini.
// Hitung ada berapa lembar uang 50.000 dari kembalian tersebut.
// Hitung ada berapa lembar uang 10.000 dari sisa kembaliannya.
// Hitung sisa receh yang tidak bisa dipecah jadi 50rb atau 10rb.
// Tampilkan rincian kembaliannya ke layar.
// 💡 Clue Penting:
// Gunakan pembagian bulat (/) untuk mencari jumlah lembar. (Contoh: 120000 / 50000 hasilnya 2).
// Gunakan modulus (%) untuk mengupdate sisa uang yang belum dipecah. (Contoh: 120000 % 50000 hasilnya 20000).


package Practice;

import java.util.Scanner;

public class javaQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBelanja, uangBayar, Kembalian;

        System.out.println("Masukkan total belanja : ");
        totalBelanja = input.nextInt();
        System.out.println("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        Kembalian = uangBayar - totalBelanja;
        int lembar50 = Kembalian / 50000;
        int lembar10 = Kembalian / 10000;

        
    }
}
