import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        int lamaParkir = input.nextInt();

        if (lamaParkir <= 2) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        input.close();
    }
}



        // String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        // System.out.println(pesan);