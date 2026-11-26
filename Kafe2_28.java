
public class Kafe2_28 {

    public static int hitungTotalHarga28(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan);

        if (isMember) {
            System.out.println("Anda adalah member!");
        }
        if (jamKunjung >= 14 && jamKunjung < 16) {
            System.out.println("Happy Hour!");
        }
    }

    public static void main(String[] args) {
        menu("Andi", true, 14);
        int totalBayar = hitungTotalHarga28(1, 2);
        System.out.println("Total harga: Rp " + totalBayar);
    }
}
