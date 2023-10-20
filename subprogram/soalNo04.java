
package subprogram;

import java.util.Scanner;

public class soalNo04 {
     public static void main(String[] args) {
                 double keliling, luas, A, B, C, kelilingP;
        int absisA, ordinatA, absisB, ordinatB, absisC, ordinatC;
        Scanner S = new Scanner(System.in);
        System.out.print("Masukan absis   A : ");
        absisA =S.nextInt();
        System.out.print("Masukan ordinat A : ");
        ordinatA = S.nextInt();
        System.out.print("Masukan absis   B : ");
        absisB = S.nextInt();
        System.out.print("Masukan ordinat B : ");
        ordinatB = S.nextInt();
        System.out.print("Masukan absis   C : ");
        absisC = S.nextInt();
        System.out.print("Masukan ordinat C : ");
        ordinatC = S.nextInt();

        A = jarak(absisA, absisB,ordinatA , ordinatB);
        B = jarak(ordinatA,ordinatB , absisC, ordinatC);
        C = jarak(absisC,ordinatC ,absisA , absisB);
        System.out.println("Maka jarak antara absis X dengan ordinat Y = " + A);
                                                                                
        System.out.println("Maka jarak antara ordinat Y dengan titik X = " + B); 
                                                                                
        System.out.println("Maka jarak antara titik X dengan absis   X = " + C);
        keliling = kel(A, B, C);
        System.out.println("Maka keliling dari segitiga  = " + keliling);
        kelilingP = 0.5 * (keliling);
        luas = luasnya(kelilingP, A, B, C);
        System.out.println("Maka luas segitiga           = " + luas); 
                                                                                  
    }

    static double jarak(double absisA, double absisB, double ordinatA, double ordinatB) {

        double jaraknya = Math.sqrt(Math.pow(absisB - absisA, 2)) + Math.sqrt(Math.pow(ordinatB - ordinatA, 2));
                                                                                            
                                                                                          
        return jaraknya;
    }

    static double kel(double A, double B, double C) {
        double keliling = A + B + C;
        return keliling;
 
    }

    static double luasnya(double kelilingP, double A, double B, double C) {
        double luas = Math.sqrt((kelilingP) * (kelilingP - A) * (kelilingP - B) * (kelilingP - C));
        return luas;

    }

}

         
     

       
    

