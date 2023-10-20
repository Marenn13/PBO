package subprogram;

import java.util.Scanner;

public class soalNo02 {

    public static void main(String[] args) {

        int n, r, kombinasiNr;
        Scanner tombol = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        n = tombol.nextInt();
        System.out.print("Masukkan nilai r : ");
        r = tombol.nextInt();
        kombinasiNr = faktorial(n) / (faktorial(n - r) * faktorial(r));
        System.out.println("Jumlah kombinasi " + r + " elemen yang diambil dari " + r + " elemen adalah " + kombinasiNr);

    }

    private static int faktorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
