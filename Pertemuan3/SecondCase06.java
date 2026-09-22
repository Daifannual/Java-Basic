package Pertemuan3;
import java.util.Scanner;

public class SecondCase06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lembar, biayaCetak = 500, biayaJilid = 5000;

        System.out.println("Banyak lembar dokumen : ");
        lembar = input.nextInt();
        
        int totBiayaCetak = lembar*biayaCetak;
        int total = totBiayaCetak + biayaJilid;
        
        System.out.println("Harga total : " + total);
        input.close();
    }
}
