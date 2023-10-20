
import java.util.Scanner;


public class mahasiswaMain {

    
    public static void main(String[] args) {
         mahasiswa nil1 = new mahasiswa();
        Scanner inp=new Scanner (System.in);
        
        System.out.print("Jumlah Mahasiswa :");
        int n= inp.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print("Nama Mahasiswa ke  "+i+" :");
            nil1.nama=inp.next();
            System.out.print("nilai UTS1 :");
            nil1.uts1=inp.nextDouble();
            System.out.print("nilai UTS2 :");
            nil1.uts2=inp.nextDouble();
            System.out.print("nilai UAS :");
            nil1.uas=inp.nextDouble();
            
            System.out.println("Nilai Mahasiswa ke " +i+ " adalah = " +nil1.HitFinal()+ " Dan nilai huruf = " +nil1.konversi());
        }

       
    
}
}
