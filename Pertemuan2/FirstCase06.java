
// public class FirstCase06 {
//     public static void main(String[] args) {
//         int gajiPokok = 5000000;
//         int tunjangan = 100000;
//         int jumlahAnak = 4;
//         double persenPensiun = 0.1;
        
//         int totalTunjangan = jumlahAnak*tunjangan;
//         double potonganPensiun = gajiPokok*persenPensiun;
//         double gajiBersih = gajiPokok+totalTunjangan-potonganPensiun;

//         System.out.println("Gaji besih pak danur :" + gajiBersih); 
//     }
// }

// versi modif

import java.util.Scanner;

public class FirstCase06 {
    public static void main(String[] args) {
        int gajiPokok,tunjangan,jumlahAnak;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan gaji pokok pak danur :");
        gajiPokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak perbulan :");
        tunjangan = input.nextInt();
        System.out.println("Masukkan jumlah anak :");
        jumlahAnak = input.nextInt();
        
        double persenPensiun = 0.1;
        
        int totalTunjangan = jumlahAnak*tunjangan;
        double potonganPensiun = gajiPokok*persenPensiun;
        double gajiBersih = gajiPokok+totalTunjangan-potonganPensiun;

        System.out.println("Gaji besih pak danur :" + gajiBersih);

        input.close();
    }
}
