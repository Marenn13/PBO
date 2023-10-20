
package subprogram;
public class SubProgram {
    public static void main(String[] args) {
        
// Menulis bintang( * ) memakai metode
        bintang (5);// 5 bintang
        bintang (7);// 7 bintang
        bintang(10);// 10 bintang
}
      public static void bintang(int n) {
      System.out.print( n +" bintang : ");
      for (int i = 1; i <= n; i++) System.out.print("*");
      System.out.println("");
        
    }
    
}
