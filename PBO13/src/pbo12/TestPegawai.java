package pbo12;

import java.util.Scanner;

public class TestPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Pegawai pgw[] = new Pegawai[3];
//        pgw[0] = new Manajer();
//        pgw[1] = new Marketing();
//        pgw[2] = new Honorer();
//        
        System.out.print("Masukkan Jumlah Pegawai :");
        int p = input.nextInt();
        Pegawai []pgw= new Pegawai [p];

        for (int i = 0; i < pgw.length; i++) {
            System.out.println("\nData Pegawai ke-" + (i + 1));
            System.out.println("Status Pegawai (1. Manager, 2. Marketing, 3. Honorer)");
            int Status = input.nextInt();

            if (Status == 1) {
                Manajer mjr = new Manajer();
                System.out.print("Tunjangan :");
                mjr.setTunjanganjabatan(input.nextDouble());
                System.out.print("Lembur: ");
                mjr.setLembur(input.nextDouble());
                pgw[i] = mjr;
            }else if (Status == 2) {
                Marketing mark = new Marketing();
                System.out.print("Bonus: ");
                mark.setBonus(input.nextDouble());
                pgw[i] = mark;
            }else if (Status == 3) {
                Honorer hnr = new Honorer();
                System.out.print("Gaji Lembur: ");
                hnr.setLemburan(input.nextDouble());
                pgw[i] = hnr;
            } else {
                System.out.print("Kosong: ");
            }
              System.out.print("Nama  :");
            pgw [i].setNama(input.next());
            System.out.print("NPP   :");
            pgw[i].setNpp(input.nextInt());
            System.out.print("Gaji Pokok :");
            pgw[i].setGapok(input.nextDouble ());
            //System.out.println("Email");
           
       }
        System.out.println("=================================================");
        System.out.format("| %-10s | %-6s | %-10s | %-10s | %-20s |%n", "Nama", "NPP", "Jabatan", "Gaji Total", "Email");
        System.out.println("=================================================");
        
        
       double totalGajiMarketing =0;
        
        for (int i = 0; i< pgw.length; i++){
            String jabatan = pgw[i].getSatus();
            double gajiTotal = pgw[i].hitungGatot();
            String email =  "";
            if (pgw[i] instanceof Email){
                email = ((Email )pgw[i]).getEmail();
            }
            System.out.format("| %-10s | %-6d | %-10s | %-10.2f | %-20s |%n", pgw[i].getNama(), pgw[i].getNpp(), jabatan,gajiTotal, email);
            System.out.println("----------------------------------------");
               
            
            // Perhitungan gaji total seluruh pegawai Marketing
             
            if (pgw[i]instanceof Marketing){
              totalGajiMarketing +=gajiTotal;  
            }
        }
        System.out.println("\nTotal Gaji Seluruh Pegawai Marketing :" + totalGajiMarketing);
        }
    }

