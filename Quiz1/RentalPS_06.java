package Quiz1;

import java.util.Scanner;

/**
 * RentalPS06
 */
public class RentalPS_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mntBermain, jamPenuh, sisaMenit, totalBayar, tarifPerjam = 7000, tarifSisa = 150;
        double ptgMember = 0.125, totalMember;

        System.out.println("Masukkan menit bermain : ");
        mntBermain = input.nextInt();

        jamPenuh = mntBermain / 60;
        sisaMenit = mntBermain % 60;

        totalBayar = jamPenuh*tarifPerjam + sisaMenit*tarifSisa;
        totalMember = totalBayar - totalBayar*ptgMember;

        System.out.println("Jam penuh : " + jamPenuh);
        System.out.println("Sisa menit : " + sisaMenit);
        System.out.println("Total biaya : " + totalBayar);
        System.out.println("Biaya member : " + totalMember);

        input.close();
    }
}

// Output

// Masukkan menit bermain : 
// 130
// Jam penuh : 2
// Sisa menit : 10
// Total biaya : 15500
// Biaya member : 13562.5   