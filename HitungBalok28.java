
public class HitungBalok28 {

    public static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }

    public static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static int hitungKurang(int a, int b) {
        return a - b;
    }

    public static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luasPermukaan = 2 * (
            hitungLuas(p, l) +
            hitungLuas(p, t) +
            hitungLuas(l, t)
        );

        return luasPermukaan;
    }

    public static void main(String[] args) {
        int p1 = 4, l1 = 3, t1 = 5;
        int p2 = 6, l2 = 4, t2 = 2;
        int p3 = 8, l3 = 3, t3 = 4;

        System.out.println(" BALOK 1 ");
        System.out.println("Luas permukaan: " +
            hitungLuasPermukaanBalok(p1, l1, t1));
        System.out.println("Volume: " +
            hitungVolume(t1, p1, l1));

        System.out.println(" BALOK 2 ");
        System.out.println("Luas permukaan: " +
            hitungLuasPermukaanBalok(p2, l2, t2));
        System.out.println("Volume: " +
            hitungVolume(t2, p2, l2));

        System.out.println(" BALOK 3 ");
        System.out.println("Luas permukaan: " +
            hitungLuasPermukaanBalok(p3, l3, t3));
        System.out.println("Volume: " +
            hitungVolume(t3, p3, l3));
    }
}
