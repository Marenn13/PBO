
import java.util.Scanner;


public class BujurSangkarMain {
    public static void main(String[] args) {
        BujurSangkar bujur1=new BujurSangkar ();
        BujurSangkar bujur2= new BujurSangkar ();
        
        Scanner inp= new Scanner (System.in);
        
        System.out.print("Masukkan sisi bur sangkar I :");
        bujur1.sisi=inp.nextInt ();
        
        System.out.print("Masukkan sisi bujur sangkar II:");
        bujur2.sisi = inp.nextInt ();
        
        System.out.println("Luas Bujur Sangkar dengan sisi = " +bujur1.sisi+ " adalah =" +bujur1.luas());
         System.out.println("Luas Bujur Sangkar dengan sisi = " +bujur2.sisi+ " adalah =" +bujur2.luas());
    }
    
}
