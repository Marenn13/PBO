package pbo6;

import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa :");
        int jumlahMahasiswa = input.nextInt();

        // Membuat objek Array untuk menyimpan data pegawai
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Memasukkan data Pegawai
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  :");
            String N = input.next();
            System.out.print("NIM   :");
            String NM = input.next();
            System.out.print("Tanggal Lahir :");
            String Tl = input.next();
            System.out.print("Us1  :");
            double u1 = input.nextDouble();
            System.out.print("Us2  :");
            double U2 = input.nextDouble();
            System.out.print("Uas  :");
            double U = input.nextDouble();
            System.out.println("Nilai Final:"+daftarMahasiswa [i].HitFinal());
            System.out.println("Nilai      :"+daftarMahasiswa[i].Convert());

            // Membuat objek Mahasiswa dengan data yang diinputkan
            Mahasiswa mhs = new Mahasiswa(N, NM, Tl, u1, U2, U);

            // Menambahkan objek Mahasiswa ke array daftarMahasiswa
            daftarMahasiswa[i] = mhs;

        }

        // Menampilkan data Mahasiswa
        System.out.println("              \nDaftar Mahasiswa Informatika Peserta PBO\n");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("No.  NIM         Nama            Tgl Lahir       Us1     Us2     Uas     Final   Nilai");
        System.out.println("--------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-5d%-12s%-16s%-16s%-8.2f%-8.2f%-8.2f%-8.2f%s\n",
                    (i + 1),
                    daftarMahasiswa[i].getNIM(),
                    daftarMahasiswa[i].getNama(),
                    daftarMahasiswa[i].getUmur(),
                    daftarMahasiswa[i].getUs1(),
                    daftarMahasiswa[i].getUs2(),
                    daftarMahasiswa[i].getUas(),
                    daftarMahasiswa[i].HitFinal(),
                    daftarMahasiswa[i].Convert()
            );
        }
        // Menampilkan nilai tertinggi
        double maxNilai = 0;
        Mahasiswa mhsTertinggi = null;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].HitFinal() > maxNilai) {
                maxNilai = daftarMahasiswa[i].HitFinal();
                mhsTertinggi = daftarMahasiswa[i];
            }
        }

        System.out.println("\nNilai tertinggi");
        System.out.println("NIM  : " + mhsTertinggi.getNIM());
        System.out.println("Nama : " + mhsTertinggi.getNama());
        System.out.println("Tgl  : " + mhsTertinggi.getUmur());
        System.out.println("Final: " + mhsTertinggi.HitFinal());
        System.out.println("Nilai: " + mhsTertinggi.Convert());
    }

}

