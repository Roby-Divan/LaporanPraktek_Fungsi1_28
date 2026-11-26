
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
    public static void main(String[] args) {

        int p = 4;
        int l = 3;
        int t = 5;

        int volume1 = hitungVolume(t, p, l);
        int volume2 = hitungVolume(p, l, t);

        System.out.println("Volume awal: " + volume1);
        System.out.println("Volume setelah urutan diubah: " + volume2);

        System.out.println("Pengurangan pertama: " + hitungKurang(10, 3));
        System.out.println("Pengurangan kedua: " + hitungKurang(3, 10));
    }
}
