import java.util.Scanner;

public class Kafe1_28 {
    public static void main(String[] args) {

        String namaPelanggan;
        Scanner sc=new Scanner(System.in);
        String member;
        boolean isMember;
        int jamKunjung;
        System.out.print("Masukkan nama pelanggan: ");
        namaPelanggan = sc.nextLine();
        System.out.print("Apakah pelanggan member? (y/n): ");
        member = sc.nextLine();
        isMember = member.equalsIgnoreCase("y");
        System.out.print("Masukkan jam kunjung: ");
        jamKunjung = sc.nextInt();
        menu(namaPelanggan, isMember, jamKunjung);
        sc.close();
    }

    public static void menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (jamKunjung >= 14 && jamKunjung < 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }
        System.out.println("== MENU RESTO KAFE ==");
        System.out.println("1. Kopi Hitam - Rp. 15.000");

        System.out.println("6. Mie Goreng - Rp. 10.000");
        System.out.println("======================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
        int jumlah =jumlahMenu();

        System.out.println("Jumlah menu: " + jumlah);
    }

    public static int jumlahMenu() {
        return 6;
    }
}