
import java.util.Scanner;

public class KubusLimas28 {

    public static int luasPersegi(int s) {
        return s * s;
    }
    public static int volumeKubus(int s) {
        return luasPersegi(s) * s;
    }

    public static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    public static double volumeLimasPersegi(int s, int t) {
        double volume = (double) luasPersegi(s) * t / 3;
        return volume;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int s, t;

        do {
            System.out.println("\n=== MENU PERHITUNGAN ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan sisi persegi: ");
                    s = input.nextInt();
                    System.out.println("Luas persegi: " + luasPersegi(s));
                    break;
                case 2:
                    System.out.print("Masukkan sisi kubus: ");
                    s = input.nextInt();
                    System.out.println("Volume kubus: " + volumeKubus(s));
                    break;
                case 3:
                    System.out.print("Masukkan sisi kubus: ");
                    s = input.nextInt();
                    System.out.println("Luas permukaan kubus: " +
                        luasPermukaanKubus(s));
                    break;
                case 4:
                    System.out.print("Masukkan sisi alas limas: ");
                    s = input.nextInt();
                    System.out.print("Masukkan tinggi limas: ");
                    t = input.nextInt();
                    System.out.println("Volume limas persegi: " +
                        volumeLimasPersegi(s, t));
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
