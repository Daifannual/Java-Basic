// Kamu diminta membuat program kasir sederhana untuk menghitung total belanja setelah pajak.
// Algoritma yang diminta:
// Minta user menginput harga barang (bilangan bulat).
// Minta user menginput jumlah barang (bilangan bulat).
// Hitung subtotal (harga * jumlah).
// Hitung pajak sebesar 11% (0.11) dari subtotal. (Gunakan tipe data desimal untuk pajak).
// Hitung total bayar (subtotal + pajak).
// Tampilkan total bayar ke layar.
// Syarat Khusus: Total bayar yang ditampilkan ke layar harus bilangan bulat (lakukan narrowing casting untuk membuang desimalnya).
// Tugasmu: Tulis kode Java lengkap (termasuk scanner) untuk menyelesaikan study case di atas!


package Practice;

import java.util.Scanner;

/**
 * javaQ1
 */
public class javaQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaBrg, jmlBrg, subTotal;
        double pajakTotal, totalAkhir, pajak = 0.11;

        System.out.println("Masukkan harga barang : ");
        hargaBrg = input.nextInt();
        System.out.println("Masukkan jumlah barang : ");
        jmlBrg = input.nextInt();
        
        subTotal = hargaBrg*jmlBrg;
        pajakTotal = pajak*subTotal;
        totalAkhir = subTotal + pajakTotal;
        
        System.out.println("Total harga setelah ppn 11% = " + (int) totalAkhir);
        input.close();
    }
}