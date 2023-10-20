
import java.util.Scanner;

public class ModifikasiMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Pegawai[] pgw = new Pegawai[0];
        System.out.print("Masukkan jumlah Pegawai :");
        int p = input.nextInt();
        
        pgw  =new Pegawai [p];
      
        for (int i = 0; i < p; i++) {
             System.out.println("\nData Pegawai ke-" + (i + 1));
             System.out.print("Status Pegawai (1. Manager, 2. Marketing, 3. Honorer)");
               int Status = input.nextInt();
               
               if (Status == 1) {
               Manajer mjr= new Manajer ();
                   System.out.print("Tunjangan :");
                   mjr.setTunjJabatan(input.nextDouble());
                   System.out.print("Gaji Lembur :");
                   mjr.setGajiLembur(input.nextDouble());
                   pgw[i] = mjr;
                 System.out.println();
            } else if (Status == 2) {
                   Marketing mark = new Marketing();
                   System.out.print("Bonus :");
                   mark.setBonus(input.nextDouble());
                   pgw[i] = mark;
                    System.out.println();

               

            } else if (Status == 3) {
                Honorer hnr = new Honorer();
                   System.out.print("Gaji Lembur  :");
                   hnr.setGajiLembur(input.nextDouble());

                   pgw[i] = hnr;
                   System.out.println();
              }else {
                   System.out.print("Kosong :");
            }
           
            System.out.print("Nama  :");
            pgw [i].setNama(input.next());
            System.out.print("NPP   :");
            pgw[i].setNpp(input.nextInt());
            System.out.print("Gaji Pokok :");
            pgw[i].setGaPok(input.nextDouble());

           

         
        }
        System.out.println("DATA PEGAWAI PERUSAHAAN YIC (YES INDONESIAN CAN)\n");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-4s %-15s %-15s %-15s %-15s %-15s %-15s\n","No.",   "NPP",  " Nama",     "Status ",     "GajiPokok " ,   "TunjanganLain* ",    " GajiTotal");
        System.out.println("--------------------------------------------------------------------------------------");
        

        for (int i = 0; i < p; i++) {
            String Status = "";
            double Tunjangan = 0;
            double Gajitotal=0;
   
    
    if(pgw[i] instanceof Manajer) {
       Status = "Manajer";
       Tunjangan = ((Manajer )pgw [i]).getTunjJabatan()+ ((Manajer )pgw [i]).getGajiLembur();
       Gajitotal = ((Manajer)pgw [i]).Totalgaji();
        
    } 
    else if(pgw[i] instanceof Marketing) {
        Status = "Marketing";
        Tunjangan =  ((Marketing)pgw [i]).getBonus();
        Gajitotal=((Marketing) pgw[i]).TotalGaji();
      
    }
    else if(pgw[i] instanceof Honorer) {
        Status = "Honorer";
        Tunjangan = ((Honorer)pgw[i]).getGajiLembur();
        Gajitotal= ((Honorer)pgw[i]).TotalGaji();
       
    }
    System.out.printf("%-4s %-15s %-15s %-15s %-15s %-15s %-15s\n", i+1,pgw [i].getNpp(), pgw [i].getNama(),Status,pgw[i].getGaPok(), Tunjangan, Gajitotal);
}
    }
}