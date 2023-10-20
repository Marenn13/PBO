

package latihansub;

import java.util.Scanner;


public class LatihanSub {

    
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
         int pil ;
         double alas = 0,tinggi,luas;
        
           garisSatu ();
          System.out.println(" Menu ");
          garisDua ();
          System.out.println(" 1. Luas Segitiga");
          System.out.println(" 2. luas lingkaran");
          System.out.println(" 3. selesai");
          garisSatu ();
          System.out.print("pilihan anda  : ");
          pil=inp.nextInt ();
          switch (pil){
              case 1 :luasSegi3();
                  break;
              case 2 :
          }
         
    }
    private static void garisDua() {
        
      for (int i=0;i <= 30;i++){
            System.out.print("=");}
          System.out.println();  
    }

    private static void luasSegi3() {
         Scanner inp=new Scanner (System.in);
          System.out.print(" masukkan alas : ");
                   double alas=inp.nextDouble ();
                    System.out.print(" masukkan tinggi ");
                    double tinggi=inp.nextDouble ();
                    double luas= 0.5 * alas *tinggi;
                   System.out.println(""+luas);
                   System.out.println();
                   garisSatu ();   
    }
    private static void garisSatu() {
         for (int i=0;i <= 30;i++){
            System.out.print("-");}
          System.out.println(); 
    }

    private static void garis(int i, String string) {
        
    }
    }

    


