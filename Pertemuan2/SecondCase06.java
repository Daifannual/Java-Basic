import java.util.Scanner;

public class SecondCase06 {
    public static void main(String[] args) {
        int lebarTanah, panjangTanah, diameterKolam, sisiTaman;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan lebar tanah : ");
        lebarTanah = input.nextInt();
        System.out.println("masukkan panjang tanah : ");
        panjangTanah = input.nextInt();
        System.out.println("masukkan diameter kolam : ");
        diameterKolam = input.nextInt();
        System.out.println("masukkan sisi taman : ");
        sisiTaman = input.nextInt();

        int luasTanah = lebarTanah*panjangTanah;
        double jariJari = diameterKolam / 2.0;
        double luasKolam = Math.PI*jariJari*jariJari;
        int luasTaman = sisiTaman*sisiTaman;
        double sisaTanah = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah Pak Tono yang tidak digunakan : " +sisaTanah);
        input.close();
    }    
}
 