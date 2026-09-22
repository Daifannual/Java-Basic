package Math;

public class Logic {
    public static void main(String[] args) {
        int nilai = 75;
        int kehadiran = 85;

        if (nilai >= 60 && kehadiran >= 80) {
            System.out.println("Mahasiswa Lulus");
        } else {
            System.out.println("Mahasiswa Tidak Lulus");
        }

        // De Morgan

        if (nilai < 60 || kehadiran < 80) {
            System.out.println("Mahasiswa Tidak Lulus");
        } else {
            System.out.println("Mahasiswa Lulus");
        }
    }
}