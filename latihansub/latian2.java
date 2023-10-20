

package latihansub;

import java.util.Scanner;


public class latian2 {
    public static void main(String[] args) {

     Scanner inp=new Scanner (System.in);
          int pil;
        for (int i=0;i <= 30;i++){
            System.out.print("-");}
          System.out.println();
          System.out.println(" MENU");
          for (int j=0;j<=10;j++){
              System.out.print("=");}
          System.out.println();
          System.out.println(" 1. Hitung Luas Segitiga");
          System.out.println(" 2. Hitung Luas Lingkaran");
          System.out.println(" 3. Selesai");
          System.out.println();
          
          for (int k=0;k<=10;k++){
              System.out.print("-");}
            System.out.println();
            System.out.println(" masukkan pilihan anda"); 
            pil=inp.nextInt ();
            switch (pil){ 
                case 3 : System.out.println(" Terimakasih");
                         break;
                default: System.out.println(" Bukan Pilihan");}
            
    
}
    }
