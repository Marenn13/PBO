package pbo6;

import java.util.Scanner;

public class Personalia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Pegawai :");
        int jumlahPegawai = input.nextInt();

        // Membuat objek Array untuk menyimpan data pegawai
        Pegawai2[] daftarPegawai = new Pegawai2[jumlahPegawai];

        // Memasukkan data Pegawai
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("\nData pegawai ke-" + (i + 1));
            System.out.print("Nama :");
            String nama = input.next();
            System.out.print("NIP :");
            String NIP = input.next();
            System.out.print("Alamat :");
            String Alamat = input.next();
            System.out.print("Umur :");
            int Umur = input.nextInt();
            System.out.print("Gaji Pokok :");
            double Gp = input.nextDouble();

            daftarPegawai[i] = new Pegawai2(nama, NIP, Alamat, Umur, Gp);
        }
        // menampilkan seluruh pegawai yang ada
        System.out.println("\nDaftar Pegawai :");
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("\nData pegawai ke-" + (i + 1));
            System.out.println("Nama :" + daftarPegawai[i].getNama());
            System.out.println("NIP  :" + daftarPegawai[i].getNIP());
            System.out.println("Alamat  :" + daftarPegawai[i].getAlamat());
            System.out.println("Umur :" + daftarPegawai[i].getUmur());
            System.out.println("Gaji Pokok :" + daftarPegawai[i].getGajiPokok());
        }
        // Menampilkan pegawai yang bergaji Pokok terbesar
        double gajiTerbesar = daftarPegawai[0].getGajiPokok();
        double gajiTerkecil = daftarPegawai[0].getGajiPokok();
        double TotalGaji = daftarPegawai[0].getGajiPokok();

        for (int i = 0; i < jumlahPegawai; i++) {
            if (daftarPegawai[i].getGajiPokok() > gajiTerbesar) {
                gajiTerbesar = daftarPegawai[i].getGajiPokok();
            }
            if (daftarPegawai[i].getGajiPokok() < gajiTerkecil) {
                gajiTerkecil = daftarPegawai[i].getGajiPokok();
            }
            TotalGaji += daftarPegawai[i].getGajiPokok();

        }
        double rataRataGaji = TotalGaji / jumlahPegawai;
        System.out.println("\nGaji Terbesar :" + gajiTerbesar);
        System.out.println("\nGaji Terkcel  :" + gajiTerkecil);
        System.out.println("Rata-rata Gaji Pokok :" + rataRataGaji);

    }

}
