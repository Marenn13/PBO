package polymorf;
import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Pegawai pgw []=new Pegawai[3];
         pgw [0]= new Manajer ();
         pgw [1]= new Marketing ();
         pgw [2]= new Honorer ();
          
        for (int i = 0; i < pgw.length; i++) {
             System.out.println("\nData Pegawai ke-" + (i + 1));
             System.out.println("Status Pegawai (1. Manager, 2. Marketing, 3. Honorer)");
               int Status = input.nextInt();
               
               if (Status == 1) {
               Manajer mjr= new Manajer ();
                   System.out.print("Tunjangan :");
                    mjr= (Manajer) pgw[0];
                    mjr.setTunjanganjabatan(input.nextDouble());
                    System.out.print("Lembur :");
                    mjr.setLembur(input.nextDouble());
                  System.out.println();
            } else if (Status == 2) {
                   Marketing mark = new Marketing();
                   System.out.print("Bonus :");
                   mark = (Marketing) pgw [1];
                   mark.setBonus(input.nextDouble());
            
                    System.out.println();


            } else if (Status == 3) {
                Honorer hnr = new Honorer();
                   System.out.print("Gaji Lembur  :");
                   hnr = (Honorer) pgw [2];
                   hnr.setLemburan(input.nextDouble());
                   System.out.println();
              }else {
                   System.out.print("Kosong :");
            }
                System.out.print("Nama  :");
            pgw [i].setNama(input.next());
            System.out.print("NPP   :");
            pgw[i].setNpp(input.nextInt());
            System.out.print("Gaji Pokok :");
            pgw[i].setGapok(input.nextDouble ());
       }
        System.out.println("=================================================");
        System.out.format("| %-10s | %-6s | %-10s | %-10s | %n", "Nama", "NPP", "Jabatan", "Gaji Total");
        System.out.println("=================================================");
        for (int i = 0; i < pgw.length; i++) {
            String jb = pgw[i].getSatus();
            double gaTot = pgw[i].hitungGatot();
            System.out.format("| %-10s | %-6d | %-10s | %-10.2f | %n", pgw[i].getNama(),pgw[i].getNpp(), jb, gaTot);
            System.out.println("-------------------------------------------------");
            
         
        }
     
}
}
