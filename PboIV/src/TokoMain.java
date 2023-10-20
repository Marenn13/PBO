
import java.util.Scanner;

public class TokoMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barang[] brg = new Barang[0];
        System.out.print("Jumlah Barang    :");
        int p = input.nextInt();

        brg = new Barang[p];

        for (int i = 0; i < p; i++) {
            brg[i] = new Barang();
            System.out.println("\nJenis Barang ke-" + (i + 1));
            System.out.print("Jenis Barang (P. Pakian, M. Makanan, O. Obat-obatan) :");
            String Jenis = input.next();

            if (Jenis.equalsIgnoreCase("P")) {
                Pakian pkn = new Pakian();
                System.out.print ("Ukuran               :");
                pkn.setUkuran(input.next());
                System.out.print ("Warna Dasar          :");
                pkn.setWarna(input.next());
                System.out.print ("Discount             : ");
                pkn.setDiscount(input.nextDouble());
                brg[i] = pkn;
                System.out.println();
            } else if (Jenis.equalsIgnoreCase("M")) {
                Makanan mkn = new Makanan();
                System.out.print("Daerah Asal            :");
                mkn.setDaerah_asal(input.next());
                System.out.print("Tanggal Kadaluwarsa    :");
                mkn.setKedaluarsa(input.next());
//
                brg[i] = mkn;
                System.out.println();

            } else if (Jenis.equalsIgnoreCase("O")) {
                Obat obt = new Obat();
                System.out.print ("Dosis                 :  ");
                obt.setDosis(input.next());
                System.out.print("Tanggal Kadaluwarsa    :");
                obt.setTglKedaluarsa(input.next());


                brg[i] = obt;
                System.out.println();
            } else {
                System.out.println("Kosong:");
            }

            System.out.print("Kode                      :");
            brg[i].setKodeBarang(input.next());
            System.out.print("Nama Barang               :");
            brg[i].setNama(input.next());
            System.out.print("Harga                     :");
            brg[i].setHarga(input.nextDouble());

        }
        System.out.println("\t                                   TOKO SUPER MURAH");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", "No.", "Kode", "Nama", " Harga", "Jenis", "Kadaluwarsa ", "Asal", "Discount ", "Dosis", "Ukuran", "Warna");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < p; i++) {
            String Jenis = "";
            String Kadaluwarsa = "";
            String Ukuran = "";
            String Warna = "";
            String Asal = "";
            double Disc = 0;
            String dosis = "";

            if (brg[i] instanceof Pakian) {
                Jenis = "Pakian";
                Ukuran = ((Pakian) brg[i]).getUkuran();
                Warna = ((Pakian) brg[i]).getWarna();
                Disc = ((Pakian) brg[i]).getDiscount();
            } else if (brg[i] instanceof Makanan) {
                Jenis = "Makanan";
                Kadaluwarsa = ((Makanan) brg[i]).getKedaluarsa();
                Asal = ((Makanan) brg[i]).getDaerah_asal();

            } else if (brg[i] instanceof Obat) {
                Jenis = "Obat";
                Kadaluwarsa = ((Obat) brg[i]).getTglKedaluarsa();
                dosis = ((Obat) brg[i]).getDosis();

            }
            System.out.printf("%-4s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", i + 1, brg[i].getKodeBarang(), brg[i].getNama(), brg[i].getHarga(), Jenis, Kadaluwarsa, Asal, Disc, dosis, Ukuran, Warna);
        }
    }
}
