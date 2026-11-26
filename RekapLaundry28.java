
import java.util.Scanner;

public class RekapLaundry28 {

    static Scanner sc = new Scanner(System.in);
    static String[] layanan = {"Cuci kering", "Cuci Setrika", "Cuci saja","Express"};
    static int[] harga = {6000, 8000, 5000, 12000};
    static String[] hari = {"Senin", "Selasa", "Rabu","Kamis", "Jumat", "Sabtu"};
    static int[][] data = new int[4][6];
    static void inputData() {
        System.out.println(" INPUT DATA LAUNDRY ");
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Layanan: " + layanan[i]);
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat hari " + hari[j] + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData() {
        System.out.println(" TABEL REKAP LAUNDRY ");
        System.out.printf("%-18s", "Layanan");
        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%-10s", hari[j]);
        }
        System.out.println();
        for (int i = 0; i < layanan.length; i++) {
            System.out.printf("%-18s", layanan[i]);
            for (int j = 0; j < hari.length; j++) {
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void layananTerbanyak() {
        int indeksTerbesar = 0;

        for (int i = 1; i < layanan.length; i++) {
            if (totalPerLayanan(data, i) >
                totalPerLayanan(data, indeksTerbesar)) {
                indeksTerbesar = i;
            }
        }

        System.out.println(" LAYANAN TERBANYAK ");
        System.out.println("Nama layanan: " + layanan[indeksTerbesar]);
        System.out.println("Total berat: " + totalPerLayanan(data, indeksTerbesar) + " kg");
    }
    static int hariTersibuk(int[][] data) {
        int indeksTerbesar = 0;
        int totalTerbesar = 0;

        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                indeksTerbesar = j;
            }
        }
        return indeksTerbesar;
    }

    static void hitungPendapatan() {
        double totalPendapatan = 0;
        System.out.println(" PENDAPATAN SETIAP LAYANAN ");

        for (int i = 0; i < layanan.length; i++) {
            int totalBerat = totalPerLayanan(data, i);
            double pendapatan = totalBerat * harga[i];
            totalPendapatan += pendapatan;
            System.out.printf("%-18s Rp%.0f%n", layanan[i], pendapatan);
        }
        System.out.printf("Total pendapatan: Rp%.0f%n", totalPendapatan);
    }

    public static void main(String[] args) {
        inputData();
        tampilData();
        System.out.println("== TOTAL BERAT PER LAYANAN ==");

        for (int i = 0; i < layanan.length; i++) {
            System.out.println(layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }

        layananTerbanyak();
        int hari = hariTersibuk(data);
        System.out.println("Hari tersibuk: " + RekapLaundry28.hari[hari]);
        hitungPendapatan();

        sc.close();
    }
}
