import java.util.Scanner;

public class Kafe2_28 {

    public static int hitungTotalHarga28(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKunjung;

        System.out.print("Masukkan jam kunjung: ");
        jamKunjung = sc.nextInt();
        menu("Andi", true, jamKunjung);
        System.out.println("Masukkan nomor menu yang ingin Anda pesan");
        int pilihMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin Anda pesan");
        int banyakItem = sc.nextInt();
        int totalBayar = hitungTotalHarga28(pilihMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalBayar);
        sc.close();
    }
    public static void menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan);
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (jamKunjung >= 14 && jamKunjung < 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("== MENU RESTO KAFE ==");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappucino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("======================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

        int jumlah = jumlahMenu();
        System.out.println("Jumlah menu: " + jumlah);
    }
    public static int jumlahMenu() {
        return 6;
    }
}