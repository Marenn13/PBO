/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikumpbo;

import java.util.Scanner;

public class pegawaiMain2 {

   
    public static void main(String[] args) {
        
                 Scanner key = new Scanner (System.in);
        Pegawai[] pgw2 = new Pegawai[0];
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jum = key.nextInt();
        pgw2 = new Pegawai[jum];
        for (int i = 0; i < jum; i++) {
            pgw2[i] = new Pegawai();
            System.out.print("Data Pegawai ke "+ (i+1)+"\n");
            System.out.print("Nama : ");
            pgw2 [i].setNama(key.next());
            System.out.print("NIP : ");
            pgw2 [i].setNIP(key.nextInt());
            System.out.print("Gaji Pokok : ");
            pgw2[i].setGaji_pokok(key.nextDouble());
            System.out.print("Jam Lembur : ");
            pgw2[i].setJamLembur(key.nextInt());
            System.out.print("Jumlah Anak : ");
            pgw2[i].setJumlah_anak(key.nextInt());      
        }
        System.out.println("===========================================================================================");
        System.out.println("| NO   | NAMA  |  NIP  |    GAPOK  |   LEMBUR/Jam  |   TUNJANGAN  |   GAJI TOTAL  |");
        System.out.println("===========================================================================================");
        for (int j = 0; j < pgw2.length; j++) {
            System.out.println(" " + (j+1)+ " \t"
                   + pgw2[j].getNama()+ " \t"
                   + pgw2[j].getNIP()+"\t"
                   + pgw2[j].getGaji_pokok()+"\t"
                   + pgw2[j].gajiLembur()+ " \t"
                    + pgw2[j].tunKel()+" \t"
                   + pgw2[j].gajiTotal()+"\t");  
        }
}
    
}
    
    


    
    


    
    

