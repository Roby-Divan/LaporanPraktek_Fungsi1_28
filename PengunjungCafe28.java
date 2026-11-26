
public class PengunjungCafe28 {

    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {

        System.out.println("Nomor meja: " + nomorMeja);
        System.out.println("Daftar nama pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {

        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Andi");
        daftarPengunjung(3, "Doni", "Eti", "Fahmi");

    }
}
