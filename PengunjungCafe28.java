
public class PengunjungCafe28 {

    static int hitungTotalBelanja(int... harga) {

        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {

        int total1 = hitungTotalBelanja(10000);
        int total2 = hitungTotalBelanja(10000, 15000, 20000);
        int total3 = hitungTotalBelanja(10000, 15000, 20000, 5000, 10000);

        System.out.println("Total 1 argumen: Rp " + total1);
        System.out.println("Total 3 argumen: Rp " + total2);
        System.out.println("Total 5 argumen: Rp " + total3);

    }
}
