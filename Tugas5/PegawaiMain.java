package pegawai;

import java.util.Scanner;

public class PegawaiMain {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Pegawai gaji = new Pegawai();

        System.out.print("Nama : ");
        gaji.nama = key.next();
        System.out.print("Alamat  : ");
        gaji.alamat = key.next();
        System.out.print("Jabatan : ");
        gaji.jabatan = key.nextInt();
        System.out.print("Nomor pokok : ");
        gaji.noPokok = key.next();
        System.out.print("1.CEO ");
        System.out.print("2.Manager ");
        System.out.print("Lainnya.Anggota " + " \n");
        System.out.print("Gaji Pokok : ");
        gaji.gaji = key.nextDouble();

        System.out.println("--------------------------------------------------------");
        System.out.println("\tNama  \tAlamat  \tJabatan  \tNomor Pokok  \tBonus  \tGaji Total\n  ");
        System.out.printf(" \t%s  \t%s  \t%d  \t%s  \t%.2f  \t%.2f\n "
        , gaji.nama, gaji.alamat, gaji.jabatan, gaji.noPokok, gaji.extra(), gaji.totalGaji());
        System.out.println("-------------------------------------------------------");
    }

}
