
package Bangundatar;
import java.util.Scanner;
public class BangunDatarMain {
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     BangunDatar BD []=new BangunDatar [3];
     BD [0]=new SegiEmpat ();
     BD [1]=new SegiTiga ();
     BD [2]=new Lingkaran ();
     
     for (int i = 0; i< BD.length; i++){
         System.out.print("Bangun Datar Ke :" + (i +1));
         System.out.print("Bangun Datar (1. Segi Empat, 2. Segitiga, 3. Lingkaran) :");
         int Nm =input.nextInt();
         
         if (Nm == 1){
         SegiEmpat Sg= new SegiEmpat ();
             System.out.print("Panjang :");
             Sg = (SegiEmpat )BD [0];
             Sg.setPanjang(input.nextDouble());
             System.out.print("Lebar :");
             Sg.setLebar(input.nextDouble());
             System.out.println();   
         }else if (Nm == 2){
             SegiTiga St= new SegiTiga ();
             System.out.print("Sisi 1 :");
             St = (SegiTiga) BD[1];
             St.setSisi1(input.nextDouble());
             System.out.print("Sisi 2 :");
             St.setSisi2(input.nextDouble());
             System.out.print("Sisi 3 :");
             St.setSisi3(input.nextDouble());
             
             System.out.println();
         }
         else if (Nm==3){
             Lingkaran L= new Lingkaran ();
             System.out.print("Jari- Jari :");
             L = (Lingkaran)BD [2];
             L.setR(input.nextDouble());
             System.out.print("PHI      :");
             L.setPhi(input.nextDouble());
             
             System.out.println();
         }
         else {
             System.out.println("Kosong");
         }
     }
      System.out.println("================================================");
        System.out.println(" No.  Bangun Datar   Keliling          Luas   ");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < BD.length; i++) {
            System.out.printf("%-6d%-16s%-16.2f%-16.2f\n", (i + 1), BD[i].getClass().getSimpleName(), BD[i].HitKel(), BD[i].HitLuas());
        System.out.println("------------------------------------------------");
        }
    }
}
       
    
    

