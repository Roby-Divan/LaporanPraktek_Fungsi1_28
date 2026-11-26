
import java.util.Scanner;

public class BankSampah28 {

    static Scanner sc = new Scanner(System.in);
    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }
    static void tampilSetoran(double[] setoran) {
        System.out.println(" DATA SETORAN NASABAH ");

        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }
        return total;
    }

    static double hitungSaldo(double berat, double harga) {
        return berat * harga;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
        } else {
            double[] data = inputSetoran(n);
            tampilSetoran(data);
            System.out.println(" SALDO NASABAH ");
            double harga = 3000;
            for (int i = 0; i < data.length; i++) {
                double saldo = hitungSaldo(data[i], harga);
                System.out.printf("Nasabah ke-%d: Rp%.0f%n",(i + 1), saldo);
            }

            double total = totalSetoran(data);
            System.out.println("Total seluruh setoran: "+ total + " kg");
            int terbesar = nasabahTerbanyak(data);
            System.out.println("Nasabah dengan setoran terbesar: Nasabah ke-" + (terbesar + 1));
            System.out.println("Berat setoran terbesar: " + data[terbesar] + " kg");
        }

        sc.close();
    }
}
