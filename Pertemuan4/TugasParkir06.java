package Pertemuan4;

import java.util.Scanner;

public class TugasParkir06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lamaParkir, Total;

        System.out.println("Masukkan lama parkir (jam) : ");
        lamaParkir = input.nextInt();

        if (lamaParkir <= 2) {
            Total = 2000;
        } else {
            Total = 2000 + (lamaParkir - 2) * 1000;
        }

        System.out.println(Total);
        input.close();
    }
}
