package subprogram;

import java.util.Scanner;

public class soalNo03 {

    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        int pascal;
        System.out.print("Masukkan bilangan dari Segitiga Pascal : ");
        pascal = c.nextInt();

        for (int i = 0; i <= pascal; i++) { 

        for (int j = 0; j <= i; j++)
        System.out.print("" + combination(i, j) + "");
            
        System.out.println();

        }

    }

    static long faktorial(int m) {
        int hasFak = 1;
        if (m == 0) {
            return 1;
        } else 
          for (int a = 1; a <= m; a++) 
                hasFak = hasFak * a;
            
         return hasFak; //Kembalikan hasFak
    }//Akhir metode

      static long combination (int i, int j) {
        long hasil = (faktorial(i) / faktorial(j) * faktorial(i - j));
                                                                      
        return hasil;
    }

}


      


