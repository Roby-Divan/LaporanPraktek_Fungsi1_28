
import java.util.Scanner;

public class Kafe2_28 {

    public static int hitungTotalHarga28(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihMenu;
        int banyakItem;
        int totalBayar = 0;

        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp15.000");
        System.out.println("2. Cappucino - Rp20.000");
        System.out.println("3. Latte - Rp22.000");
        System.out.println("4. Teh Tarik - Rp12.000");
        System.out.println("5. Roti Bakar - Rp10.000");
        System.out.println("6. Mie Goreng - Rp18.000");
        System.out.println("0. Selesai memesan");

        do {
            System.out.print("\nMasukkan nomor menu: ");
            pilihMenu = sc.nextInt();
            if (pilihMenu == 0) {
                break;
            }
            if (pilihMenu < 1 || pilihMenu > 6) {
                System.out.println("Menu tidak tersedia");
                continue;
            }
            System.out.print("Masukkan jumlah item: ");
            banyakItem = sc.nextInt();
            if (banyakItem <= 0) {
                System.out.println("Jumlah item tidak valid");
                continue;
            }
            int subtotal = hitungTotalHarga28(pilihMenu, banyakItem);
            totalBayar += subtotal;
            System.out.println("Subtotal: Rp " + subtotal);
        } while (true);
        System.out.println("\nTotal keseluruhan: Rp " + totalBayar);

        sc.close();
    }
}
