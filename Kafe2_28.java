
public class Kafe2_28 {

    public static int hitungTotalHarga28(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {

        int totalBayar = hitungTotalHarga28(1, 2);

        System.out.println("Total harga: Rp " + totalBayar);
    }
}
